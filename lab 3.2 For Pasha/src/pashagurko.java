import java.util.Scanner;

public class pashagurko
{
    public static StringBuilder del(StringBuilder s1) {
        int start = 0;
        boolean flag = true;
        int cnt = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '('  && flag) {
                start = i;
                flag = false;
            }
            if (s1.charAt(i) == ')'  && !flag) {
                flag = true;
                cnt++;
                s1.replace(start, i+1 ,"["+Integer.toString(cnt)+"]");
            }
        }
        return s1;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        StringBuilder s1 = new StringBuilder(in.nextLine());
        System.out.print("Преобразованная строка: " + del(s1));


    }
}

