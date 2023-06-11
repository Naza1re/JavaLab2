

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.next());
        double y1 = Double.parseDouble(scanner.next());
        double x2 = Double.parseDouble(scanner.next());
        double y2 = Double.parseDouble(scanner.next());
        double x3 = Double.parseDouble(scanner.next());
        double y3 = Double.parseDouble(scanner.next());
        Point A = new Point(x1, y1);
        Point B = new Point(x2, y2);
        Point C = new Point(x3, y3);
        Treeangle ABC = new Treeangle(A, B, C);
        Point O = Treeangle.IntersectionPoint(ABC);
        System.out.print(O.getX());
        System.out.print(" ");
        System.out.print(O.getY());
    }
}