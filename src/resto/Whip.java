package resto;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super("Whip", beverage);
    }

    @Override
    public Float cost() {
        return this.beverage.cost() +  2.5F;
    }

}
