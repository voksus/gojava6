package module_07.offline;

/**
 * Created by voksus on 09.03.2017.
 */
public class Square extends Rectangle {

    private double side = super.getSideA();

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}