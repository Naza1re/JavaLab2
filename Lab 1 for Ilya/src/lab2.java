
public class lab2 {

    public static void main(String[] args)
    {
        double x=Double.parseDouble(args[0]);
        double h=Double.parseDouble(args[1]);

        System.out.println(Calculation.Sum(x,h));
        System.out.println(Calculation.cosx(x));
    }
}
