package module_07.home_work;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Comparator;

/**
 * Created by voksus on 20.03.2017.
 */
public class Order implements Comparable<Order> {

    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    private static long idAI = 0;

    public Order(User user, int price, Currency currency, String itemName, String shopIdentificator) {
        id = ++idAI;
        this.user = user;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (!itemName.equals(order.itemName)) return false;
        if (!shopIdentificator.equals(order.shopIdentificator)) return false;
        return user.equals(order.user);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + currency.hashCode();
        result = 31 * result + itemName.hashCode();
        result = 31 * result + shopIdentificator.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }

    @Override
    public int compareTo(Order o) {
        int priceComparator = ((Integer) getPrice()).compareTo(o.getPrice());
        if (priceComparator != 0) return priceComparator;

        int nameComparator = getItemName().compareTo(o.getItemName());
        if (nameComparator != 0) return nameComparator;

        int shopComparator = getShopIdentificator().compareTo(o.getShopIdentificator());
        if (shopComparator != 0) return shopComparator;

        int userByIdComparator = ((Long) getUser().getId()).compareTo(o.getUser().getId());
        if (userByIdComparator != 0) return userByIdComparator;

        return getCurrency().compareTo(o.getCurrency());
    }

//    public static Comparator<Order> comparePriceDec = new Comparator<Order>() {
//        @Override
//        public int compare(Order o1, Order o2) {
//            return -Integer.compare(o1.getPrice(), o2.getPrice());
//        }
//    };
//
//    public static Comparator<Order> comparePriceInc = new Comparator<Order>() {
//        @Override
//        public int compare(Order o1, Order o2) {
//            if (Integer.compare(o1.getPrice(), o2.getPrice()) != 0) {
//                return Integer.compare(o1.getPrice(), o2.getPrice());
//            } else
//                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
//        }
//    };

    @Override
    public String toString() {
        return "{ " +
                "ID " + id +
                ": named '" + itemName + '\'' +
                " for " + price + " " +
                currency.name() +
                ", shop '" + shopIdentificator + '\'' +
                ", userID #" + user.getId() +
                " }";
    }
}