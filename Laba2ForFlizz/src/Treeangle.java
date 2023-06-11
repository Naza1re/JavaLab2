public class Treeangle {
    private Point A;
    private Point B;
    private Point C;

    public Treeangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Point getA() {
        return this.A;
    }

    public Point getB() {
        return this.B;
    }

    public Point getC() {
        return this.C;
    }

    public static Point IntersectionPoint(Treeangle ABC) {
        double a1 = ABC.getC().getX() - ABC.getB().getX();
        double a2 = ABC.getC().getX() - ABC.getA().getX();
        double b1 = ABC.getC().getY() - ABC.getB().getY();
        double b2 = ABC.getC().getY() - ABC.getA().getY();
        double c1 = ABC.getA().getX() * a1 + ABC.getA().getY() * b1;
        double c2 = ABC.getB().getX() * a2 + ABC.getB().getY() * b2;
        Point in_sec_p = Kramer(a1, b1, c1, a2, b2, c2);
        return in_sec_p;
    }

    public static Point Kramer(double a1, double b1, double c1, double a2, double b2, double c2) {
        double det = a1 * b2 - a2 * b1;
        double det1 = c1 * b2 - c2 * b1;
        double det2 = a1 * c2 - a2 * c1;
        double x = det1 / det;
        double y = det2 / det;
        Point point = new Point(x, y);
        return point;
    }
}


