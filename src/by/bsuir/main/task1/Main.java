package by.bsuir.main.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateFormula(0.0, 0.0));
    }

    public static double calculateFormula(double x, double y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - 2 * x / (1 + Math.pow(x * y, 2)));
        return  numerator / denominator + x;
    }
}
