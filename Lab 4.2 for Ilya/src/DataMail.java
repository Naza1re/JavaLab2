import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DataMail {
    private ArrayList<infmail> DataMail = new ArrayList<>();
    private final String fileName;

    public DataMail(String fileName) {
        DataMail = getCsvRecords(fileName);
        this.fileName = fileName;
    }

    public static void printCsv(String fileCsvPath) {
        try {
            Reader reader = new FileReader(fileCsvPath);
            BufferedReader buffReader = new BufferedReader(reader);
            String line;

            while ((line = buffReader.readLine()) != null) {
                System.out.println("record: " + line);
            }
            buffReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }

    public ArrayList<infmail> getCsvRecords(String fileCsvPath) {
        try {
            Reader reader = new FileReader(fileCsvPath);
            BufferedReader buffReader = new BufferedReader(reader);
            String line;

            this.DataMail = new ArrayList<>();

            while ((line = buffReader.readLine()) != null) {
                try {
                    infmail d = new infmail(
                            line.split(";")[0].replace("\"", ""),
                            line.split(";")[1].replace("\"", ""),
                            Time.getDateAndTime2(line.split(";")[2].replace("\"", "")),
                            Integer.parseInt(line.split(";")[3].replace("\"", ""))
                    );

                    DataMail.add(d);
                } catch (ParseException e) {
                    System.out.println("Ошибка");
                }
            }
            buffReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
        return this.DataMail;
    }

    public void addRecord() throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите адрес отправителя: ");
        String SendMail = in.nextLine();
        System.out.print("Введите адрес получателя: ");
        String getMail = in.nextLine();
        System.out.print("Введите дату и время отправки письма (yyyy-MM-dd HH:mm:ss): ");
        String dateandtime = in.nextLine();
        System.out.print("Введите объём письма в байтах: ");
        String MailBites = in.nextLine();
        this.DataMail.add(new infmail(
                SendMail,
                getMail,
                Time.getDateAndTime2(dateandtime),
                Integer.parseInt(MailBites)
        ));
        this.writeRecordsInFile(fileName);
    }

    private void writeRecordsInFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (infmail callData : this.DataMail) {
                writer.write(callData.toString());
            }
            writer.close();


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteRecordByIndex(int index) {

        if (index > DataMail.size()) {
            System.out.println("ОШИБКА: такой записи нет");
            return;
        }

        DataMail.remove(index);
        this.writeRecordsInFile(fileName);
    }

    public void editRecordByIndex(int index) throws ParseException {
        if (index > DataMail.size()) {
            System.out.println("ОШИБКА: такой записи нет");
            return;
        }
        Scanner in = new Scanner(System.in);

        System.out.println("Введите новые данные для нужных полей (пропустите ввод, если хотите оставить поле без изменений): ");

        System.out.print("Введите адрес отправителя: ");
        String SendMail = in.nextLine();
        System.out.print("Введите адрес получателя: ");
        String getMail = in.nextLine();
        System.out.print("Введите дату и время отправки письма (yyyy-MM-dd HH:mm:ss): ");
        String dateandtime = in.nextLine();
        System.out.print("Введите объём письма в байтах: ");
        String MailBites = in.nextLine();

        infmail temp = new infmail(
                SendMail.isEmpty() ? DataMail.get(index).getSendMail() : SendMail,
                getMail.isEmpty() ? DataMail.get(index).getGetMail() : getMail,
                dateandtime.isEmpty() ? DataMail.get(index).getDateandtime() : Time.getDateAndTime2(dateandtime),
                MailBites.isEmpty() ? DataMail.get(index).getMailBites() : Integer.parseInt(MailBites)
        );
        DataMail.set(index, temp);
        this.writeRecordsInFile(fileName);
    }

    public void task() throws ParseException {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя почты для поиска: ");
        String mail = in.nextLine();

        System.out.print("Введите начальный промежуток времени (yyyy-MM-dd HH:mm:ss): ");
        String time1 = in.nextLine();
        System.out.print("Введите конечный промежуток времени (yyyy-MM-dd HH:mm:ss): ");
        String time2 = in.nextLine();

        ArrayList<infmail> taskList = new ArrayList<>();
        DataMail = getCsvRecords(fileName);
        for (infmail item : DataMail) {
            if ((item.getGetMail().equals(mail) || item.getSendMail().equals(mail)) && //проверка на соответствие номера и времени звонка временному интервалу
                    item.getDateandtime().compareTo(Time.getDateAndTime2(time1)) >= 0 &&
                    item.getDateandtime().compareTo(Time.getDateAndTime2(time2)) <= 0) {
                taskList.add(item);
            }
        }

        if (!taskList.isEmpty()) {
            taskList.sort(new DateAndTimeComparator());
            int totalIncomingBites = 0;
            int totalOutgoingBites = 0;
            for (infmail item : taskList) {
                if (item.getGetMail().equals(mail)) {
                    System.out.print("Входящее письмо: ");
                    totalIncomingBites += item.getMailBites();
                } else {
                    System.out.print("Исходящее письмо: ");
                    totalOutgoingBites += item.getMailBites();
                }
                System.out.print(item.toString());
            }
            System.out.println("Общее количество входящего трафика: " + totalIncomingBites);
            System.out.println("Общее количество исходящего трафика: " + totalOutgoingBites);
        } else {
            System.out.println("В указанный период времени данный абонент не участвовал в разговоре");
        }
    }
}
