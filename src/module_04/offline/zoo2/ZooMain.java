package module_04.offline.zoo2;

import java.util.Arrays;

/**
 * Created by voksu on 16.02.2017.
 */
public class ZooMain {

    public static void main(String[] args) {

        Animal[] animalsArray = new Animal[2];

        animalsArray[0] = new Parrot();
        animalsArray[1] = new Snake();

        Owl owlSonya = new Owl();
        animalsArray = addAnimalToArray(animalsArray, owlSonya);

        feedAllAnimals(animalsArray);
    }

    private static void feedAllAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    private static Animal[] addAnimalToArray(Animal[] animals, Animal animal) {

        Animal[] newArrayOfAnimals = Arrays.copyOf(animals, animals.length + 1);
        newArrayOfAnimals[newArrayOfAnimals.length - 1] = animal;

        return newArrayOfAnimals;
    }
}