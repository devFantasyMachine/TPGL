package resto;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super("HouseBlend");
    }

    @Override
    public Float cost() {
        return 100F;
    }

}
