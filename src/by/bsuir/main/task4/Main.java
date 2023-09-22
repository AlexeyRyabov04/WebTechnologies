package by.bsuir.main.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        long[] array = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        ArrayList<Integer> list = findIndexesOfPrimes(array);
        for (Integer elem : list) {
            System.out.println(elem);
        }
    }


    public static ArrayList<Integer> findIndexesOfPrimes(long[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if (checkPrime(array[i])) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean checkPrime(long n){
        for(long i = 2; i <= Math.sqrt(n); i++)
        if(n % i == 0)
            return false;
        return true;
    }
}
