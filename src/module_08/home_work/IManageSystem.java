package module_08.home_work;

import java.util.List;

/**
 * Created by voksus on 30.03.2017.
 */
public interface IManageSystem {

    <T> save(T obj, double price);
    <T> save(T obj);
    void delete(T obj) ;
    void deleteById(int id);
    <T> get(int id);
    Double getPrice(T obj);
    Set<T> getProducts();
    List<Double> getPrices();

}