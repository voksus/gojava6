package module_09.offline;

/**
 * Created by voksus on 30.03.2017.
 */
public class Car {

    Startable engine = new Engine();

    private class Engine implements Startable {
    }

}