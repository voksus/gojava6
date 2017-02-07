package module_03.homeWork.task33;

/**
 * Created by voksus on 07.02.2017.
 */
public class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;

    // constr1
    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    // constr2
    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    // constr3
    public CollegeStudent(String firstName, String lastName, int group,
                          Course[] coursesTaken, int age,
                          String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        super.setCoursesTaken(coursesTaken);
        super.setAge(age);
        setCollegeName(collegeName);
        setRating(rating);
        setId(id);
    }

    // Getters and Setters
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}