package module_05.offline.initOrder;

/**
 * Created by voksu on 23.02.2017.
 */
public class SomeParent {

    protected String className = "[ PARENT ]";
    private int yearsParent = calculateParentYears();

    private int calculateParentYears() {
        System.out.println(className + " Calcuate parent years");
        return 100;
    }

    {
        System.out.println(className + " init block");
    }

    public SomeParent(int years) {
        System.out.println(className + " constructor");
    }
}