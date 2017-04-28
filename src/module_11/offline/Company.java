package module_11.offline;

import java.util.List;

/**
 * Created by voksus on 20.04.2017.
 */
public class Company {

    private String name;
    private List<Division> divisionList;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}