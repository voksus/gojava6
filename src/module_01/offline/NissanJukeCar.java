package module_01.offline;

/**
 * Created by voksus on 09.02.2017.
 */
public class NissanJukeCar {

    Wheal[] wheals = new Wheal[4];
    double engineValue = 1.6;
    int doorsAmount = 5;
    double petrol = 20;
    String name = null;

    String color;

    public boolean goToDestination(String cityName){
        if(petrol <= 0) {
            return false;
        }

        System.out.println("Uhoo! We are in " + cityName);
        return true;
    }

    public NissanJukeCar(String color) {
        this.color = color;
    }

}