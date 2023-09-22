package by.bsuir.main.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkWhetherThePointBelongsToTheRegion(-5, 1));
    }

    public static boolean checkWhetherThePointBelongsToTheRegion(double x, double y){
        return(checkWhetherThePointBelongsToTheRectangle(-4, 0, 4, 4, x, y)
                || checkWhetherThePointBelongsToTheRectangle(-6, -3, 6, 0, x, y));
    }

    public static boolean checkWhetherThePointBelongsToTheRectangle(double x1, double y1, double x2, double y2, double x, double y){
        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }
}
