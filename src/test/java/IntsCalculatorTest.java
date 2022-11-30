import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IntsCalculatorTest {
    private Calculator calculator;
    private IntsCalculator intsCalculator;

    @BeforeEach
    void setUo() {
        calculator = new Calculator();
        intsCalculator = new IntsCalculator(calculator);
    }

    @ParameterizedTest
    @MethodSource("getArgsSum")
    void sum(int arg0, int arg1, int expected) {
        Assertions.assertEquals(expected, intsCalculator.sum(arg0, arg1));
    }

    private static Stream<Arguments> getArgsSum() {
        return Stream.of(
                Arguments.of(5, 15, 20),
                Arguments.of(2, 22, 24)
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsMult")
    void mult(int arg0, int arg1, int expected) {
        Assertions.assertEquals(expected, intsCalculator.mult(arg0, arg1));
    }

    private static Stream<Arguments> getArgsMult() {
        return Stream.of(
                Arguments.of(5, 15, 75),
                Arguments.of(2, 22, 44)
        );
    }
    @ParameterizedTest
    @MethodSource("getArgsPow")
    void pow(int arg0, int arg1, int expected) {
        Assertions.assertEquals(expected, intsCalculator.pow(arg0, arg1));
    }

    private static Stream<Arguments> getArgsPow() {
        return Stream.of(
                Arguments.of(5, 2, 25),
                Arguments.of(3, 7, 2187)
        );
    }
}
