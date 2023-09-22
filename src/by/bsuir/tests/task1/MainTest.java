package by.bsuir.tests.task1;

import org.junit.jupiter.api.Test;
import by.bsuir.main.task1.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void calculateFormula_GivePositiveValues_ReturnCalculatedValue() {
        double x = 3.0;
        double y = 2.0;
        double expected = 3.3967755490944938;
        double result = Main.calculateFormula(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void calculateFormula_GiveZeroValues_ReturnCalculatedValue() {
        double x = 0.0;
        double y = 0.0;
        double expected = 0.5;
        double result = Main.calculateFormula(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void calculateFormula_GiveNegativeValues_ReturnCalculatedValue() {
        double x = -1.0;
        double y = -2.0;
        double expected = -0.6077250551250704;
        double actual = Main.calculateFormula(x, y);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateFormula_GivePositiveAndNegativeValues_ReturnCalculatedValue() {
        double x = -1.0;
        double y = 2.0;
        double expected = -0.3430486852793958;
        double actual = Main.calculateFormula(x, y);
        assertEquals(expected, actual);
    }
}