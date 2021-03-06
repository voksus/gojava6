package module_02.home_work;

/**
 * Created by voksus on 04.02.2017
 */
public class task2 {

    public static void main(String[] args) {

        System.out.println(withdraw(100, 10));
    }

    private static String withdraw(double balance, double withdrawal) {
        StringBuilder result = new StringBuilder();
        if(balance > 0.0 && withdrawal > 0.0 && withdrawal * 1.05 < balance) {
            result.append("OK ").append(Double.toString(withdrawal * 0.05)).append(" ");
            result.append(Double.toString(balance - withdrawal * 1.05));
        } else {
            result.append("NO");
        }
        return result.toString();
    }
}
