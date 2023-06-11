import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x;
        int size;
        List<Object> numbers = new ArrayList<>();

        do {
            System.out.println("Выберите действие которое хотите сделать:\n1)Заполнение массива случайным образом");
            System.out.println("2)Ввод элементов массива с клавиатуры\n3)Вывод элементов массива на экран\n4)Обработка массива");
            System.out.println("5)Изменение массива\n6)Выход из программы");
            x = in.nextInt();

            switch (x) {
                case 1 -> {
                    System.out.println("Введите количество элементов массива");
                    size = in.nextInt();
                    for (int i = 0; i <= size; i++) {
                        int f = (int) Math.round(Math.random() * 10);
                        numbers.add(f);

                    }
                }
                case 2 -> {
                    System.out.println("Введите количество элементов массива");
                    size = in.nextInt();
                    for (int i = 0; i < size; i++) {

                        System.out.print("Введите элемент коллекции под номером " + (i + 1) + ":");
                        numbers.add(in.nextInt());
                    }
                }
                case 3 -> {
                    print(numbers);
                    System.out.println(" ");
                }
                case 4 -> {
                   int count = 0;
                   for(int i=0;i<numbers.size();i++){
                       if(numbers.size() == 0) {
                           System.out.println("Ваш массив пустой ");

                       }
                   }
                        System.out.println("Cуммв эллементов От первого элемента синус которого положителен : "+ FirstSin(numbers));

                }
                case 5 -> {
                    if(numbers.size()==0){
                        System.out.println("Ваш массив пуст");
                    }
                    else

                        deletechet(numbers);
                }

                case 6 -> {
                    System.out.print("Вы вышли из программы");
                    System.exit(2);
                }
                default -> {
                }
            }
        } while (true);

    }

    public static void print(List<Object> arr) {
        for (Object o : arr) {
            System.out.print("[" + o + "]");
        }
    }

    public static List deletechet(List list) {


        for(int i = 0;i<list.size();i++) {
            int a = (Integer) list.get(i);

            String b = Integer.toString(a);
            System.out.println(b.length());


            ArrayList<Integer> num = null;
            for (int j = 0; j < b.length()-1; j++) {
                num = new ArrayList<>();
                String c = String.valueOf(b.charAt(j));
                int d = Integer.valueOf(c);
                num.add(d);


            }
            for (Object o : num) {
                System.out.print("[" + o + "]");
            }
            if (isArifmetical(num)) {
                list.remove(i);

            }


        }


        return  list;
    }
    public static boolean isArifmetical(List list){
        if(list.size()<2){
            return false;
        }
        int difference = (Integer)list.get(1)-(Integer)list.get(0);


        return IntStream.range(0,list.size()-1).allMatch(i -> (Integer)list.get(i+1)-(Integer) list.get(i)==difference);

    }


    public static int FirstSin(List list){
        int index =  0;
        int sum = 0;
        for (int i = 0;i<list.size();i++) {
            if ((Math.sin(Math.round((Integer)list.get(i))) > 0)) {
                index = i;
                break;
            }

        }
        for(int i = index;i<list.size();i++){
            sum += Math.round((Integer) list.get(i));
        }
        return sum;
    }

}