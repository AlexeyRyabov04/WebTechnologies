package by.bsuir.main.task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls = new ArrayList<>();

    public Basket(Ball ...balls){
        for (Ball ball : balls){
            this.balls.add(ball);
        }
    }

    public List<Ball> getBalls(){
        return balls;
    }
}
