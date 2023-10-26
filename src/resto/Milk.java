package resto;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super("Milk", beverage);
    }

    @Override
    public Float cost() {
        return this.beverage.cost() +  10F;
    }

}
