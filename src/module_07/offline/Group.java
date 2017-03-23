package module_07.offline;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by voksus on 09.03.2017.
 */
public class Group {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle( 2.3, 3.7));
        shapes.add(new Rectangle( 100.0, 10.0));
        shapes.add(new Rectangle( 0.999, 0.111));
        shapes.add(new Circle(1.23));
        shapes.add(new Circle(0.001));
        shapes.add(new Square(777.0));

        areasOut(shapes);

        System.out.println("\n" + getMinArea(shapes));
    }

    private static double getMinArea(List<Shape> shapes) {

        if(shapes.size() == 0) {
            return 0.0;
        }

        double result = shapes.get(0).getArea();
        for (Shape shape :shapes) {
            if(shape.getArea() < result) {
                result = shape.getArea();
            }
        }
        return result;
    }

    private static void areasOut(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }

}