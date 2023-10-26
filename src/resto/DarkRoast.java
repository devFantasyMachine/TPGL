package resto;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super("DarkRoast");
    }

    @Override
    public Float cost() {
        return 200F;
    }

}
