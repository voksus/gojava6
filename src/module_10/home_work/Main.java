package module_10.home_work;

/**
 * Created by voksus on 25.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        // 10.1
        System.out.println("10.1 :");
        try {
            throw new Exception("Throw new Exception");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block passed.");
        }
        System.out.println("Done...");

        pause();
        // 10.2
        System.out.println("\n10.2 :");
        MyNullPointerException myNPE = new MyNullPointerException("Creating my NPE");
        try {
            throw myNPE;
        } catch (MyNullPointerException e) {
            e.showExceptionMessage();
        }
        System.out.println("Done...");

        pause();
        // 10.3
        System.out.println("\n10.3 :");
        String s = null;
        try {
            s.hashCode();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("Done...");

        pause();
        // 10.4
        System.out.println("\n10.4");
        try {
            f();
        } catch (Exception e) {
            System.out.println("Methods f() and g() fails");
            e.printStackTrace();
        }

        pause();
        // 10.5
        System.out.println("\n10.5");
        try {
            ThrowThreeNewExceptions.throwNewExceptions();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void f() throws NullPointerException {
        try {
            g();
        } catch (MyNullPointerException e) {
            throw new MyNullPointerException("method g() failed");
        } finally {
            System.out.println("Finally in f()");
        }
    }

    private static void g() {
        throw new MyNullPointerException("This is method g()");
    }

    private static void pause() {
        long pause = 200;
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - pause < start) {
        }
    }

}