import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test1() {

        int[][] arr = new int[][]{{1,2,4,53},{32,53,1,5},{5,2,5,1},{18,24,124,14}};
        assertEquals(124,
                Main.searchmax(arr));

    }


    @Test
    public void test2() {
        int[][] arr = new int[][]{{45,12,526,98},{32,574,233,123},{52,21,25,41},{18,24,124,14}};

        assertEquals(574,
                Main.searchmax(arr));
    }


}