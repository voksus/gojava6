package module_01.offline;

/**
 * Created by voksus on 09.02.2017.
 */
public class UseNissanToGetParis extends NissanJukeCar{

    public UseNissanToGetParis(String color) {
        super(color);
    }

    public static void main(String[] args) {

        NissanJukeCar myCar = null;

        System.out.println(myCar);

        myCar = new NissanJukeCar("red");

        System.out.println("DOORS: " + myCar.doorsAmount);

        System.out.println("Color: " + myCar.color);

//        for (Wheal wheal : myCar.wheals){
//            System.out.println(wheal);
//        }

        System.out.println("Color: " + myCar.color);

        NissanJukeCar familyCar = null;

        System.out.println("Family car color: " + familyCar.color);

        boolean areWeInParis = myCar.goToDestination("Paris");

        System.out.println("Are we in Paris?" + (areWeInParis ? "YES!" : "NO"));

        for (int i = 0; i < myCar.wheals.length; i++) {
            myCar.wheals[i] = new Wheal(i);
        }
    }
}