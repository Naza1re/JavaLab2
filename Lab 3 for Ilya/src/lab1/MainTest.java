package lab1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test1(){
        String[] str = {"прПРАеМ","пржддмеАЙ","прЕфе"};
        String[] otv = {"прЕфе", "прПРАеМ", "пржддмеАЙ"};
        String substr1="пр";
        String substr2="е";
        Arrays.sort(str,new StrComparator1(substr1,substr2));
        assertEquals(Arrays.toString(otv), Arrays.toString(str));
    }
    @Test
    public void test2(){
        String[] str = {"прПРАеМ","пржддмеАЙ","прЕфе"};
        String[] otv = { "прПРАеМ", "прЕфе", "пржддмеАЙ"};
        String substr1="пр";
        String substr2="е";
        Arrays.sort(str,new StrComparator2());
        assertEquals(Arrays.toString(otv), Arrays.toString(str));
    }
}