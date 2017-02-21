package module_04.offline.zoo.my_package;

import module_04.offline.zoo.Animal;

/**
 * Created by voksu on 16.02.2017.
 */
public class Snake extends Animal {
    @Override
    public void feed() {
        System.out.println("Snake eats mouse");
    }
}
