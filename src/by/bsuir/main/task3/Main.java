package by.bsuir.main.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("x\tF(x)");
        double[][] table = findTheValuesOfTheFunctionOnTheInterval(0, 3, 1);
        for (double[] elem : table) {
            System.out.println(String.format("%.3f %.3f\n", elem[0], elem[1]));
        }
    }

    public static double[][] findTheValuesOfTheFunctionOnTheInterval(double a, double b, double h){
        double size = h > 0 ? ((int)((b - a) / h) + 1) : 1;
        double[][] table = new double[(int)size][2];
        if (h <= 0){
            table[0][0] = a;
            table[0][1] = Math.tan(a);
            return table;
        }
        int i = 0;
        while (a <= b){
            table[i][0] = a;
            table[i][1] = Math.tan(a);
            a += h;
            i++;
        }
        return table;
    }
}
