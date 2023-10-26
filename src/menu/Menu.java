package menu;

import java.util.ArrayList;
import java.util.List;

public final class Menu implements MenuComponent {

    private String name;
    private String description;
    private Float price;
    private Boolean isVegetarian;


    private List<MenuComponent> components;

    public Menu(String name, String description, Float price, Boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;

        this.components = new ArrayList<>();
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

        System.out.println("=======================START MENU============================");
        System.out.println("Menu " + name + "(" + description + ")");
        components.forEach(MenuComponent::print);
        System.out.println("========================END MENU=============================");
    }


    @Override
    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        components.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int childId) {
        return components.get(childId);
    }


    @Override
    public void accept(MenuComponentVisitor menuComponentVisitor) {
        menuComponentVisitor.visiteMenu(this);
    }

    public List<MenuComponent> getChildren() {
        return components;
    }
}
