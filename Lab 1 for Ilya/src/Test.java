

import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void test1(){
        assertEquals(-0.4161552028218696,Calculation.Sum(2,0.001),0.001);
    }
    @org.junit.Test
    public void test2(){
        assertEquals(0.5402777777777777,Calculation.Sum(1,0.01),0.001);
    }
    @org.junit.Test
    public void test3(){
        assertEquals(-1,Calculation.lab1(2,6,1),0.001);
    }
    @org.junit.Test
    public void test4(){
        assertEquals(20.5,Calculation.lab1(6,1,8),0.001);
    }

}