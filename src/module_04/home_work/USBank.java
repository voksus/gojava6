package module_04.home_work;

/**
 * Created by voksus on 19.02.2017.
 */
public class USBank extends Bank {

    Currency currency = Currency.USD;

    @Override
    int getLimitOfWithdrawal() {
        int limit = 0;
        if (currency.equals(Currency.USD)) {
            limit = 1000;
        }
        if (currency.equals(Currency.EUR)) {
            limit = 1200;
        }
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit = 0;
        if (currency.equals(Currency.USD)) {
            limit = Integer.MAX_VALUE;
        }
        if (currency.equals(Currency.EUR)) {
            limit = 10000;
        }
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate = 0;
        if (currency.equals(Currency.USD)) {
            rate = 1;
        }
        if (currency.equals(Currency.EUR)) {
            rate = 2;
        }
        return rate;
    }

    @Override
    int getCommission(int summ) {
        int commission = 0;
        if (currency.equals(Currency.USD)) {
            commission = summ > 1000 ? 7 : 5;
        }
        if (currency.equals(Currency.EUR)) {
            commission = summ > 1000 ? 8 : 6;
        }
        return commission;
    }

    @Override
    public void withdrawOfUser(User user, int amount) {

        System.out.println("1");
        if (getLimitOfWithdrawal() > 0 && amount > getLimitOfWithdrawal()) {
            System.out.println("Withdraw is unable: request amount is out of Bank limit.");
            return;
        }

        System.out.println("2");
        amount += getCommission(amount) * amount;
        System.out.println("3" + amount);

        if (user.getBalance() - amount < 0) {
            System.out.println("Withdraw is unable: not enough of founds.");
            return;
        }

        System.out.println("Withdraw " + amount + currency.toString());
        user.setBalance(user.getBalance() - amount);
        System.out.println("Your balance was changed.");

    }

    @Override
    public void fundUser(User user, int amount) {

        if (getLimitOfFunding() > 0 && amount > getLimitOfFunding()) {
            System.out.println("Founding is unable: trying to found more then Bank limit.");
            return;
        }

        user.setBalance(user.getBalance() + amount);

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        double toUserCurrentBalance = toUser.getBalance(), fromUserCurrentBalance = fromUser.getBalance();

        fundUser(toUser, amount);
        withdrawOfUser(fromUser, amount);

        if (toUser.getBalance() == toUserCurrentBalance || fromUser.getBalance() == fromUserCurrentBalance) {
            System.out.println("Transferring is imposible.");
            // tyring undo the withdraw and/or found operation
            toUser.setBalance(toUserCurrentBalance);
            fromUser.setBalance(fromUserCurrentBalance);
        }

    }

    @Override
    public void paySalary(User user) {

        double amount = user.getSalary();
        user.setBalance(user.getBalance() + amount);

    }
}