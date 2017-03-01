package module_05.offline.task1;

import java.math.BigDecimal;

/**
 * Created by voksus on 23.02.2017.
 */
public class Converter {

    private double course;

    Converter(double course) {
        this.course = course;
    }

    double convert(double uah) {

        double usd = new BigDecimal(uah / course).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return usd;

    }

}