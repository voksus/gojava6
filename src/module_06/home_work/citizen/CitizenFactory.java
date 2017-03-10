package module_06.home_work.citizen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by voksus on 09.03.2017.
 */
public class CitizenFactory {

    static Random rnd = new Random();
    private static List<Citizen> citizens = new ArrayList<>();

    public static void generateCitizen() {
        switch (rnd.nextInt(4)) {
            case 0:
                citizens.add(createEnglishman());
                break;
            case 1:
                citizens.add(createChinese());
                break;
            case 2:
                citizens.add(createRussian());
                break;
            case 3:
                citizens.add(createItalian());
        }
    }

    static public Citizen createEnglishman() {
        return new Englishman();
    }

    static public Citizen createChinese() {
        return new Chinese();
    }

    static public Citizen createRussian() {
        return new Russian();
    }

    static public Citizen createItalian() {
        return new Italian();
    }

    private static class Englishman implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello");
        }

        @Override
        public String toString() {
            return "Englishman";
        }
    }

    private static class Chinese implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("你好");
        }

        @Override
        public String toString() {
            return "Chinese";
        }
    }

    private static class Russian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Привет");
        }

        @Override
        public String toString() {
            return "Russian";
        }
    }

    private static class Italian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Ciao");
        }

        @Override
        public String toString() {
            return "Italian";
        }
    }

    public static void showCitizens() {
        for(Citizen citizen : citizens) {
            System.out.println(citizen);
        }
    }

    public static void citizenTalking() {
        for(Citizen citizen : citizens) {
            citizen.sayHello();
        }
    }
}