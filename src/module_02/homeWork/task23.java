package module_02.homeWork;

/**
 * Created by voksus on 05.02.2017
 */
public class task23 {

    private static double[] balances = {1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static void main(String[] args) {

        String ownerName = "Ann";
        double withdrawal = 100;

        System.out.println(withdraw(ownerName, withdrawal));

    }

    // method checking owner's balance and trying to withdraw money if possible
    private static String withdraw(String owner, double withdrawal) {
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
            if (balances[ownerIndex] > 0 && withdrawal > 0 && withdrawal * 1.05 < balances[ownerIndex]) {
                result.append(ownerNames[ownerIndex]).append(" ");
                result.append(Double.toString(withdrawal)).append(" ");
                result.append(Double.toString(balances[ownerIndex] - (withdrawal * 1.05)));
            } else {
                result.append(owner).append(" NO");
            }
        }

        // if owner wasn't found in list "" will be return
        return result.toString();
    }
}
