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
        int i = 1;
        System.out.println("[ Burgers ]");
        for (MenuItem item : burgerList) {
            System.out.println(i + ". " + item.getFood() + "   | W " + item.getPrice() + " |   " + item.getExplain());
            i++;
        }
        System.out.println("0. 뒤로가기");
    }


    public void printDrink() {
        int i = 1;
        System.out.println("[ Drinks ]");
        for (MenuItem item : drinkList) {
            System.out.println(i + ". " + item.getFood() + "   | W " + item.getPrice() + " |   " + item.getExplain());
            i++;
        }
        System.out.println("0. 뒤로가기");
    }


    public void printDessert() {
        int i = 1;
        System.out.println("[ Desserts ]");
        for (MenuItem item : dessertList) {
            System.out.println(i + ". " + item.getFood() + "   | W " + item.getPrice() + " |   " + item.getExplain());
            i++;
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

    public void printOrderMenu() {
        System.out.println("[ ORDER MENU]");
        System.out.println("4. Orders   | 장바구니를 확인 후 주문합니다.");
        System.out.println("5. Cancle   | 진행중인 주문을 취소합니다.");
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
