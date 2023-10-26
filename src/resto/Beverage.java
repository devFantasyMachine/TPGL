package resto;




public abstract class Beverage {

    private String description;

    Beverage (String description){
        this.description = description;
    }

    public String getDescription(){return description;}

    public abstract Float cost();

}

