package module_08.home_work;

import java.util.*;

/**
 * Created by voksus on 30.03.2017.
 */
public class IManageSystemImpl<T extends Food> implements IManageSystem<T> {

    private Map<T, Double> database = new HashMap<>();

    @Override
    public T save(T obj, double price) {
        database.put(obj, price);
        return obj;
    }

    @Override
    public T save(T obj) {
        database.put(obj, null);
        return obj;
    }

    @Override
    public void delete(T obj) {
        database.remove(obj);
    }

    @Override
    public void deleteById(int id) {
        database.remove(get(id));
        System.out.println("Food with ID=" + id + " deleted");
    }

    @Override
    public T get(int id) {
        for (Map.Entry<T, Double> foodDoubleEntry : database.entrySet()) {
            if (id == foodDoubleEntry.getKey().getId())
                return foodDoubleEntry.getKey();
        }
        return null;
    }

    @Override
    public Double getPrice(T obj) {
        Set<Map.Entry<T, Double>> entries = database.entrySet();
        for (Map.Entry<T, Double> entry : entries) {
            if (entry.getKey().equals(obj)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Set<T> getProducts() {
        Set<T> products = database.keySet();
        for (T product : products) {
            System.out.println(product);
        }
        return products;
    }

    @Override
    public List<Double> getPrices() {
        List<Double> prices = new ArrayList<>(database.values());
        for (Double aDouble : prices) {
            System.out.println(aDouble);
        }
        return prices;
    }

    public void printProductsSortedByName() {
        Map<T, Double> dbByNames = new TreeMap<>((o1, o2) -> o1.getName().compareTo(o2.getName()));

        dbByNames.putAll(database);

        System.out.println("Sorted by food's names:");

        for (Map.Entry<T, Double> doubleEntry : dbByNames.entrySet()) {
            System.out.println(doubleEntry.getKey() + " : price " + doubleEntry.getValue());
        }
    }

    public void printProductsSortedByPrice() {
        List<Map.Entry<T, Double>> nullPrices = new ArrayList();
        List<Map.Entry<T, Double>> notNullPrices = new ArrayList();

        for (Map.Entry<T, Double> tDoubleEntry : database.entrySet()) {
            if (tDoubleEntry.getValue() == null)
                nullPrices.add(tDoubleEntry);
            else
                notNullPrices.add(tDoubleEntry);
        }

        notNullPrices.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        System.out.println("Sorted by food's price:");
        for (Map.Entry<T, Double> nullPrice : nullPrices) {
            System.out.println(nullPrice.getKey() + " : price " + nullPrice.getValue());
        }
        for (Map.Entry<T, Double> notNullPrice : notNullPrices) {
            System.out.println(notNullPrice.getKey() + " : price " + notNullPrice.getValue());
        }
    }

}