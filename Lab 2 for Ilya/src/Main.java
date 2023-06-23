import java.util.Scanner;

public class Main {
    public static double[] okr(Point A,Point B, double r){
        double d,h,x1,x2,y1,y2;
        double[] mass = new double[4];
        d = Math.sqrt(Math.pow((A.getX()-B.getX()),2)+Math.pow((A.getY()- B.getY()),2));
        h = Math.sqrt(Math.pow(r,2)- Math.pow((d/2),2));
        x1 = A.getX() + ((B.getX()-A.getX())/2) + (h*( B.getY()-A.getY())/d);
        y1 = A.getY() + (( B.getY()-A.getY())/2) - (h * (B.getX() -A.getX())/d);
        x2 = A.getX() + ((B.getX()-A.getX())/2) - (h*( B.getY()-A.getY())/d);
        y2 = A.getY() + (( B.getY()-A.getY())/2) + (h * (B.getX() -A.getX())/d);

        mass[0]= x1;
        mass[1] = y1;
        mass[2] = x2;
        mass[3] = y2;

        return mass;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1;
        double y1 ;
        double x2 ;
        double y2 ;
        double r ;

        System.out.println("Введите x1 : " );
        x1 = in.nextDouble();

        System.out.println("Введите y1 : " );
        y1 = in.nextDouble();

        System.out.println("Введите x2 : " );
        x2 = in.nextDouble();

        System.out.println("Введите y2 : " );
        y2 = in.nextDouble();

        System.out.println("Введите r : " );
        r = in.nextDouble();

        Point A = new Point(x1,y1);
        Point B = new Point (x2,y2);
        double[] mass = okr(A,B,r);
        Point C = new Point(mass[0],mass[1]);
        Point D = new Point(mass[2],mass[3]);
        System.out.println("Координаты 1-ой окружности: " + C.toString() +
                "\n" + "Координаты 2-ой окружности: " +  D.toString());
    }
}
