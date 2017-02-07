package module_03.homeWork.task33;

import java.util.Date;

/**
 * Created by voksus on 07.02.2017.
 */
public class Course {

    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    // constr1
    public Course(Date startDate, String name) {
        setStartDate(startDate);
        setName(name);
    }

    // constr2
    public Course(int hoursDuration, String name, String teacherName) {
        setHoursDuration(hoursDuration);
        setName(name);
        setTeacherName(teacherName);
    }

    // Getters and Setters
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

}