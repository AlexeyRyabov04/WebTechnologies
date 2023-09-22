package by.bsuir.tests.task7;

import org.junit.jupiter.api.Test;
import by.bsuir.main.task7.Main;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sortArray_GiveSortedArray_ReturnSameArray() {
        double[] expected = new double[] {1, 2, 3, 4, 5, 6};
        double[] actual = Main.sortArray(expected);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortArray_GiveUnsortedArray_ReturnSortedArray() {
        double[] array = new double[] {2, 4, 5, 1, 3, 6};
        double[] expected = new double[] {1, 2, 3, 4, 5, 6};
        double[] actual = Main.sortArray(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortArray_GiveArrayWithSameValues_ReturnSameArray() {
        double[] expected = new double[] {1, 1, 1, 1, 1, 1, 1, 1};
        double[] actual = Main.sortArray(expected);
        assertArrayEquals(expected, actual);
    }
}