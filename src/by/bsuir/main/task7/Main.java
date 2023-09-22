package by.bsuir.main.task7;

public class Main {
    public static void main(String[] args) {
        double[] arr = new double[] {1, 2, 3, 4, 5, 6, 7, 6, 9, 10, 6, 7, 4, 2};
        arr = sortArray(arr);
        for (double elem : arr){
            System.out.print(elem + " ");
        }
    }

    public static double[] sortArray(double[] arr){
        int i = 0;
        while (i < arr.length - 1){
            if (arr[i] <= arr[i + 1]){
                i++;
            }
            else {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            }
        }
        return arr;
    }
}
