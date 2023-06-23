import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
class MainTest {

    @Test
    public void test1(){
        double[] mass = {2.822875655532295,0.17712434446770486,0.17712434446770486,2.822875655532295};
        Point A = new Point(1,1);
        Point B = new Point(2,2);
        assertArrayEquals(mass, Main.okr(A,B,2), 0.00000000001);
    }
    @Test
    public void test2(){
        double[] mass ={3.5615528128088303,-0.5615528128088303,-0.5615528128088303,3.5615528128088303};
        Point A = new Point(1,1);
        Point B = new Point(2,2);
        assertArrayEquals(mass, Main.okr(A,B,3), 0.00000000001);
    }
    @Test
    public void test3(){
        double[] mass ={3.822875655532295, 2.177124344467705,1.1771243444677049, 4.822875655532295};
        Point A = new Point(2,3);
        Point B = new Point(3,4);
        assertArrayEquals(mass, Main.okr(A,B,2), 0.00000000001);
    }


}