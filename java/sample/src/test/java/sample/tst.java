package sample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class tst {

    // Define a method that provides parameters for the test
    static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 2, 5, 7 }, // input values and expected result
                { -2, 7, 5 },
                { 0, 0, 0 }
        });
    }

    // Use the parameters in the test
    @ParameterizedTest
    @MethodSource("data")
    void test(int a, int b, int expected) {
        int result = add.add(a, b);
        assertEquals(expected, result);
    }
}
