public class Main {
    public static int Factorial(int a)
    {
        int b = 1;

        for (int i = 1; i <= a; i++)
        {
            b = b * i;
        }
        return b;
    }

    public static double Cos(double x)
    {
        return Math.cosh(x);
    }

    public static double Sum(double x, double h)
    {
        int i=0;
        double res=0;
        double sum=0;
        do
        {
            res = Math.pow(x,2*i)/Factorial(2*i);
            sum+=res;
            i++;
        }
        while (Math.abs(res)>=h);
        return sum;
    }

    public static void main(String[] args)
    {
        double x=Double.parseDouble(args[0]);
        double h=Double.parseDouble(args[1]);

        System.out.println(Sum(x,h));
        System.out.println(Cos(x));
    }

}
