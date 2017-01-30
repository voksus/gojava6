package module_02.offline;

import java.util.Arrays;

/**
 * Created by voksus on 28.01.2017.
 */
public class BalanceCounter {
    public static void main(String[] args) {

        int[] balances = {10, 5620, 3210, 1, 777, 2222, 4444, 5, 1000, 7};
        int balanceSum = 0;

        for (int currentBalance: balances) {

            if (currentBalance > 999 && currentBalance < 5001) {
                balanceSum += currentBalance;
            }

        }
        System.out.println("Result is: " + balanceSum);

        //-----------------------------------------------

        String[] namesArr = {"v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"};
        int[] balancesArr = {10, 5620, 3210, 1, 777, 2222, 4444, 5, 1000, 7};

        for(int i = 0; i < balancesArr.length; i++){
            if(balancesArr[i] > 1000){
                System.out.println(namesArr[i] + "'s balance is " + balancesArr[i]);
            } else {
                System.out.println("/ " + balancesArr[i] + " <= 1000 /");
            }
        }

        Character[] bul;
        bul = {'A', 'B'}};
        System.out.println(Arrays.toString(bul));
    }
}
