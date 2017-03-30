package module_04.home_work;

/**
 * Created by voksu on 22.02.2017.
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {

        Object o = new Object();
        o.equals(o);
    }

//    int getLimitOfWithdrawal(User user) {
//        int limit = 0;
//        if (user.getBank().getCurrency().equals(Currency.USD)) {
//            limit = user.getBank().getLimitOfWithdrawalUSD();
//        }
//        if (user.getBank().getCurrency().equals(Currency.EUR)) {
//            limit = user.getBank().getLimitOfWithdrawalEUR();
//        }
//        return limit;
//    }

    int getLimitOfFunding(User user) {
        int limit = 0;
        if (user.getBank().getCurrency().equals(Currency.USD)) {
            limit = Integer.MAX_VALUE;
        }
        if (user.getBank().getCurrency().equals(Currency.EUR)) {
            limit = 10000;
        }
        return limit;
    }

    int getMonthlyRate(User user) {
        int rate = 0;
        if (user.getBank().getCurrency().equals(Currency.USD)) {
            rate = 1;
        }
        if (user.getBank().getCurrency().equals(Currency.EUR)) {
            rate = 2;
        }
        return rate;
    }

//    static int getCommission(User user, int summ) {
//        int commission = 0;
//        if (user.getBank().getCurrency().equals(Currency.USD)) {
//            commission = summ > user.getBank().getCommissionLimit() ? user.getBank().getCommission1USD() : user.getBank().getCommission2USD();
//        }
//        if (user.getBank().getCurrency().equals(Currency.EUR)) {
//            commission = summ > user.getBank().getCommissionLimit() ? user.getBank().getCommission1EUR() : user.getBank().getCommission2EUR();
//        }
//        return commission;
//    }

//    public void withdrawOfUser(User user, int amount) {
//
//        if (getLimitOfWithdrawal(user) > 0 && amount > getLimitOfWithdrawal(user)) {
//            System.out.println("Withdraw is unable: request amount is out of Bank limit.");
//            return;
//        }
//
//        System.out.println("Withdraw " + amount + user.getBank().getCurrency().toString());
//        System.out.println("Commission is: " + getCommission(user, amount) + "%");
//        amount += (int) (getCommission(user, amount) * amount / 100.0);
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

    @Override
    public void fundUser(User user, int amount) {

        System.out.println("Founding " + amount + user.getBank().getCurrency().toString() + " to " + user.getName());
        if (getLimitOfFunding(user) > 0 && amount > getLimitOfFunding(user)) {
            System.out.println("Founding is unable: trying to found more then Bank limit.");
            return;
        }

        user.setBalance(user.getBalance() + amount);
        System.out.println("Your balance was changed.\n");

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if (fromUser.equals(toUser)) {
            System.out.println("You trying transfer money to yourself.\nSuch transferring is imposible.");
            return;
        }

        double toUserCurrentBalance = toUser.getBalance(), fromUserCurrentBalance = fromUser.getBalance();

        System.out.println("Transferring the money...");
        fundUser(toUser, amount);
        withdrawOfUser(fromUser, amount);

        if (toUser.getBalance() == toUserCurrentBalance || fromUser.getBalance() == fromUserCurrentBalance) {
            System.out.println("Transferring is imposible.");
            // tyring undo the withdraw and/or found operation
            toUser.setBalance(toUserCurrentBalance);
            fromUser.setBalance(fromUserCurrentBalance);
        }

        System.out.println("Success. Both balances was changed.\n");

    }

    @Override
    public void paySalary(User user) {

        int amount = user.getSalary();
        System.out.println("Earn " + user.getName() + "'s salary. Amount: " + amount + user.getBank().getCurrency().toString());
        user.setBalance(user.getBalance() + amount);
        System.out.println("Your balance was changed.\n");

    }

}