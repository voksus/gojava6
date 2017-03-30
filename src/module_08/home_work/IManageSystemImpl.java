package module_08.home_work;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by voksus on 30.03.2017.
 */
public class IManageSystemImpl implements IManageSystem {

    private static Map<Food, Double> database = new HashMap<>();

    public <T> IManageSystemImpl(T obj, double price) {

    }

    public <T> IManageSystemImpl(T obj) {

    }

    @Override
    public void delete(T obj) {

    }

    @Override
    public void deleteById(int id) {

    }

    public <T> IManageSystemImpl(int id) {

    }

    @Override
    public Double getPrice(T obj) {
        return null;
    }

    @Override
    public Set<T> getProducts() {
        return null;
    }

    @Override
    public List<Double> getPrices() {
        return null;
    }

    void printProductsSortedByName() {
        //TO DO
        //make sorting by name
        System.out.println(database);
    }

    void printProductsSortedByPrice() {
        //TO DO
        //make sorting by price
        System.out.println(database);
    }

}