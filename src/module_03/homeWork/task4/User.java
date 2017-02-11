package module_03.homeWork.task4;

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

    private final static int fee1 = 5;
    private final static int fee2 = 10;
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

        User user1 = new User("Vasya", 10000, 12,
                "GoIT", 1000, "USD");

        user1.withdraw(5000);
        user1.withdraw(999);
        user1.withdraw(2000);
        user1.paySalary();
    }

    public void withdraw(int summ) {
        int blanceAfterWithdrawWithFee = balance - summ - (int) (summ * (summ < 1000 ? fee1 : fee2) / 100.0);
        boolean isWithdrawPossible = blanceAfterWithdrawWithFee >= 0;

        showLog(Message.CURRENT_BALANCE + currency + balance);
        showLog(Message.TRYING_WITHDRAW + currency + summ);
        showLog(Message.COMMISSION + (summ < 1000 ? fee1 : fee2) + "%");

        if (!isWithdrawPossible) {
            showLog(Message.WITHDRAW_IMPOSIBLE + currency + balance);
            showLog(Message.SPLIT);
            return;
        }

        showLog(Message.BALANCE_AFTER_TRANSACTION + currency + blanceAfterWithdrawWithFee);
        balance = blanceAfterWithdrawWithFee;

        showLog(Message.SUCCESS);
        showLog(Message.CURRENT_BALANCE + currency + balance);
        showLog(Message.SPLIT);
    }

    private void showLog(String information) {
        if (!IS_LOG_ENABLED) {
            return;
        }

        System.out.println(information);
    }

    public void paySalary() {
        showLog(Message.SALARY_EARN + currency + salary);
        balance += salary;
        showLog(Message.CURRENT_BALANCE + currency + balance);
        showLog(Message.SPLIT);
    }

    public int companyNameLenght() {
        return getCompanyName().length();
    }

    public void monthIncreaser(int addMonth) {
        setMonthsOfEmployment(getMonthsOfEmployment() + addMonth);
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

    // Getters and Setters
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