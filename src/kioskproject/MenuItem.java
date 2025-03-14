package kioskproject;

import java.util.Scanner;

public class MenuItem {
    private String food;
    private int price;
    private String explain;

    MenuItem(String food, int price, String explain) {
        this.food = food;
        this.price = price;
        this.explain = explain;
    }

    public void selectMenu() {
        System.out.println("선택한 메뉴 : " + food + "   | W " + price + " |   " + explain);
    }

    public String getFood() {
        return food;
    }

    public int getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }

}
