import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    private static boolean isExistFile(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }
    public static void main(String[] args) throws ParseException, IOException{
        Scanner in = new Scanner(System.in);
        String fileName = "text.csv";

        if (!isExistFile(fileName)) {
            File file = new File(fileName);
            file.createNewFile();
        }
DataMail p = new DataMail(fileName);

        System.out.println("Для работы с программой введите команды: ");

        System.out.println("0 - завершить работу");
        System.out.println("1 - показать содержимое файла CSV");
        System.out.println("2 - добавить запись");
        System.out.println("3 - удалить запись по индексу");
        System.out.println("4 - редактировать запись по индексу");
        System.out.println("5 - Задание");

        System.out.print("Ввод: ");
       int opt = 1;
       while (opt!= 0) {

        try{
            opt = in.nextInt();
        }
        catch(NumberFormatException e){
            opt= 100;
        }

            switch (opt) {
                case 0: {
                    System.out.println("Завершение работы");
                    break;
                }

                case 1: {
                    DataMail.printCsv(fileName);
                    break;
                }

                case 2: {
                    System.out.println("");
                    p.addRecord();
                    break;
                }

                case 3: {
                    System.out.print("Какую запись удалить: ");
                    int index = in.nextInt();
                    p.deleteRecordByIndex(index);
                    break;
                }

                case 4: {
                    System.out.print("Какую запись редактировать: ");
                    int index = in.nextInt();
                    p.editRecordByIndex(index);
                    break;
                }

                case 5: {
                    p.task();
                    break;
                }

                default: {
                    break;
                }
            }
        }
    }
}



