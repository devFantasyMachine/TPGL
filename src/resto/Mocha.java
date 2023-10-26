package resto;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super("Mocha", beverage);
    }

    @Override
    public Float cost() {
        return this.beverage.cost() +  7.5F;
    }

}

