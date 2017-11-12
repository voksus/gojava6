package module_08.home_work;

/**
 * Created by voksus on 30.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        Food food1 = new Food("Konfety", Country.UKRAINE, 12);
        Food food2 = new Food("Bublik", Country.GERMANY, 1);
        Food food3 = new Food("Makarony", Country.USA, 8);
        Food food4 = new Food("Muka", Country.POLAND, 6);
        Food food5 = new Food("Limon", Country.LITHUANIA, 4);

        IManageSystem<Food> manageSystem = new IManageSystemImpl<>();
        manageSystem.save(food1);
        manageSystem.save(food2);
        manageSystem.save(food3);
        manageSystem.save(food4, 8);
        manageSystem.save(food5, 2);

        System.out.println("Save products with new price:");
        manageSystem.save(food1, 25);
        System.out.println("Done.\n");

        System.out.println("Save products w/o price:");
        manageSystem.save(food5);
        System.out.println("Done.\n");

        System.out.println("Delete specific product fron DB.");
        manageSystem.delete(food2);
        System.out.println("Done.\n");

        System.out.println("Delete product by id:");
        manageSystem.deleteById(3);
        System.out.println("Done.\n");

        System.out.println("Get products by specific id:");
        System.out.println(manageSystem.get(4));
        System.out.println("Done.\n");

        System.out.println("Get price from specific product:");
        Double price1 = manageSystem.getPrice(food1);
        System.out.println(price1);
        System.out.println("Done.\n");

        System.out.println("Get all products:");
        manageSystem.getProducts();
        System.out.println("Done.\n");

        System.out.println("Get all prices of products:");
        manageSystem.getPrices();
        System.out.println("Done.\n");

        // Additional :
        System.out.println("Sorting products by name:");
        manageSystem.printProductsSortedByName();
        System.out.println("Done.\n");

        System.out.println("Sorting products by price:");
        manageSystem.printProductsSortedByPrice();
        System.out.println("Done.\n");
    }

}