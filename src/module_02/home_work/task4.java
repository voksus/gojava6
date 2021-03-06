package module_02.home_work;

/**
 * Created by voksus on 05.02.2017
 */
public class task4 {

    private static double[] balances = {1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static void main(String[] args) {

        String ownerName = "Oww";
        double fundAmount = 100;

        System.out.println(withdraw(ownerName, fundAmount));

    }

    // method checking owner's balance and trying to fund the money
    private static String withdraw(String owner, double fundAmount) {
        StringBuilder result = new StringBuilder();
        int ownerIndex = -1;

        // define owner's index in array
        for (int i = 0; i < ownerNames.length; i++) {
            if (owner.equals(ownerNames[i])) {
                ownerIndex = i;
                break;
            }
        }

        //if index == -1 then owner not exist in list
        if (ownerIndex >= 0) {
            balances[ownerIndex] += fundAmount;
            result.append(ownerNames[ownerIndex]).append(" ");
            result.append(Double.toString(balances[ownerIndex]));
        }

        // if owner wasn't found in list "" will be return
        return result.toString();
    }
}
