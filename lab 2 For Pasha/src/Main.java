import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3,x,y;

        System.out.println("Введите координаты первой точки треугольника ");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        System.out.println("Введите координаты второй точки треугольника");
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        System.out.println("Введите координаты третей точки треугольника");
        x3 = in.nextDouble();
        y3 = in.nextDouble();
        System.out.println("Введтеь координат ы исследуемой точки");
        x = in.nextDouble();
        y = in.nextDouble();
        Point A = new Point(x1,y1);
        Point B = new Point(x2,y2);
        Point C = new Point(x3,y3);
        Point X = new Point(x,y);
        Treeangel H = new Treeangel();
        System.out.println(H.belong(A,B,C,X));

    }
}