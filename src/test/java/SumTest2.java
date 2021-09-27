import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTest2 {

    @Test
    void sumTest_0() {

        String expected = new BinOps().sum("0", "1");
        String result = "1";
        Assertions.assertEquals(expected,result);

    }

    @Test
    void sumTest_1() {

        String expected = new BinOps().sum("1", "1");
        String result = "10";
        Assertions.assertEquals(expected,result);

    }

    @Test
    void sumTest_2() {

        String expected = new BinOps().sum("10", "1");
        String result = "11";
        Assertions.assertEquals(expected,result);

    }

    @Test
    void sumTest_3() {

        String expected = new BinOps().sum("101", "111");
        String result = "1100";
        Assertions.assertEquals(expected,result);

    }

}
