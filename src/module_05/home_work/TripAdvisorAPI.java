package module_05.home_work;

import java.util.Date;

/**
 * Created by voksus on 02.03.2017.
 */
public class TripAdvisorAPI implements API {

    Room[] room = new Room[5];

    public TripAdvisorAPI() {

        for (int i = 0; i < room.length; i++) {
            room[i] = new Room(i, i * 100 + 1, i + 1, new Date(), "GoIT" + i, "Kykiv");
        }
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

}