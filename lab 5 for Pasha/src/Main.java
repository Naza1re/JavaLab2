import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int size;
        ArrayList array = new ArrayList<>();

        do {
            System.out.println("Что делаем");
            System.out.println("1)заполнение массива случайным образом");
            System.out.println("2)ввод элементов массива с клавиатуры");
            System.out.println("3)вывод элементов массива на экран");
            System.out.println("4)обработка массива");
            System.out.println("5)изменение массива");
            System.out.println("6)выход из программы");
            x = in.nextInt();


            switch (x){
                case 1:

                    System.out.println("Введите размер массива");
                    size = in.nextInt();
                    for(int i = 0;i<=size;i++){
                        int f =  (int) Math.round(Math.random()*100);
                        array.add(f);


                    }
                    break;
                case 2:
                    System.out.println("Введите размер массива");
                    size = in.nextInt();
                    int v;
                    for (int i = 0;i<size;i++){
                        System.out.println("Индекс "+(i+1));
                        v = in.nextInt();
                        array.add(v);
                    }

                    break;
                case 3:


                    printlist(array);

                    break;
                case 4:


                    System.out.println(lastsin(array));

                    break;
                case 5:
                    justnumber(array);

                    break;
                case 6:
                    System.exit(1);
                    break;

            }

        }while (true);


    }

    public static double lastsin(List list) {
        int n = 0;
        double sum = 0;

        for(int i = 0;i<list.size();i++){
            if(Math.sin((Integer) list.get(i))<0) {

                System.out.println(list.get(i));
                n = i;
                break;
            }

        }

        for(int i = n;i<list.size();i++){
            System.out.println();
            sum += (Integer)list.get(i);

        }

      return sum;

    }

    public static void printlist(ArrayList list) {

        Iterator iterator = list.iterator();// Итератор стоит во главе коллекций, и позволяет своими методами перебирать коллекцию

        while (iterator.hasNext()){
            System.out.print("[" + iterator.next()+ "]" );
        }


    }
    static void justnumber(ArrayList list){

        for(int i = 0;i<list.size();i++){

            String n = String.valueOf(list.get(i));

            if(!n.contains("4") && !n.contains("6") && !n.contains("8") && !n.contains("9")){
                list.remove(i);
                i--;
            }


        }
    }
}