package lab4;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MainTest {
    @Test
    public void test1(){
        String[] str = {"прПРАеМ","пржддмеАЙ","прЕфе"};
        String[] otv = {"прЕфе", "прПРАеМ", "пржддмеАЙ"};
        String substr1="пр";
        String substr2="е";
        QuickSort<String> c = new QuickSort<>();
        c.sort(str,new StrComparator1(substr1,substr2));
        Assertions.assertEquals(Arrays.toString(otv), Arrays.toString(str));
    }
    @Test
    public void test2(){
        String[] str = {"прПРАеМ","пржддмеАЙ","прЕфе"};
        String[] otv = {"прЕфе", "прПРАеМ", "пржддмеАЙ"};
        String substr1="пр";
        String substr2="е";
        SelectionSort<String> c =new SelectionSort<>();
        c.sort(str,new StrComparator1(substr1,substr2));
        Assertions.assertEquals(Arrays.toString(otv), Arrays.toString(str));
    }
    @Test
    public void test3(){
        String[] str = {"прПРАеМ","пржддмеАЙ","прЕфе"};
        String[] otv = { "прПРАеМ", "прЕфе", "пржддмеАЙ"};
        String substr1="пр";
        String substr2="е";
        QuickSort<String> c = new QuickSort<>();
        c.sort(str,new StrComparator2());
        Assertions.assertEquals(Arrays.toString(otv), Arrays.toString(str));


    }
    @Test
    public void test4(){
        String[] str = {"прПРАеМ","пржддмеАЙ","прЕфе"};
        String[] otv = { "прПРАеМ", "прЕфе", "пржддмеАЙ"};
        String substr1="пр";
        String substr2="е";
        SelectionSort<String> c =new SelectionSort<>();
        c.sort(str,new StrComparator2());
        Assertions.assertEquals(Arrays.toString(otv), Arrays.toString(str));
    }
}