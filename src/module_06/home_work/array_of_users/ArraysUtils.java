package module_06.home_work.array_of_users;

import java.util.Arrays;

/**
 * Created by voksus on 09.03.2017.
 */
public final class ArraysUtils {

    private ArraysUtils() { }

    static int sum(int[] array) {
        int sum = 0;
        for (int currentData : array) {
            sum += currentData;
        }
        return sum;
    }

    static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            min = min > array[i] ? array [i] : min;
        }
        return min;

    }

    static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = max < array[i] ? array [i] : max;
        }
        return max;
    }

    static int maxPositive(int[] array) {
        int maxFromArray = max(array);
        if(maxFromArray < 0){
            maxFromArray = 0;
        }
        return maxFromArray;
    }

    static int multiplication (int[] array) {
        int multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication *= array[i];
        }
        return multiplication;

    }

    static int[] modulus(int[] array) {
        int[] result = new int[2];
        result[0] = Math.abs(array[0]);
        result[1] = Math.abs(array[array.length - 1]);
        return result;

    }

    static int secondLargest(int[] array) {
        int maxValue = max(array);
        int beforeMaxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(beforeMaxValue < array[i] && array[i] < maxValue){
                beforeMaxValue = array [i];
            }
        }
        return beforeMaxValue;
    }

    static int[] reverse(int[] array) {
        for(int i = 0; i < array.length/2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }

    static int[] findEvenElements(int[] array) {
        int[] result = new int[array.length];
        int i = 0;
        for (int value : array) {
            if(value % 2 == 0) {
                result[i++] = value;
            }
        }
        result = Arrays.copyOf(result, i);
        return result;
    }

}