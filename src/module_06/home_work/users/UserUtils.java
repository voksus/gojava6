package module_06.home_work.users;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by voksus on 09.03.2017.
 */
public class UserUtils {

    static public User[] uniqueUsers(User[] users) {

        if (users == null) {
            return null;
        }

        User[] result = Arrays.copyOf(users, users.length);
        Set<User> set = new HashSet<>(Arrays.asList(result));
        result = set.toArray(new User[set.size()]);
        return result;
    }

    static public User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] result = new User[users.length];
        int count = 0;
        for (User user : users) {
            if (user.getBalance() == balance) {
                result[count++] = user;
            }
        }
        System.arraycopy(result, 0, result, 0, count);
        return result;
    }

    static final public void paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(
                    users[i].getId(),
                    users[i].getFirstName(),
                    users[i].getLastName(),
                    users[i].getSalary(),
                    users[i].getBalance() + users[i].getSalary());
        }
    }

    static final public long[] getUsersId(User[] users) {
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            result[i] = users[i].getId();
        }
        return result;
    }

    static public User[] deleteEmptyUsers(User[] users) {
        User[] result = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                result[count++] = users[i];
            }
        }
        result = Arrays.copyOf(result, count);
        return result;
    }

}