import static java.lang.Math.pow;
public class Calculation {

    public static double lab1(double a,double b,double c){
        return 3*c-((a+b)/2);
    }

    public static int Factorial(int a)
    {
        int b = 1;

        for (int i = 1; i <= a; i++)
        {
            b = b * i;
        }
        return b;
    }
    public static double cosx(double x)
    {
        return Math.cos(x);
    }
    public static double Sum(double x, double h)
    {
        int i=0;
        double res=0;
        double sum=0;
        do
        {
            res = pow(-1,i)*(pow(x,2*i)/Factorial(2*i));
            sum+=res;
            i++;
        }
        while (Math.abs(res)>=h);
        return sum;
    }


}
