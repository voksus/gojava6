package module_11.offline;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by voksus on 20.04.2017.
 */
public class Main {

    public static void main(String[] args) {

        // prepare data
        List<Company> companyList = new ArrayList<>();
        Company c1 = new Company("Oranta");

        Division d1 = new Division("Security", c1);
        Division d2 = new Division("IT", c1);
        Division d3 = new Division("Client", c1);

        Person p1 = new Person("P1_name", "P1_lastNm");
        Person p2 = new Person("P2_name", "P2_lastNm");
        Person p3 = new Person("P3_name", "P3_lastNm");
        Person p4 = new Person("P4_name", "P4_lastNm");
        Person p5 = new Person("P5_name", "P5_lastNm");

        // execute code


        // test result
    }
}