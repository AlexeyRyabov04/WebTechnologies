package by.bsuir.tests.task2;

import org.junit.jupiter.api.Test;
import by.bsuir.main.task2.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkWhetherThePointBelongsToTheRegion_TestThePointInFirstRectangle_ReturnTrue() {
        assertTrue(Main.checkWhetherThePointBelongsToTheRegion(2.0, 2.0));
    }

    @Test
    void checkWhetherThePointBelongsToTheRegion_TestThePointInSecondRectangle_ReturnTrue() {
        assertTrue(Main.checkWhetherThePointBelongsToTheRegion(-5.0, -1.0));
    }

    @Test
    void checkWhetherThePointBelongsToTheRegion_TestPointsOutsideRectangles_ReturnFalse() {
        assertFalse(Main.checkWhetherThePointBelongsToTheRegion(7.0, 3.0));
    }

    @Test
    void checkWhetherThePointBelongsToTheRegion_TestThePointOnBoundary_ReturnTrue() {
        assertTrue(Main.checkWhetherThePointBelongsToTheRegion(-4.0, 0.0));
    }
}