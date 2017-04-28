package module_11.offline;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by voksus on 20.04.2017.
 */
public class Division {

    private String name;
    private Company company;
    private List<Person> personList;

    public Division(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPerson(Person person) {

        checkPersonList();

        if (!personList.contains(person)) {
            personList.add(person);
            System.out.println("Person " + person + " was added in division " + name);
        } else {
            System.out.println("Person " + person + " already exists in division " + name);
        }

    }

    public void removePerson(Person person) {

        checkPersonList();

        if (!personList.remove(person)) {
            System.out.println("Person " + person + " was removed from division " + name);
        } else {
            System.out.println("Person " + person + " wasn't found in division " + name);
        }

    }

    private void checkPersonList() {

        if (personList == null) {
            personList = new ArrayList<>();
        }

    }
}