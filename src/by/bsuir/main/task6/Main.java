package by.bsuir.main.task6;

public class Main {
    public static void main(String[] args) {
        double[] arr = new double[] {1, 2, 3, 4, 5, 6};
        double[][] matrix = generateMatrixFromArray(arr);
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static double[][] generateMatrixFromArray(double[] arr) {
        double[][] matrix = new double[arr.length][arr.length];
        if (arr.length == 0){
            return matrix;
        }
        System.arraycopy(arr, 0, matrix[0], 0, arr.length);
        for (int i = 1; i < arr.length; i++){
            double[] row = shiftArray(arr, i);
            System.arraycopy(row, 0, matrix[i], 0, arr.length);
        }
        return  matrix;
    }

    public static double[] shiftArray(double[] arr, int shift){
        double[] res = new double[arr.length];
        for (int i = shift; i < arr.length; i++){
            res[i - shift] = arr[i];
        }
        for (int i = 0; i < shift; i++){
            res[arr.length + i - shift] = arr[i];
        }
        return  res;
    }
}
