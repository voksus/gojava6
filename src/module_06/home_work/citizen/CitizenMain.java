package module_06.home_work.citizen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by voksus on 09.03.2017.
 */
public class CitizenMain {

    private static List<Citizen> citizens = new ArrayList<>();
    private static Random rnd = new Random();

    public static void main(String[] args) {

        for(int i = 0; i < 7; i++) {
            switch (rnd.nextInt(4)) {
                case 0:
                    citizens.add(CitizenFactory.createEnglishman());
                    break;
                case 1:
                    citizens.add(CitizenFactory.createChinese());
                    break;
                case 2:
                    citizens.add(CitizenFactory.createRussian());
                    break;
                case 3:
                    citizens.add(CitizenFactory.createItalian());
            }
        }

        for(Citizen citizen : citizens) {
            System.out.println(citizen);
        }

        for(Citizen citizen : citizens) {
            citizen.sayHello();
        }

    }

}