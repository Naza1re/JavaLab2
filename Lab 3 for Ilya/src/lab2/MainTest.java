package lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class MainTest {
    @Test
    public void test1(){
        StringBuilder anw = new StringBuilder("привет {8} как {16} дела {26}");
        StringBuilder str = new StringBuilder("привет {} как {} дела {}");
        assertEquals(anw.toString(), Main.resh(str).toString());
    }
    @Test
    public void test2(){
        StringBuilder anw = new StringBuilder("привет {8} как {123} дела {27}");
        StringBuilder str = new StringBuilder("привет {} как {123} дела {}");
        assertEquals(anw.toString(), Main.resh(str).toString());
    }
}