package module_05.home_work;

import java.util.Date;

/**
 * Created by voksus on 02.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        RoomDAO roomDAO = new RoomDAO();

        for(int i = 1; i < 11; i++) {
            roomDAO.save(new Room(i, 100 * i, 2, new Date(), "Bubu", "Kyiv"));
        }

        roomDAO.delete(new Room(4, 400, 2, new Date(), "Bubu", "Kyiv"));
        roomDAO.delete(new Room(8, 800, 2, new Date(), "Bubu", "Kyiv"));

        for (int i = 1; i < 11; i++) {
            Room room = roomDAO.findById(i);
        }

    }
}
