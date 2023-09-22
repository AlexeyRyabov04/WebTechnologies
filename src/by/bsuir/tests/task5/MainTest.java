package by.bsuir.tests.task5;

import org.junit.jupiter.api.Test;

import by.bsuir.main.task5.Main;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void findTheNumberOfElementsToRemove_GiveIncreasingSequence_ReturnZero() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 8, 25, 67};
        int expected = 0;
        int actual = Main.findTheNumberOfElementsToRemove(array);
        assertEquals(expected, actual);
    }

    @Test
    void findTheNumberOfElementsToRemove_GiveDecreasingSequence_ReturnNumberOfValuesInArray() {
        int[] array = new int[]{67, 24, 10, 5, 4, 2, 1};
        int expected = array.length - 1;
        int actual = Main.findTheNumberOfElementsToRemove(array);
        assertEquals(expected, actual);
    }

    @Test
    void findTheNumberOfElementsToRemove_GiveEmptySequence_ReturnZero() {
        int[] array = new int[0];
        int expected = 0;
        int actual = Main.findTheNumberOfElementsToRemove(array);
        assertEquals(expected, actual);
    }

    @Test
    void findTheNumberOfElementsToRemove_GiveSequence_ReturnTheNumberOfElementsToRemove() {
        int[] array = new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80};
        int expected = 3;
        int actual = Main.findTheNumberOfElementsToRemove(array);
        assertEquals(expected, actual);
    }
}