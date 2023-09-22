package by.bsuir.tests.task9;

import by.bsuir.main.task9.Ball;
import by.bsuir.main.task9.Basket;
import by.bsuir.main.task9.Main;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CountWeightOfBallsTest {

    @Test
    void countWeightOfBalls_GiveBasketWithBalls_ReturnWeightOfBalls() {
        Basket basket = new Basket(new Ball(23, Color.GREEN),
                new Ball(14, Color.WHITE), new Ball(10, Color.ORANGE),
                new Ball(1, Color.YELLOW), new Ball(3, Color.BLACK));
        double expected = 51;
        double actual = Main.countWeightOfBalls(basket);
        assertEquals(expected, actual);
    }

    @Test
    void countWeightOfBalls_GiveBasketWithoutBalls_ReturnZero() {
        Basket basket = new Basket();
        double expected = 0;
        double actual = Main.countWeightOfBalls(basket);
        assertEquals(expected, actual);
    }
}