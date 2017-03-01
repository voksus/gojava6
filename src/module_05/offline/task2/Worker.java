package module_05.offline.task2;

/**
 * Created by voksu on 23.02.2017.
 */
public class Worker extends Person {

    String addres;
    double salary;

    public Worker(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}