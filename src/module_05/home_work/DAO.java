package module_05.home_work;

/**
 * Created by voksus on 02.03.2017.
 */
public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);

}