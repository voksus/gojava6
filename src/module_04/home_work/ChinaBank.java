package module_04.home_work;

/**
 * Created by voksus on 19.02.2017.
 */
public class ChinaBank extends Bank {

    Currency currency;

    @Override
    int getLimitOfWithdrawal() {
        int limit = 0;
        if (currency.equals(Currency.USD)) {
            limit = 100;
        }
        if (currency.equals(Currency.EUR)) {
            limit = 150;
        }
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit = 0;
        if (currency.equals(Currency.USD)) {
            limit = 10000;
        }
        if (currency.equals(Currency.EUR)) {
            limit = 5000;
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
            rate = 0;
        }
        return rate;
    }

    @Override
    int getCommission(int summ) {
        int commission = 0;
        if (currency.equals(Currency.USD)) {
            commission = summ > 1000 ? 5 : 3;
        }
        if (currency.equals(Currency.EUR)) {
            commission = summ > 1000 ? 11 : 10;
        }
        return commission;
    }

    @Override
    public void withdrawOfUser(User user, int amount) {

        if (getLimitOfWithdrawal() > 0 && amount > getLimitOfWithdrawal()) {
            System.out.println("Withdraw is unable: request amount is out of Bank limit.");
            return;
        }

        amount += getCommission(amount) * amount;

        if (user.getBalance() - amount < 0) {
            System.out.println("Withdraw is unable: not enough of founds.");
            return;
        }

        user.setBalance(user.getBalance() - amount);

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
