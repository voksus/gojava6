package module_03.home_work.task3;

/**
 * Created by voksus on 07.02.2017.
 */
public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    // constr1
    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    // constr2
    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    // constr3
    public SpecialStudent(long secretKey) {
        super("", "", 0);
        this.secretKey = secretKey;
    }

    // Getters and Setters
    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}