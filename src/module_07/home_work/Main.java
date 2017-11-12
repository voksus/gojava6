package module_07.home_work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Created by voksus on 20.03.2017.
 */
public class Main {

    private static ArrayList<User> users = createUsersList();
    private static ArrayList<Order> orders = createOrderList();

    public static void main(String[] args) {

        System.out.println(" Users: " + users);
        System.out.println("Orders: " + orders);

        System.out.println("\n--- ORDERS sorted by Price[dec] ---");
        Collections.sort(orders, (o1, o2) -> o2.getPrice() - o1.getPrice());
        orders.forEach(System.out::println);

        System.out.println("\n--- ORDERS sorted by Price and then by User_city ---");
        Collections.sort(orders, (o1, o2) -> {
            int priceComparator = ((Integer) (o1.getPrice())).compareTo(o2.getPrice());
            if (priceComparator != 0) {
                return priceComparator;
            }
            int shopComparator = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            if (shopComparator != 0) {
                return shopComparator;
            }
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        });
        orders.forEach(System.out::println);

        System.out.println("\n--- ORDERS sorted by Item_name, Shop_identifier and User_city ---");
        Collections.sort(orders, (o1, o2) -> {
            int nameComparator = o1.getItemName().compareTo(o2.getItemName());
            if (nameComparator != 0) {
                return nameComparator;
            }
            int shopComparator = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            if (shopComparator != 0) {
                return shopComparator;
            }
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        });
        orders.forEach(System.out::println);
    }

    static ArrayList<User> createUsersList() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Vasya", "Pupkin", "Kukiv", 1010));
        users.add(new User("Petya", "Petrov", "Bobruysk", 1020));
        users.add(new User("Vika", "Vuka", "Kalyma", 1030));
        users.add(new User("Tanya", "Banya", "Papskoe", 1040));
        users.add(new User("Alex", "Pipets", "Siberia", 1050));
        users.add(new User("Dolph", "Swan", "Glevakha", 1060));
        users.add(new User("Eva", "Dove", "Kukiv", 1070));
        users.add(new User("Linda", "Eagle", "Siberia", 1080));
        users.add(new User("Karen", "Blue", "Bobruysk", 1090));
        users.add(new User("James", "T", "Kukiv", 1100));
        return users;
    }

    static ArrayList<Order> createOrderList() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(users.get(0), 1, Currency.USD, "Spichki", "Silpo"));
        orders.add(new Order(users.get(1), 5, Currency.USD, "Moloko", "Silpo"));
        orders.add(new Order(users.get(2), 10, Currency.EUR, "Maslo", "Auchan"));
        orders.add(new Order(users.get(3), 99, Currency.EUR, "Viski", "Auchan"));
        orders.add(new Order(users.get(4), 10, Currency.UAH, "Maslo", "Billa"));
        orders.add(new Order(users.get(5), 5, Currency.UAH, "Plyushka", "Billa"));
        orders.add(new Order(users.get(6), 82, Currency.UAH, "Bochonok kvasa", "Megamarket"));
        orders.add(new Order(users.get(7), 50, Currency.UAH, "Sahar x5", "Megamarket"));
        orders.add(new Order(users.get(8), 5, Currency.UAH, "Zazhygalka", "Lerua Merlen"));
        orders.add(new Order(users.get(9), 3, Currency.UAH, "Tik-Tak", "Lerua Merlen"));
        return orders;
    }

}