import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TreeangleTest {


    @Test
    public void midlX() {
        Point p1 = new Point(2,3);
        Point p2 = new Point(4,5);
        Point p3 = new Point(7,8);
        Treeangle treeangl = new Treeangle(p1,p2,p3);
        Assertions.assertEquals(4.333333333333333,treeangl.MidlX(p1,p2,p3) ,0.01);




    }

    @Test
    public void midlY() {
        Point p1 = new Point(2,3);
        Point p2 = new Point(4,5);
        Point p3 = new Point(7,8);
        Treeangle treeangl = new Treeangle(p1,p2,p3);
        Assertions.assertEquals(5.333333333333333,treeangl.MidlY(p1,p2,p3) ,0.01);


    }
}