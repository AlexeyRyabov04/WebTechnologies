package by.bsuir.tests.task3;

import org.junit.jupiter.api.Test;
import by.bsuir.main.task3.Main;

import java.util.Arrays;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void findTheValuesOfTheFunctionOnTheInterval_TangentValuesOnInterval_ReturnTableWithArgumentsAndValues() {
        double[][] expected = new double[][] {
                {0, Math.tan(0)},
                {1, Math.tan(1)},
                {2, Math.tan(2)},
                {3, Math.tan(3)},
                {4, Math.tan(4)},
        };
        double[][] actual = Main.findTheValuesOfTheFunctionOnTheInterval(0, 4, 1);
        assertTrue(Arrays.deepEquals(expected, actual));

    }

    @Test
    void findTheValuesOfTheFunctionOnTheInterval_GiveIntervalWithLength0_ReturnTableWithLength1() {
        double[][] expected = new double[][] {
                {2, Math.tan(2)},
        };
        double[][] actual = Main.findTheValuesOfTheFunctionOnTheInterval(2, 2, 0.1);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    void findTheValuesOfTheFunctionOnTheInterval_GiveZeroStep_ReturnTableWithArgumentAndValueOfLeftBoundary() {
        double[][] expected = new double[][] {
                {2, Math.tan(2)},
        };
        double[][] actual = Main.findTheValuesOfTheFunctionOnTheInterval(2, 4, 0);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    void findTheValuesOfTheFunctionOnTheInterval_GiveNegativeStep_ReturnTableWithArgumentAndValueOfLeftBoundary() {
        double[][] expected = new double[][] {
                {2, Math.tan(2)},
        };
        double[][] actual = Main.findTheValuesOfTheFunctionOnTheInterval(2, 2, -1);
        assertTrue(Arrays.deepEquals(expected, actual));
    }
}