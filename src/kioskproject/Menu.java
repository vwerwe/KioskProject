package kioskproject;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public List<MenuItem> burgerList;
    public List<MenuItem> drinkList;



    public Menu(List<MenuItem> item1, List<MenuItem> item2) {
        burgerList = new ArrayList<>(item1);
        drinkList = new ArrayList<>(item2);
    }


    public void printAll() {
        printBurger();
        printDrink();
    }



    public void printBurger() {
        System.out.println("[1. Burger]");
        for (MenuItem item : burgerList) {
            System.out.println(item.getFood() + "   | W " + item.getPrice() + " |   " + item.getExplain());
        }
    }

    public void printDrink() {
        System.out.println("[2. Drink]");
        for (MenuItem item : drinkList) {
            System.out.println(item.getFood() + "   | W " + item.getPrice() + " |   " + item.getExplain());
        }
    }




    public String getBurger () {
        return "Burger";
    }

    public List<MenuItem> getBurgerList() {
        return burgerList;
    }

    public List<MenuItem> getDrinkList() {
        return drinkList;
    }
}
