package module_06.offline;

/**
 * Created by voksus on 02.03.2017.
 */
public class UseWorker {

    public static void main(String[] args) {

        Worker[] workersList = new Worker[10];

        workersList[0] = new WorkerByFixed(0, "", 1000);
        workersList[1] = new WorkerByFixed(1, "", 1001);
        workersList[2] = new WorkerByFixed(2, "", 2000);
        workersList[3] = new WorkerByFixed(3, "", 999);
        workersList[4] = new WorkerByFixed(4, "", 1234);
        workersList[5] = new WorkerByHours("", 5);
        workersList[6] = new WorkerByHours("", 10);
        workersList[7] = new WorkerByHours("", 15);
        workersList[8] = new WorkerByHours("", 20);
        workersList[9] = new WorkerByHours("", 5);


    }
}
