package module_08.offline;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by voksus on 23.03.2017.
 */
public class UseMap {

    public static void main(String[] args) {

        Map hashMap = new HashMap();
        Map treeMap = new TreeMap();
        Map linkedHashMap = new LinkedHashMap();

        String st3 = "Dubina";

        hashMap.put("007", 1);
        hashMap.put("Zzz..", 2);
        hashMap.put(st3, 3);

        System.out.println(hashMap.get(st3));

        Map<String, Integer> studentsList = new HashMap<>();

        studentsList.put("Pupkin", 1);
        studentsList.put("Dodikov", 1);
        studentsList.put("Zelenskiy", 2);
        studentsList.put("Koshevoy", 2);
        studentsList.put("Kravets", 3);
        studentsList.put("Lastochkin", 3);
        studentsList.put("Sevokha", 1);
        studentsList.put("Lirnyk", 2);
        studentsList.put("Patapenko", 1);
        studentsList.put("x", 3);

        System.out.println(studentsList.get("x"));
        System.out.println(studentsList.get("Sevokha"));

    }
}