import menu.Waitress;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //StarbuzzCoffee starbuzzCoffee = new StarbuzzCoffee();
        //starbuzzCoffee.print();

        Waitress waitress = new Waitress();
        waitress.print();

        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }
}