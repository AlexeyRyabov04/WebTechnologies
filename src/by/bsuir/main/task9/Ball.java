package by.bsuir.main.task9;


import java.awt.*;

public class Ball {
    private double weight;
    private Color color;

    public Ball(double weight, Color color){
        this.weight = weight;
        this.color = color;
    }

    public double getWeight(){
        return weight;
    }

    public Color getColor(){
        return color;
    }
}
