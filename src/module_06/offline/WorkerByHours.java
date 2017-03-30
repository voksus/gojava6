package module_06.offline;

/**
 * Created by voksus on 02.03.2017.
 */
public class WorkerByHours extends Worker {

    private double hourlyRate;

    public WorkerByHours(String s, int i) {

    }

//    public WorkerByHours(int id, String name, double hourRate) {
//        setId(id);
//        setName(name);
//        this.hourlyRate = hourRate;
//    }

    @Override
    public double getSalary() {
        return 20.8 * 8 * hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}