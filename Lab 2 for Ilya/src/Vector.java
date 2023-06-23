
public class Vector extends Point {

    public Vector(Segment segment) {
        super(segment.getBegin().getX() - segment.getEnd().getX(),
                segment.getBegin().getY() - segment.getEnd().getY());
    }


    public double length() {
        return Math.hypot(x, y);
    }
}
