package menu;


public final class MenuItem implements MenuComponent {

    private String name;
    private String description;
    private Float price;
    private Boolean isVegetarian;

    public MenuItem(String name, String description, Float price, Boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Float getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public void print() {

        System.out.println("MenuItem " + name + "(" + description + ") " + " price: " + price);
    }


    @Override
    public void accept(MenuComponentVisitor menuComponentVisitor) {
        menuComponentVisitor.visiteMenuItem(this);
    }
}
