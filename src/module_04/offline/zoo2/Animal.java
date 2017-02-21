package module_04.offline.zoo2;

/**
 * Created by voksu on 16.02.2017.
 */
public abstract class Animal {

    private String foodName;
    private String name;

    public void feed() {
        System.out.println(getClass().getSimpleName() + " " + name + " love to eat " + foodName + ".");
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
