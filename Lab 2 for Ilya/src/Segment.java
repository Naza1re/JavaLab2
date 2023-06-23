
public class Segment {
    private Point begin;
    private Point end;


    public Segment(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }


    public Point getBegin() {
        return begin;
    }


    public Point getEnd() {
        return end;
    }


    public Point getMiddlePoint() {
        return new Point((begin.getX() + end.getX()) / 2, (begin.getY() + end.getY()) / 2);
    }


    public double length() {
        return new Vector(this).length();
    }
}
