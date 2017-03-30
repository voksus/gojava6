package module_06.offline;

/**
 * Created by voksus on 02.03.2017.
 */
public class WorkerByFixed extends Worker {

    public WorkerByFixed(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double getSalary() {
        return 1000;
    }

}