package module_06.home_work.users;

import java.util.Arrays;

/**
 * Created by voksus on 09.03.2017.
 */
public class UsersMain {

    public static void main(String[] args) {

        User user1 = new User(1, "First", "1st", 1001, 5000);
        User user21 = new User(2, "Second", "2nd", 1002, 4990);
        User user22 = new User(2, "Second", "2nd", 1002, 4990);
        User user3 = new User(3, "Third", "3rd", 1003, 1000);
        User user4 = new User(4, "Forth", "4th", 1004, 3333);
        User user10 = new User(10, "Fifth", "5th", 1005, 99999);

        User[] users = {user1, user21, user3, null , user4, user10, null, user22};

        System.out.println(Arrays.deepToString(users));
        users = UserUtils.deleteEmptyUsers(users);
        System.out.println(Arrays.deepToString(users));
        users = UserUtils.uniqueUsers(users);
        System.out.println(Arrays.deepToString(users));

        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));

        System.out.println(users[0].toStringDetailed());
        System.out.println(users[4].toStringDetailed());
        UserUtils.paySalaryToUsers(users);
        System.out.println(users[0].toStringDetailed());
        System.out.println(users[4].toStringDetailed());
    }
}