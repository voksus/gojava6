package module_06.home_work.citizen;

/**
 * Created by voksus on 09.03.2017.
 */
public class CitizenMain {

    public static void main(String[] args) {

        for(int i = 0; i < 7; i++) {
            CitizenFactory.generateCitizen();
        }

        CitizenFactory.showCitizens();
        CitizenFactory.citizenTalking();

    }

}