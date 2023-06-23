package lab2;


public class Main {
    public static StringBuilder resh(StringBuilder str3){
        int k =0;
        StringBuilder str =str3;
        int s= str.length();
        for (int i =0; i<s; i++){
            String str1 = "{";
            String str2 = "}";

            if (str.charAt(i)=='{' && str.charAt(i+1) == '}' ) {


                k=i+1;
                String s1 = Integer.toString(k);
                int f=s1.length();
                s+=f;

                str1 = str1 + k + str2;
                // System.out.println(str1);
                str.replace(i, i + 2, str1);
            }
        }
        return str;
    }
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("ну что {} рассказывай {} как оно {}");

        str = resh(str);
        System.out.println(str);


    }
}
