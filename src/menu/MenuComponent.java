package menu;



public interface MenuComponent extends MenuComponentVisitable {

    String getName();
    String getDescription();
    Float getPrice();

    boolean isVegetarian();

    void print();

    default void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    default void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }


    default MenuComponent getChild(int childId){
        throw new UnsupportedOperationException();
    }


}
