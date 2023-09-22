package by.bsuir.tests.task6;

import org.junit.jupiter.api.Test;
import by.bsuir.main.task6.Main;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void generateMatrixFromArray_GiveEmptyArray_ReturnEmptyMatrix() {
        double[] array = new double[0];
        double[][] expected = new double[0][0];
        double[][] actual = Main.generateMatrixFromArray(array);
        assertTrue(Arrays.deepEquals(expected, actual));
    }
    @Test
    void generateMatrixFromArray_GiveArray_ReturnMatrix() {
        double[] array = new double[] {1, 2, 3, 4, 5, 6};
        double[][] expected = new double[][] {
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 1},
                {3, 4, 5, 6, 1, 2},
                {4, 5, 6, 1, 2, 3},
                {5, 6, 1, 2, 3, 4},
                {6, 1, 2, 3, 4, 5},
        };
        double[][] actual = Main.generateMatrixFromArray(array);
        assertTrue(Arrays.deepEquals(expected, actual));
    }
}