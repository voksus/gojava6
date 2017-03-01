package module_05.offline.task1;

/**
 * Created by voksu on 23.02.2017.
 */
public class UseConverter {

    public static void main(String[] args) {

        Converter converter = new Converter(27.1);
        System.out.println(converter.convert(3_000));
        System.out.println(converter.convert(10_000));
        System.out.println(converter.convert(100_000));

    }

}