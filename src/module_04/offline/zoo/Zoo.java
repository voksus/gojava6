package module_04.offline.zoo;

/**
 * Created by voksu on 16.02.2017.
 */
public class Zoo {

    public static void main(String[] args) {

        Animal[] animalArray = new Animal[5];

        animalArray[0] = new Monkey();
        animalArray[1] = new Elefant();

        for (Animal animal : animalArray) {
            if(animal != null) animal.feed();
        }

    }

    public static void feedAllAnimals(Animal[] myAnimals) {

        for (Animal animal : myAnimals) {
            animal.feed();
        }

    }
}
