package resto;


public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    CondimentDecorator(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + super.getDescription();
    }


}
