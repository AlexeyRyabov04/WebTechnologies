package by.bsuir.tests.task4;

import org.junit.jupiter.api.Test;
import by.bsuir.main.task4.Main;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void findIndexesOfPrimes_GiveArrayWithOnlyPrimes_ReturnAllIndexes() {
        long[] array = new long[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> actual = Main.findIndexesOfPrimes(array);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void findIndexesOfPrimes_GiveArrayWithoutPrimes_ReturnEmptyList() {
        long[] array = new long[]{4, 6, 8, 10, 12, 14};
        ArrayList<Integer> actual = Main.findIndexesOfPrimes(array);
        assertTrue(actual.isEmpty());
    }

    @Test
    void findIndexesOfPrimes_GiveEmptyArray_ReturnEmptyArray() {
        long[] array = new long[0];
        ArrayList<Integer> actual = Main.findIndexesOfPrimes(array);
        assertTrue(actual.isEmpty());
    }

    @Test
    void findIndexesOfPrimes_GiveArrayWithPrimesAndNotPrimes_ReturnListWithIndexesOfPrimes() {
        long[] array = new long[]{4, 6, 2, 3, 5, 7, 8, 11, 13, 10, 17, 19, 14, 23, 29};
        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 3, 4, 5, 7, 8, 10, 11, 13, 14));
        ArrayList<Integer> actual = Main.findIndexesOfPrimes(array);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}