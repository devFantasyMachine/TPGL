import resto.*;

import java.util.HashSet;


public class StarbuzzCoffee {

    public void print(){

        HashSet<Beverage> beverages = new HashSet<>();

        Beverage noCondimentExpresso = new Expresso();
        beverages.add(noCondimentExpresso);

        Beverage darkRoast2MochaWhip = new Whip(new Mocha(new Mocha(new DarkRoast())));
        beverages.add(darkRoast2MochaWhip);

        Beverage houseBlendMochaWhipSoy = new Soy(new Mocha(new Whip(new HouseBlend())));
        beverages.add(houseBlendMochaWhipSoy);


        for (Beverage beverage : beverages) {
            printBeverage(beverage);
        }

    }


    private static void printBeverage(Beverage darkRoast2MochaWhip) {
        System.out.print("Item : " + darkRoast2MochaWhip.getDescription());
        System.out.println(", Cost : " + darkRoast2MochaWhip.cost() + " $");
    }

}

