package module_04.offline.zoo.my_package;

import module_04.offline.zoo.Animal;
import module_04.offline.zoo.Zoo;

/**
 * Created by voksu on 16.02.2017.
 */
public class UseZooFramework {

    public static void main(String[] args) {

        Animal[] myAnimals = new Animal[1];

        myAnimals[0] = new Snake();

        Zoo.feedAllAnimals(myAnimals);
    }
}
