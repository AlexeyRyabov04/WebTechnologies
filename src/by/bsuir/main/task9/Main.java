package by.bsuir.main.task9;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball(2, Color.BLUE);
        Ball ball2 = new Ball(8, Color.BLUE);
        Ball ball3 = new Ball(4, Color.ORANGE);
        Ball ball4 = new Ball(2, Color.BLACK);
        Ball ball5 = new Ball(3, Color.BLUE);
        Ball ball6 = new Ball(9, Color.RED);
        Basket basket = new Basket(ball1, ball2, ball3, ball4, ball5, ball6);
        int numOfBlueBalls = countNumberOfBlueBalls(basket);
        System.out.println(numOfBlueBalls);
        double totalWeight = countWeightOfBalls(basket);
        System.out.println(totalWeight);
    }

    public static int countNumberOfBlueBalls(Basket basket){
        int count = 0;
        for (Ball ball : basket.getBalls()){
            if (ball.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }

    public static double countWeightOfBalls(Basket basket){
        double totalWeight = 0;
        for (Ball ball : basket.getBalls()){
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

}
