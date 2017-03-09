package module_06.home_work.array_of_users;

import java.util.Arrays;

/**
 * Created by voksus on 09.03.2017.
 */
public class ArraysMain {

    public static void main(String[] args) {
        int[] intData = {5, 3, 1, 7, -11, 2, 8, 20, 10, -6};



        // view the arrays
        System.out.println("ints[]: " + Arrays.toString(intData));

        // sum()
        System.out.print("\n\tsum(ints) : " + ArraysUtils.sum(intData));

        // min()
        System.out.print("\tmin(ints) : " + ArraysUtils.min(intData));

        // max()
        System.out.print("\tmax(ints) : " + ArraysUtils.max(intData));

        // maxPositive()
        System.out.print("\n\tmaxPositive(ints) : " + ArraysUtils.maxPositive(intData));

        // multiplication()
        System.out.print("\tmultipl.(ints) : " + ArraysUtils.multiplication(intData));

        // modulus()
        System.out.print("\tmodulus.(ints) : " + Arrays.toString(ArraysUtils.modulus(intData)));

        // secondLargest()
        System.out.print("\tsecondLargestElement.(ints) : " + ArraysUtils.secondLargest(intData));
    }

}