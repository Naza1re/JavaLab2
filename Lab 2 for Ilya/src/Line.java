
public class Line {
    private double a;
    private double b;
    private double c;

    public Line(Segment segment) {
        this(segment.getMiddlePoint(), new Vector(new Segment(segment.getMiddlePoint(), segment.getBegin())));
    }

    public Line(Point p, Vector n) {
        a = n.x;
        b = n.y;
        c = -(a * p.getX() + b * p.getY());
    }
    public Line(Point p1, Point p2) {
        a = p2.getY() - p1.getY();
        b = p1.getX() - p2.getX();
        c = -a * p1.getX() - b * p1.getY();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return "(" + a + ")x + (" + b + ")y + (" + c + ") = 0";
    }
}
