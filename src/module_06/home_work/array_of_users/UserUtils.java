package module_06.home_work.array_of_users;

import java.util.Arrays;

/**
 * Created by voksus on 09.03.2017.
 */
public class UserUtils {

    public User[] uniqueUsers(User[] users) {
        if(users == null) {
            return null;
        }

        User[] result = Arrays.copyOf(users, users.length);
        for(int i = 0; i < result.length; i++) {
            boolean contains = false;

            for(int q = 0; q < i - 1;) {
                if(result[i].equals(result[q])) {
                    contains = true;
                    System.arraycopy(result, 0 , result, 0, q - 1);
                    q = 0;
                } else {
                    q++;
                }
            }
        }
        return users;
    }

    public User[] usersWithContitionalBalance(User[] users, int balance) {

    } // – находит и возвращает пользователей, чей баланс равен заданному

    public User[]  paySalaryToUsers(User[] users) {

    } // – начисляет зарплату в баланс каждому пользователю

    public long[] getUsersId(User[] users) {

    } // – возвращает массив идентификаторов пользователей

    public User[] deleteEmptyUsers(User[] users) {

    } // – находит и удаляет пустые элементы из массива (в результате возвращается новый массив с меньшим размером)

//    Удостоверьтесь, что методы paySalaryToUsers и getUsersId не могут быть перезаписаны в других классах.

}