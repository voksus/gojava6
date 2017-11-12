package module_07.home_work;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class MainWithTreeSet {

    private static ArrayList<User> users = createUsersList();
    private static Set<Order> orders = createOrderSet();

    public static void main(String[] args) {

        System.out.println(" Users: " + users);
        System.out.println("Orders: " + orders);

        System.out.println("\n--- Check orders where buyer is Petrov ---");
        showOrdersOfUserByLastName("Petrov");

        System.out.println("\n--- Show Order with biggest price using only set method - get ---");
        System.out.println(orders.stream().max(Order::compareTo));

        System.out.println("\n--- Remove all orders with currency USD ---");
        removeOrdersWithUsd(orders);
        orders.forEach(System.out::println);
    }

    static ArrayList<User> createUsersList() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Dolph", "Swan", "Glevakha", 1060));
        users.add(new User("Eva", "Dove", "Kukiv", 1070));
        users.add(new User("Linda", "Eagle", "Siberia", 1080));
        users.add(new User("Karen", "Blue", "Bobruysk", 1090));
        users.add(new User("James", "T", "Kukiv", 1100));
        users.add(new User("Vasya", "Pupkin", "Kukiv", 1010));
        users.add(new User("Petya", "Petrov", "Bobruysk", 1020));
        users.add(new User("Vika", "Vuka", "Kalyma", 1030));
        users.add(new User("Tanya", "Banya", "Papskoe", 1040));
        users.add(new User("Alex", "Pipets", "Siberia", 1050));
        return users;
    }

    static Set<Order> createOrderSet() {
        Set<Order> orders = new TreeSet<>();
        orders.add(new Order(users.get(0), 1, Currency.USD, "Spichki", "Silpo"));
        orders.add(new Order(users.get(1), 5, Currency.USD, "Moloko", "Silpo"));
        orders.add(new Order(users.get(2), 10, Currency.EUR, "Maslo", "Auchan"));
        orders.add(new Order(users.get(2), 10, Currency.EUR, "Maslo", "Auchan"));
        orders.add(new Order(users.get(3), 99, Currency.EUR, "Viski", "Auchan"));
        orders.add(new Order(users.get(4), 5, Currency.UAH, "Plyushka", "Billa"));
        orders.add(new Order(users.get(5), 82, Currency.UAH, "Bochonok kvasa", "Megamarket"));
        orders.add(new Order(users.get(6), 50, Currency.UAH, "Sahar x5", "Megamarket"));
        orders.add(new Order(users.get(7), 5, Currency.UAH, "Zazhygalka", "Lerua Merlen"));
        orders.add(new Order(users.get(8), 3, Currency.UAH, "Tik-Tak", "Lerua Merlen"));
        return orders;
    }

    static void showOrdersOfUserByLastName(String lastName) {
        orders.stream().filter(o -> o.getUser().getLastName().equals(lastName)).forEach(System.out::println);
    }

    static void removeOrdersWithUsd(Set<Order> orders) {
        orders.removeIf(order -> order.getCurrency() == Currency.USD);
    }

}