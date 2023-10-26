package resto;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super("Soy", beverage);
    }

    @Override
    public Float cost() {
        return this.beverage.cost() +  0.5F;
    }

}
