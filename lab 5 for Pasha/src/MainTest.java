import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test1 (){
        ArrayList list = new ArrayList<>();
        list.add(12);
        list.add(312);
        list.add(76);
        list.add(31);
        list.add(123);
        list.add(45);
        list.add(0);
        Main.justnumber(list);
        int size = list.size();
        Assert.assertEquals(2,size);




    }

    @Test
    public void test2 (){
        ArrayList list = new ArrayList<>();
        list.add(12);
        list.add(312);
        list.add(3126);
        list.add(31);
        list.add(312);
        list.add(45);
        list.add(1);
        Main.justnumber(list);
        int size = list.size();
        Assert.assertEquals(2,size);




    }



}