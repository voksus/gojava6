package module_03.homeWork.task33;

/**
 * Created by voksus on 07.02.2017.
 */
public class Student {

    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

    // constr1
    public Student(String firstName, String lastName, int group) {
        setFirstName(firstName);
        setLastName(lastName);
        setGroup(group);
    }

    // constr2
    public Student(String lastName, Course[] coursesTaken) {
        setLastName(lastName);
        setCoursesTaken(coursesTaken);
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}