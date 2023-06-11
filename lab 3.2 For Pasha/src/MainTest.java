import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest
{
    @Test
    public void test1()
    {
        String s = "durov(verni)steny";
        StringBuilder s1 = new StringBuilder(s);
        Assertions.assertEquals( "durov[5]steny",Main.del(s1).toString());
    }

    @Test
    public void test2()
    {
        String s = "n/ew(year)happy";
        StringBuilder s1 = new StringBuilder(s);
        Assertions.assertEquals("n/ew[4]happy",Main.del(s1).toString());
    }

    @Test
    public void test3()
    {
        String s = "easy/(hard)lemon/";
        StringBuilder s1 = new StringBuilder(s);
        Assertions.assertEquals( "easy/[5]lemon/",Main.del(s1).toString());

    }
    @Test
    public void test4()
    {
        String s = "hello(helloy)world";
        StringBuilder s1 = new StringBuilder(s);
        Assertions.assertEquals("hello[5]world",Main.del(s1).toString());
    }


}