package menu;

public class Waitress {


    public void print(){

        PrintVegetarianVisitor printVegetarianVisitor = new PrintVegetarianVisitor();

        MenuComponent menu =
                new Menu("Main","Main Menu",null,true);

        MenuComponent menu1 =
                new Menu("Matinée","Sub Menu 1",null,true);

        MenuComponent menu2 =
                new Menu("Midi","Sub Menu 2",null,true);

        menu1.add(new MenuItem(
                "Salade",
                "Salade de Tomate",
                100F,
                true
        ));

        menu1.add(new MenuItem(
                "Salade Garni",
                "Salade de Cheese",
                300F,
                true
        ));

        menu2.add(new MenuItem(
                "Poisson Braisé",
                "ras",
                3000F,
                false
        ));

        menu2.add(new MenuItem(
                "Okok Salé",
                "la verité",
                500F,
                true
        ));

        menu.add(menu1);
        menu.add(menu2);


        menu.accept(printVegetarianVisitor);

        //menu.print();
    }
}
