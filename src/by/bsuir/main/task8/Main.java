package by.bsuir.main.task8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double[] arr1 = new double[] {2, 5, 8, 9, 12, 14, 15, 17, 32};
        double[] arr2 = new double[] {2, 5, 8, 9, 12, 14, 15, 17, 32};
        ArrayList<Integer> res = mergeArrays(arr1, arr2);
        for (Integer elem : res){
            System.out.print(elem + " ");
        }
    }

    public static ArrayList<Integer> mergeArrays(double[] arr1, double[] arr2){
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        int index = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] <= arr2[j]){
                i++;
            }
            else {
                res.add(i + index++);
                j++;
            }
        }
        while (j < arr2.length){
            res.add(arr1.length + index++);
            j++;
        }
        return res;
    }
}
