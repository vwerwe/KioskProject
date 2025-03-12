package kioskproject;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> burgerList;
    private List<MenuItem> drinkList;
    private List<MenuItem> dessertList;


    public Menu(List<MenuItem> item1, List<MenuItem> item2, List<MenuItem> item3) {
        burgerList = new ArrayList<>(item1);
        drinkList = new ArrayList<>(item2);
        dessertList = new ArrayList<>(item3);
    }


    public void printBurger() {
        System.out.println("[1. Burger]");
        for (MenuItem item : burgerList) {
            System.out.println(item.getFood() + "   | W " + item.getPrice() + " |   " + item.getExplain());
        }
        System.out.println("0. 뒤로가기");
    }


    public void printDrink() {
        System.out.println("[2. Drink]");
        for (MenuItem item : drinkList) {
            System.out.println(item.getFood() + "   | W " + item.getPrice() + " |   " + item.getExplain());
        }
        System.out.println("0. 뒤로가기");
    }


    public void printDessert() {
        System.out.println("[3. Dessert]");
        for (MenuItem item : dessertList) {
            System.out.println(item.getFood() + "   | W " + item.getPrice() + " |   " + item.getExplain());
        }
        System.out.println("0. 뒤로가기");
    }

    public void printCategory() {
        System.out.println("[ MAIN MENU ]");
        System.out.println("1. Burgers");
        System.out.println("2. Drinks");
        System.out.println("3. Desserts");
        System.out.println("0. 종료");
    }


    public List<MenuItem> getBurgerList() {
        return burgerList;
    }

    public List<MenuItem> getDrinkList() {
        return drinkList;
    }

    public List<MenuItem> getDessertList() {
        return dessertList;
    }
}
