package module_05.offline.task2;

/**
 * Created by voksus on 23.02.2017.
 */
public class UseWorker {

    public static void main(String[] args) {

        Worker[] array = new Worker[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Worker(1000_000_000_000d * 1000_000_000_000d);
        }

        double sum = 0;

        for (Worker workes : array) {
            sum += workes.getSalary();
        }

        System.out.println(sum);
    }

}