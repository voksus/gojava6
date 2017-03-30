package module_06.offline;

/**
 * Created by voksus on 02.03.2017.
 */
public abstract class Worker extends Person {
    private String adress;
    private double salary;

    public Worker(){};

    public Worker(int id, String name, double salary) {
        setId(id);
        setName(name);
        this.salary = salary;
    }

    public abstract double getSalary();

}