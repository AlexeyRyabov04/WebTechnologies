package by.bsuir.tests.task9;

import org.junit.jupiter.api.Test;
import by.bsuir.main.task9.Main;
import by.bsuir.main.task9.Ball;
import by.bsuir.main.task9.Basket;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CountBlueBallsTest {

    @Test
    void countNumberOfBlueBalls_GiveBasketWithSomeBlueBalls_ReturnCountOfBlueBalls() {
        Basket basket = new Basket(new Ball(1, Color.BLUE),
                new Ball(1, Color.WHITE), new Ball(1, Color.BLUE),
                new Ball(1, Color.BLUE), new Ball(1, Color.BLACK));
        int expected = 3;
        int actual = Main.countNumberOfBlueBalls(basket);
        assertEquals(expected, actual);
    }

    @Test
    void countNumberOfBlueBalls_GiveBasketWithoutBlueBalls_ReturnZero() {
        Basket basket = new Basket(new Ball(1, Color.GREEN),
                new Ball(1, Color.WHITE), new Ball(1, Color.ORANGE),
                new Ball(1, Color.YELLOW), new Ball(1, Color.BLACK));
        int expected = 0;
        int actual = Main.countNumberOfBlueBalls(basket);
        assertEquals(expected, actual);
    }
}