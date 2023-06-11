import org.junit.Assert;
import org.junit.Test;
public class  MainTest
{
    @Test
    public void Test1()
    {
        double h=0.1;
        double x=2;
        Assert.assertEquals(Main.Cos(x), Main.Sum(x, h), h);
    };

    @Test
    public void Test2()
    {
        double h=0.2;
        double x=4;
        Assert.assertEquals(Main.Cos(x), Main.Sum(x, h),h);
    };

    @Test
    public void Test3()
    {
        double h=0.1;
        double x=2;
        Assert.assertEquals(Main.Cos(x), Main.Sum(x, h), h);
    };
    @Test
    public void Test4()
    {
        double h=0.2;
        double x=4;
        Assert.assertEquals(Main.Cos(   x), Main.Sum(x, h), h);
    };

}
