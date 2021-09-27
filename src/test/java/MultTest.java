import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultTest {

    @Test
    void sumTest_0() {

        String expected = new BinOps().mult("0", "1");
        String result = "0";
        Assertions.assertEquals(expected,result);

    }

    @Test
    void sumTest_1() {

        String expected = new BinOps().mult("1", "1");
        String result = "1";
        Assertions.assertEquals(expected,result);

    }

    @Test
    void sumTest_2() {

        String expected = new BinOps().mult("10", "1");
        String result = "10";
        Assertions.assertEquals(expected,result);

    }

    @Test
    void sumTest_3() {

        String expected = new BinOps().mult("101", "111");
        String result = "100011";
        Assertions.assertEquals(expected,result);

    }

}
