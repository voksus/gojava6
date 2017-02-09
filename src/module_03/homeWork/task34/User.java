package module_03.homeWork.task34;

/**
 * Created by voksus on 09.02.2017.
 */
public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    private static int fee1, fee2;
    private final boolean IS_LOG_ENABLED = true;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public static void main(String[] args) {
        setFee1(5);
        setFee2(10);

        User user1 = new User("Vasya", 10000, 12,
                "GoIT", 1000, "USD");

        user1.withdraw(5000);
        user1.withdraw(4000);
        user1.withdraw(555);
        user1.paySalary();
    }

    public void withdraw(int summ){
        int currentBalance = getBalance();
        int fee1 = getFee1();
        int fee2 = getFee2();
        int blanceAfterWithdrawWithFee1 = currentBalance - summ - (int)(summ * fee1 / 100.0);
        int blanceAfterWithdrawWithFee2 = currentBalance - summ - (int)(summ * fee2 / 100.0);
        boolean isWithdrawPossible = false;

        showLog(1);
        showLog(5, Integer.toString(summ));
        if(currentBalance < 1000){
            isWithdrawPossible = blanceAfterWithdrawWithFee1 >= 0;
            showLog(4, Integer.toString(fee1) + "%");
            if(isWithdrawPossible) showLog(3, Integer.toString(blanceAfterWithdrawWithFee1));
        } else {
            isWithdrawPossible = blanceAfterWithdrawWithFee2 >= 0;
            showLog(4, Integer.toString(fee2) + "%");
            if(isWithdrawPossible) showLog(3, Integer.toString(blanceAfterWithdrawWithFee2));
        }

        if(!isWithdrawPossible) {
            showLog(2, Integer.toString(getBalance()));
            showLog(-1);
            return;
        }

        setBalance(currentBalance < 1000 ? blanceAfterWithdrawWithFee1 : blanceAfterWithdrawWithFee2);

        showLog(0);
        showLog(1);
        showLog(-1);
    }

    public void paySalary(){
        showLog(6);
        setBalance(getBalance() + getSalary());
        showLog(1);
        showLog(-1);
    }

    public int companyNameLenght(){
        return getCompanyName().length();
    }

    public void monthIncreaser(int addMonth){
        setMonthsOfEmployment(getMonthsOfEmployment() + addMonth);
    }

    public static int getFee1() {
        return fee1;
    }

    public static void setFee1(int fee1) {
        User.fee1 = fee1;
    }

    public static int getFee2() {
        return fee2;
    }

    public static void setFee2(int fee2) {
        User.fee2 = fee2;
    }

    private void showLog(int infoIndex) {
        showLog(infoIndex, "");
    }

    private void showLog(int infoIndex, String additionalInfo){
        if(!IS_LOG_ENABLED){
            return;
        }

        switch (infoIndex){
            case -1:
                System.out.println("-------------------------------------\n");
                break;
            case 0:
                System.out.println("Operation success.");
                break;
            case 1:
                System.out.println("Current balance is: " + getCurrency() + getBalance());
                break;
            case 2:
                System.out.println("Withdraw is NOT possible because lack of balance.\n Your balance is:" + getCurrency() + additionalInfo);
                break;
            case 3:
                System.out.println("Your balance after transaction will be: " + getCurrency() + additionalInfo);
                break;
            case 4:
                System.out.println("Comission is: " + additionalInfo);
                break;
            case 5:
                System.out.println("Trying to withdraw " + getCurrency() + additionalInfo);
                break;
            case 6:
                System.out.println("You earn the salary amount: " + getCurrency() + getSalary());
                break;
            default:
                System.err.println("Error! No such index for information! Additional incoming info here: \n" + additionalInfo);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}