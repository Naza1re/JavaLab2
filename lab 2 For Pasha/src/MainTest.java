import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class MainTest {
    @Test
    public void Test1() {
        Point p1 = new Point(2,2);
        Point p2 = new Point(10,2);
        Point p3 = new Point(6,10);
        Point p4 = new Point(1,1);
        Treeangel line = new Treeangel(p1,p2,p3,p4);
        Assertions.assertEquals(line.belong(p1,p2,p3,p4),"Точка не принадлежит");
    }
    @Test
    public void Test2() {
        Point p1 = new Point(2,2);
        Point p2 = new Point(10,2);
        Point p3 = new Point(6,10);
        Point p4 = new Point(4 ,3);
        Treeangel line = new Treeangel(p1,p2,p3,p4);
        Assertions.assertEquals(line.belong(p1,p2,p3,p4),"Точка принадлежит");
    }
    @Test
    public void Test3() {
        Point p1 = new Point(2,2);
        Point p2 = new Point(10,2);
        Point p3 = new Point(6,10);
        Point p4 = new Point(11,1);
        Treeangel line = new Treeangel(p1,p2,p3,p4);
        Assertions.assertEquals(line.belong(p1,p2,p3,p4),"Точка не принадлежит");
    }





}