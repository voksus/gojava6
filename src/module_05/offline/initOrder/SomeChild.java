package module_05.offline.initOrder;

/**
 * Created by voksus on 23.02.2017.
 */
public class SomeChild extends SomeParent {

    private String className = "[" + getClass().getSimpleName() + "]";
    private String name = "Vova";
    private String secondName;
    private int years = calculate();

    {
        System.out.println(className + " initBlock");
        System.out.println(className + " secondName: " + secondName);

        secondName = name + years;

        System.out.println(className + " secondName: " + secondName);

    }

    public SomeChild() {
        super(5);

        System.out.println(className + " constructor");

    }

    private int calculate() {

        System.out.println(className + " Calcuate method");

        return 18;

    }
}