import java.util.Scanner;

public class Main {
    public static StringBuilder del(StringBuilder s1) {
        int start = 0;
        boolean flag = true;
            for (int j = 0; j < s1.length() - 1; j++) {
                    if (s1.charAt(j) == '.' && s1.charAt(j + 1) == '.' && flag) {
                        start = j;
                        flag = false;
                    }
                    if (s1.charAt(j) == '.' && !flag) {
                        flag = true;
                        for(char k = 'a';k<='я';k++) {
                            String g = charToString(k);
                        s1.replace(start, j + 3, g);
                    }
                }
                }



        return s1;
    }
    public static String charToString(char ch) {
        return String.valueOf(ch);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        StringBuilder s1 = new StringBuilder(in.nextLine());
        System.out.print("Преобразованная строка: " + del(s1));
    }
}

