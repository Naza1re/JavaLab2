package lab1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] str = {"прПРАеМ","пржддмеАЙ","прЕфе"};
        String substr1="пр";
        String substr2="е";
        int n = str.length;
        for (int i=0;i<n; i++){
            System.out.print(str[i] + "; ");
        }
        System.out.println();
        System.out.println("По части строки");
        StrComparator1 part = new StrComparator1(substr1,substr2);
        Arrays.sort(str,part);
        for (String s : str) {
            System.out.print(s + "; ");
        }
        System.out.println(part.getCounter());
        System.out.println();
        System.out.println("по количеству маленьких букв");
        StrComparator2 part1 = new StrComparator2();

        Arrays.sort(str,part1);
        for (String s : str) {
            System.out.print(s + "; ");
        }
        System.out.println(part1.getCounter());
    }
}