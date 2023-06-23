package lab4;

public class Main {

    public static void main(String[] args) {
        String[] str = {"прПРАеМ","пржддмеАЙ","прЕфе"};
        String substr1="пр";
        String substr2="е";
        int n = str.length;
        QuickSort<String> sort1 = new QuickSort<>();
        SelectionSort<String> sort2 =new SelectionSort<>();
        for (int i=0;i<n; i++){
            System.out.print(str[i] + "; ");
        }
        System.out.println();
        System.out.println("По части строки");
        StrComparator1 part = new StrComparator1(substr1,substr2);
        sort1.sort(str,part);
        for (String s : str) {
            System.out.print(s + "; ");
        }
        System.out.println(part.getCounter());
        System.out.println();
        System.out.println("по количеству маленьких букв");
        StrComparator2 part1 =new StrComparator2();
        sort2.sort(str,part1);
        for (String s : str) {
            System.out.print(s + "; ");
        }
        System.out.print(part1.getCounter());
    }
}
