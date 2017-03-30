package module_04.home_work;

/**
 * Created by voksus on 19.02.2017.
 */
public class EUBank extends Bank {

    Currency currency = Currency.EUR;

    @Override
    int getLimitOfWithdrawal() {
        int limit = 0;
        if (currency.equals(Currency.USD)) {
            limit = 2000;
        }
        if (currency.equals(Currency.EUR)) {
            limit = 2200;
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
            limit = 20000;
        }
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate = 0;
        if (currency.equals(Currency.USD)) {
            rate = 0;
        }
        if (currency.equals(Currency.EUR)) {
            rate = 1;
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
            commission = summ > 1000 ? 4 : 2;
        }
        return commission;
    }

//    @Override
//    public void withdrawOfUser(User user, int amount) {
//
//        if (getLimitOfWithdrawal() > 0 && amount > getLimitOfWithdrawal()) {
//            System.out.println("Withdraw is unable: request amount is out of Bank limit.");
//            return;
//        }
//
//        System.out.println("Withdraw " + amount + currency.toString());
//        System.out.println("Commission is: " + getCommission(amount) + "%");
//        amount += (int) (getCommission(amount) * amount / 100.0);
//
//        if (user.getBalance() - amount < 0) {
//            System.out.println("Withdraw is unable: not enough of founds.");
//            return;
//        }
//
//        user.setBalance(user.getBalance() - amount);
//        System.out.println("Your balance was changed.\n");
//
//    }

//    @Override
//    public void fundUser(User user, int amount) {
//
//        System.out.println("Founding " + amount + currency.toString() + " to " + user.getName());
//        if (getLimitOfFunding() > 0 && amount > getLimitOfFunding()) {
//            System.out.println("Founding is unable: trying to found more then Bank limit.");
//            return;
//        }
//
//        user.setBalance(user.getBalance() + amount);
//        System.out.println("Your balance was changed.\n");
//
//    }

//    @Override
//    public void transferMoney(User fromUser, User toUser, int amount) {
//
//        if (fromUser.equals(toUser)) {
//            System.out.println("You trying transfer money to yourself.\nSuch transferring is imposible.");
//            return;
//        }
//
//        double toUserCurrentBalance = toUser.getBalance(), fromUserCurrentBalance = fromUser.getBalance();
//
//        System.out.println("Transferring the money...");
//        fundUser(toUser, amount);
//        withdrawOfUser(fromUser, amount);
//
//        if (toUser.getBalance() == toUserCurrentBalance || fromUser.getBalance() == fromUserCurrentBalance) {
//            System.out.println("Transferring is imposible.");
//            // tyring undo the withdraw and/or found operation
//            toUser.setBalance(toUserCurrentBalance);
//            fromUser.setBalance(fromUserCurrentBalance);
//        }
//
//        System.out.println("Success. Both balances was changed.\n");
//
//    }

//    @Override
//    public void paySalary(User user) {
//
//        int amount = user.getSalary();
//        System.out.println("Earn you salary. Amount: " + amount + currency.toString());
//        user.setBalance(user.getBalance() + amount);
//        System.out.println("Your balance was changed.\n");
//
//    }

}