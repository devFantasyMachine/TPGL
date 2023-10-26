package menu;



public class PrintVegetarianVisitor implements MenuComponentVisitor {


    @Override
    public void visiteMenu(Menu menu) {

        System.out.println("=======================START MENU============================");
        System.out.println("Menu " + menu.getName() + "(" + menu.getDescription() + ")\n\n");

        menu.getChildren()
                .stream()
                .filter(MenuComponent::isVegetarian)
                .forEach(menuComponent -> menuComponent.accept(this));

        System.out.println("========================END MENU=============================\n");
    }


    @Override
    public void visiteMenuItem(MenuItem item) {

        System.out.println("\t MenuItem: " + item.getName() + "(" + item.getDescription() + ") " + " price: " + item.getPrice() + " $");

    }


}
