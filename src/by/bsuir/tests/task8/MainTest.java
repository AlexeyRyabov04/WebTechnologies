package by.bsuir.tests.task8;

import org.junit.jupiter.api.Test;
import by.bsuir.main.task8.Main;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mergeArrays_GiveTwoDifferentArrays_ReturnIndexes() {
        double[] arr1 = new double[] {2, 5, 8, 9, 12, 14, 15, 17, 32};
        double[] arr2 = new double[] {0, 5, 6, 8, 11, 20, 33, 34, 35};
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 3, 4, 6, 8, 13, 15, 16, 17));
        ArrayList<Integer> actual = Main.mergeArrays(arr1, arr2);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void mergeArrays_GiveTwoSameArrays_ReturnIndexes() {
        double[] arr1 = new double[] {2, 5, 8, 9, 12, 14, 15, 17, 32};
        double[] arr2 = new double[] {2, 5, 8, 9, 12, 14, 15, 17, 32};
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 3, 5, 7, 9, 11, 13, 15, 17));
        ArrayList<Integer> actual = Main.mergeArrays(arr1, arr2);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void mergeArrays_GiveEmptySecondArray_ReturnEmptyList() {
        double[] arr1 = new double[] {2, 5, 8, 9, 12, 14, 15, 17, 32};
        double[] arr2 = new double[0];
        ArrayList<Integer> actual = Main.mergeArrays(arr1, arr2);
        assertTrue(actual.isEmpty());
    }

    @Test
    void mergeArrays_GiveEmptyFirstArray_ReturnIndexesInOrder() {
        double[] arr2 = new double[] {2, 5, 8, 9, 12, 14, 15, 17, 32};
        double[] arr1 = new double[0];
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> actual = Main.mergeArrays(arr1, arr2);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}