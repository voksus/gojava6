package module_08.home_work;

/**
 * Created by voksus on 30.03.2017.
 */
public class IdGenerator {

    private static int id = 0;

    public static int generateId() {
        return id++;
    }
}