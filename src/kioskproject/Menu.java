package kioskproject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Menu {

    private List<MenuItem> burgerList;



    public Menu(List<MenuItem> item1, List<MenuItem> item2, List<MenuItem> item3) {
        burgerList = new ArrayList<>(item1);
        drinkList = new ArrayList<>(item2);
        dessertList = new ArrayList<>(item3);
    }


    public void printBurger() {
        System.out.println("[ Burgers ]");
        IntStream.range(0, burgerList.size()).forEach(i -> System.out.println((i + 1) + ". " + burgerList.get(i).getFood() + "   | W " + burgerList.get(i).getPrice() + " |   " + burgerList.get(i).getExplain()));
        System.out.println("0. 뒤로가기");
    }


    public void printDrink() {
        System.out.println("[ Drinks ]");
        IntStream.range(0, drinkList.size()).forEach(i -> System.out.println((i + 1) + ". " + drinkList.get(i).getFood() + "   | W " + drinkList.get(i).getPrice() + " |   " + drinkList.get(i).getExplain()));
        System.out.println("0. 뒤로가기");
    }


    public void printDessert() {
        System.out.println("[ Desserts ]");
        IntStream.range(0, dessertList.size()).forEach(i -> System.out.println((i + 1) + ". " + dessertList.get(i).getFood() + "   | W " + dessertList.get(i).getPrice() + " |   " + dessertList.get(i).getExplain()));
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
