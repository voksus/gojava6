package module_02.homeWork;

import java.util.Arrays;

/**
 * Created by voksus on 30.01.2017.
 */
public class task21 {

    public static void main(String[] args) {
        int[] intData = {5, 3, 1, 7, -11, 2, 8, 20, 10, -6};
        double[] doubleData = {-0.1, 0.2, 5.0, 10.0, -7.5, 0.009, 100.1, 333.333, -1.1, 2.0};

        // view the arrays
        System.out.println("ints[]: " + Arrays.toString(intData));
        System.out.println("doubles[]: " + Arrays.toString(doubleData));

        // sum()
        System.out.print("\n\tsum(ints) : " + sum(intData));
        System.out.println("\t\t\tsum(doubles) : " + sum(doubleData));

        // min()
        System.out.print("\tmin(ints) : " + min(intData));
        System.out.println("\t\t\tmin(doubles) : " + min(doubleData));

        // max()
        System.out.print("\tmax(ints) : " + max(intData));
        System.out.println("\t\t\tmax(doubles) : " + max(doubleData));

        // maxPositive()
        System.out.print("\n\tmaxPositive(ints) : " + maxPositive(intData));
        System.out.println("\t\t\t\tmaxPositive(doubles) : " + maxPositive(doubleData));

        // multiplication()
        System.out.print("\tmultipl.(ints) : " + multiplication(intData));
        System.out.println("\t\t\tmultipl.(doubles) : " + multiplication(doubleData));

        // modulus()
        System.out.print("\tmodulus.(ints) : " + Arrays.toString(modulus(intData)));
        System.out.println("\t\t\t\tmodulus.(doubles) : " + Arrays.toString(modulus(doubleData)));

        // secondLargestElement()
        System.out.print("\tsecondLargestElement.(ints) : " + secondLargestElement(intData));
        System.out.println("\tsecondLargestElement.(doubles) : " + secondLargestElement(doubleData));
    }

    // sum(int)
    private static int sum(int[] intData) {
        int sum = 0;
        for (int currentData : intData) {
            sum += currentData;
        }
        return sum;
    }

    // sum(double)
    private static double sum(double[] doubleData) {
        double sum = 0;
        for (double currentData : doubleData) {
            sum += currentData;
        }
        return sum;
    }

    // min(int)
    private static int min(int[] intData) {
        int min = intData[0];
        for (int i = 0; i < intData.length - 1; i++) {
            min = min > intData[i] ? intData [i] : min;
        }
        return min;
    }

    // min(double)
    private static double min(double[] doubleData) {
        double min = doubleData[0];
        for (int i = 0; i < doubleData.length - 1; i++) {
            min = min > doubleData[i] ? doubleData [i] : min;
        }
        return min;
    }

    // max(int)
    private static int max(int[] intData) {
        int max = intData[0];
        for (int i = 0; i < intData.length; i++) {
            max = max < intData[i] ? intData [i] : max;
        }
        return max;
    }

    // max(double)
    private static double max(double[] doubleData) {
        double max = doubleData[0];
        for (int i = 0; i < doubleData.length; i++) {
            max = max < doubleData[i] ? doubleData [i] : max;
        }
        return max;
    }

    // maxPositive(int)     - NOT SURE the task is correct
    private static int maxPositive(int[] intData) {
        int maxFromArray = max(intData);
        if(maxFromArray < 0){
            maxFromArray = 0;
        }
        return maxFromArray;
    }

    // maxPositive(double)  - NOT SURE the task is correct
    private static double maxPositive(double[] doubleData) {
        double maxFromArray = max(doubleData);
        if(maxFromArray < 0){
            maxFromArray = 0;
        }
        return maxFromArray;
    }

    // multiplication(int)
    private static int multiplication(int[] intData) {
        int multiplication = intData[0];
        for (int i = 1; i < intData.length; i++) {
            multiplication *= intData[i];
        }
        return multiplication;
    }

    // multiplication(double)
    private static double multiplication(double[] doubleData) {
        double multiplication = doubleData[0];
        for (int i = 1; i < doubleData.length; i++) {
            multiplication *= doubleData[i];
        }
        return multiplication;
    }

    // modulus(int)
    private static int[] modulus(int[] intData) {
        int[] result = new int[2];
        result[0] = Math.abs(intData[0]);
        result[1] = Math.abs(intData[intData.length - 1]);
        return result;
    }

    // modulus(double)
    private static double[] modulus(double[] doubleData) {
        double[] result = new double[2];
        result[0] = Math.abs(doubleData[0]);
        result[1] = Math.abs(doubleData[doubleData.length - 1]);
        return result;
    }

    // secondLargestElement(int)
    private static int secondLargestElement(int[] intData) {
        int maxValue = max(intData);
        int beforeMaxValue = Integer.MIN_VALUE;
        for (int i = 0; i < intData.length; i++) {
            if(beforeMaxValue < intData[i] && intData[i] < maxValue){
                beforeMaxValue = intData [i];
            }
        }
        return beforeMaxValue;
    }

    // secondLargestElement(double)
    private static double secondLargestElement(double[] doubleData) {
        double maxValue = max(doubleData);
        double beforeMaxValue = Integer.MIN_VALUE;
        for (int i = 0; i < doubleData.length; i++) {
            if(beforeMaxValue < doubleData[i] && doubleData[i] < maxValue){
                beforeMaxValue = doubleData [i];
            }
        }
        return beforeMaxValue;
    }
}