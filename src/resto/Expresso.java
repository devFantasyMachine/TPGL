package resto;

public class Expresso extends Beverage{

    public Expresso() {
        super("Expresso");
    }

    @Override
    public Float cost() {
        return 300F;
    }

}
