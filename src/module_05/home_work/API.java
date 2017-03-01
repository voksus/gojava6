package module_05.home_work;

/**
 * Created by voksus on 02.03.2017.
 */
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

}