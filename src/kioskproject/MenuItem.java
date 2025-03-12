package kioskproject;

import java.util.Scanner;

public class MenuItem {
    private String food;
    private int price;
    private String explain;

    MenuItem (String food, int price, String explain) {
        this.food = food;
        this.price = price;
        this.explain = explain;
    }

    public void printMenu() {
        System.out.println(food + "   | W " + price + " |   " + explain);
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

    public void selectMenu(Scanner scanner) throws IllegalArgumentException{
        System.out.println(food + "   | W " + price + " |   " + explain);

        System.out.println("0. 뒤로가기");
        int input = scanner.nextInt();
        if (input == 0) {
            scanner.nextLine();
            return;
        } else {
            scanner.nextLine();
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }


    }
}
