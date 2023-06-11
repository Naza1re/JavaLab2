import org.junit.Test;
import org.junit.Assert;

public class MainTest {
    @Test
    public void Test1() {
        Assert.assertEquals(6,Main.expression(3,3,4),0);
    }
    @Test
    public void Test2() {
        Assert.assertEquals(10,Main.expression(5,2,7),0);
    }
    @Test
    public void Test3() {
        Assert.assertEquals(3,Main.expression(2,4,4),0);
    }
}