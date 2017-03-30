package module_04.home_work;

/**
 * Created by voksus on 22.02.2017.
 */
public class Main {

    public static void main(String[] args) {

        Bank bank1 = new USBank();
        Bank bank2 = new EUBank();
        Bank bank3 = new ChinaBank();
        User user1 = new User("Vasya", 1001, 4, "GoIT", 1010, bank1);
        User user2 = new User("Sonya", 1002, 5, "GoIT", 1020, bank1);
        User user3 = new User("Petya", 1003, 6, "GoIT", 1030, bank2);
        User user4 = new User("Galya", 1004, 7, "GoIT", 1040, bank2);
        User user5 = new User("Kolya", 1005, 8, "GoIT", 1050, bank3);
        User user6 = new User("Lilya", 1006, 9, "GoIT", 1060, bank3);

        System.out.println(user1);
//        bank1.withdrawOfUser(user1, 500);
//        System.out.println(user1);
//        bank1.paySalary(user1);
//        System.out.println(user1);
//        bank1.fundUser(user1, 222);
//        System.out.println(user1);
//        bank1.transferMoney(user2, user1, 100);
        System.out.println(user1);
        System.out.println(user2);
//        System.out.println(user2);
//        System.out.println(user3);
//        System.out.println(user4);
//        System.out.println(user5);
//        System.out.println(user6);
    }
}