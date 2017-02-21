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
}
