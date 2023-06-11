import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        args = new String[]{"jfsdhfkjs", "jodlkf", "iojo"};
        System.out.println(args);
        GnomeSort<String> c1 = new GnomeSort<>();
        c1.sort(args,new Firstind("d"));
        System.out.println(Arrays.toString(args));

        SelectSort<String> c2 = new SelectSort<>();
        c2.sort(args,new Count("o"));
        System.out.println(Arrays.toString(args));
    }
}




