package module_03.homeWork.task33;

import java.util.Date;

/**
 * Created by voksus on 07.02.2017.
 */
public class Solution {

    public static void main(String[] args) {

        Course course1 = new Course(new Date(453453212003L), "Vasya");
        Course course2 = new Course(100, "Petya", "Marivanna");

        Student student1 = new Student("Fedya", "Pupkin", 103);
        Student student2 = new Student("Kozlov", new Course[]{course1, course2});

        CollegeStudent collegeStudent1 = new CollegeStudent("Ivanidze",
                "Balishvili", 103);
        CollegeStudent collegeStudent2 = new CollegeStudent("Pepa", new Course[]{course1, course2});
        CollegeStudent collegeStudent3 = new CollegeStudent("Yom", "Li",
                103, new Course[]{course1, course2}, 25,
                "Cambridge", 5, 24872345762764L);

        SpecialStudent specialStudent1 = new SpecialStudent("Ali", "Abu", 103);
        SpecialStudent specialStudent2 = new SpecialStudent("Kolindin", new Course[]{course1, course2});
        SpecialStudent specialStudent3 = new SpecialStudent("Zhmodya", "Pukin",
                103, new Course[]{course1, course2}, 37,
                "KPI", 3, 76542098576L, 12345678900L)
    }

}