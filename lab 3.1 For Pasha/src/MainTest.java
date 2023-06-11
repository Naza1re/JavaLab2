
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MainTest {

    @Test
    public void test1()
    {
        String[] args = {"doma","corovachka","ogorod"};
        String abc = "o";
        Lastind c1 = new Lastind(abc);
        Arrays.sort(args,c1);
        String[] test = {"doma", "corovachka","ogorod"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }

    @Test
    public void test2()
    {
        String[] args = {"corova","ogorod", "dom"};
        String abc = "o";
        Length c1 = new Length(abc);
        Arrays.sort(args,c1);
        String[] test = {"dom","corova","ogorod"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }

    @Test
    public void test3()
    {
        String[] args = {"garrod","ozon","rgon"};
        String abc = "o";
        Lastind c1 = new Lastind(abc);
        Arrays.sort(args,c1);
        String[] test = {"garrod","rgon","ozon"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }

    @Test
    public void test4()
    {
        String[] args = {"garorodo","ozon","rgon"};
        String abc = "o";
        Length c1 = new Length(abc);
        Arrays.sort(args);
        String[] test = {"garorodo","ozon","rgon"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }




}