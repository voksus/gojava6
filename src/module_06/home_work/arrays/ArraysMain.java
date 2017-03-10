package module_06.home_work.arrays;

import java.util.Arrays;

/**
 * Created by voksus on 09.03.2017.
 */
public class ArraysMain {

    public static void main(String[] args) {
        int[] data = {5, 3, 1, 7, -11, 2, 8, 20, 10, -6};

        // view the arrays
        System.out.println("ints[]: " + Arrays.toString(data));

        // sum()
        System.out.println("\nsum(ints) : " + ArraysUtils.sum(data));

        // min()
        System.out.println("\tmin(ints) : " + ArraysUtils.min(data));

        // max()
        System.out.println("\tmax(ints) : " + ArraysUtils.max(data));

        // maxPositive()
        System.out.println("\n\tmaxPositive(ints) : " + ArraysUtils.maxPositive(data));

        // multiplication()
        System.out.println("\tmultipl.(ints) : " + ArraysUtils.multiplication(data));

        // modulus()
        System.out.println("\tmodulus.(ints) : " + Arrays.toString(ArraysUtils.modulus(data)));

        // secondLargest()
        System.out.println("\tsecondLargestElement.(ints) : " + ArraysUtils.secondLargest(data));

        // reverse()
        System.out.println("old order: " + Arrays.toString(data));
        ArraysUtils.reverse(data);
        System.out.println("reversed : " + Arrays.toString(data));

        // findEvenElements
        data = ArraysUtils.findEvenElements(data);
        System.out.println("Even only : " + Arrays.toString(data));

    }

}