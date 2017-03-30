package module_05.home_work;

/**
 * Created by voksu on 02.03.2017.
 */
public class RoomDAO implements DAO {

    Room[] roomDB = new Room[10];

    @Override
    public Room save(Room room) {

        int count = getRoomsCount(roomDB);
        roomDB[count] = room;
        System.out.println("Комната #" + room.getId() + " сохранена.");
        return room;
    }

    private int getRoomsCount(Room[] roomDB) {
        int count = 0;
        for (Room room : roomDB) {
            if(room != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean delete(Room room) {

        for (int i = 0; i < roomDB.length; i++) {
            Room roomInDB = roomDB[i];
            if(room.equals(roomInDB)) {
                System.arraycopy(roomDB,i + 1, roomDB, i, roomDB.length - i - 1);
                roomDB[roomDB.length - 1] = null;
            }
        }

        System.out.println("Комната " + room.getClass().getSimpleName() + " удалена.");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Комната " + room.getClass().getSimpleName() + " обнавлена.");
        return null;
    }

    @Override
    public Room findById(long id) {

        for (Room room : roomDB) {
            if(room != null && room.getId() == id) {
                System.out.println("Комната #" + id + " найдена.");
                return room;
            }
        }
        System.out.println("Комната #" + id + " НЕ НАЙДЕНА.");
        return null;
    }

}