package module_03.home_work.task1;

/**
 * Created by voksus on 07.02.2017.
 */
public class Bird {

    public static void main(String[] args) {

        Bird bird = new Bird();

        bird.sing("I am walking");
        bird.sing("I am flying");
        bird.sing("I am singing");
        bird.sing("I am Bird");

    }

    private static void sing(String lyrics) {
        System.out.println(lyrics);
    }
}