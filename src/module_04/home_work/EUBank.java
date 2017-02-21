package module_04.home_work;

/**
 * Created by voksus on 19.02.2017.
 */
public class EUBank extends Bank {

    Currency currency;

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
}
