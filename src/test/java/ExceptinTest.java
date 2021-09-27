
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptinTest {

    @ParameterizedTest
    @ValueSource(strings = {"a", "2", "5", "-2"})
    void exceptionTest(String input) {
        Throwable thrown = assertThrows(NumberFormatException.class, () -> new BinOps().sum(input, "101"));
        assertNotNull(thrown.getMessage());
    }

}
