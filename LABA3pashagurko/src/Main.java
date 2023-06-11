import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

Scanner in = new Scanner(System.in);

double x1,y1,x2,y2,x3,y3;

        System.out.println("Введите кооординаты первой точки ");
        x1 = in.nextDouble();

        y1 = in.nextDouble();

        System.out.println("Введите кооординаты второй точки ");

        x2 = in.nextDouble();
        y2 = in.nextDouble();

        System.out.println("Введите кооординаты третей точки ");

        x3 = in.nextDouble();
        y3 = in.nextDouble();



        Point A = new Point(x1,y1);   // создание экземпляра класса
        Point B = new Point(x2,y2);   // создание экземпляра класса
        Point C = new Point(x3,y3);   // создание экземпляра класса


        Treeangle treeangle = new Treeangle(A,B,C); // создание экземпляра класса


        System.out.println("Точка пересечения пересечения по X : " + treeangle.MidlX(A,B,C));
        System.out.println("Точка пересечения пересечения по Y : " + treeangle.MidlY(A,B,C));

        System.out.println("Длинна стороны AB : "+ treeangle.SideAB(A,B,C));
        System.out.println("Длинна стороны BC : "+ treeangle.SideBC(A,B,C));
        System.out.println("Длинна стороны CB : "+ treeangle.SideCA(A,B,C));

        System.out.println("Периметр треугольника равен : "+treeangle.PER(A,B,C));


















    }
}