package goIt;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;


class SumCalculatorTest {

    private SumCalculator sumTest;

    @BeforeEach
    public void beforeEach() {
        sumTest = new SumCalculator();
    }

    @Test
    void testSumEqualsOne() {
        //When
        int actual = sumTest.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testSumEqualsTree() {
        //When
        int actual = sumTest.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testSumEqualsZeroIllegalArgumentException() {


        assertThrows(IllegalArgumentException.class,() ->
                  sumTest.sum(0));
        }

}