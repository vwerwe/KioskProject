package kioskproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    List<Menu> menuList;


    public Kiosk(List<Menu> item) {
        this.menuList = item;
    }

    public void showBurger() {
        for (Menu menu : menuList) {
            menu.printBurger();
        }
    }


    public void showDrink() {
        for (Menu menu : menuList) {
            menu.printDrink();
        }
    }

    public void showALl() {
        Menu menu = menuList.get(0);
        menu.printAll();
    }







    public void start() {

        Scanner scanner = new Scanner(System.in);
        Menu menuBox = menuList.get(0);

        boolean exit = true;

        showBurger();
        System.out.println();
        showDrink();

        System.out.println("메뉴를 선택하세요");
        int choiceMenu1 = scanner.nextInt();
        switch (choiceMenu1) {
            case 1 : showBurger();
            break;
            case 2 : showDrink();
            break;
            default :
                System.out.println("잘못된 입력입니다.");
        }

        System.out.println("메뉴를 선택하세요");
        int choiceMenu2 = scanner.nextInt();
        if(choiceMenu1 == 1) {
            switch (choiceMenu2) {
                case 1 : menuBox.getBurgerList().get(0).printMenu();
                break;
                case 2 : menuBox.getBurgerList().get(1).printMenu();
                break;
                case 3 : menuBox.getBurgerList().get(2).printMenu();
                break;
                case 4 : menuBox.getBurgerList().get(3).printMenu();
                break;
                default:
                    System.out.println("잘못된 입력입니다");
            }
        }
        if(choiceMenu1 == 2) {
            switch (choiceMenu2) {
                case 1 : menuBox.getDrinkList().get(0).printMenu();
                    break;
                case 2 : menuBox.getDrinkList().get(1).printMenu();
                    break;
                case 3 : menuBox.getDrinkList().get(2).printMenu();
                    break;
                case 4 : menuBox.getDrinkList().get(3).printMenu();
                    break;
                default:
                    System.out.println("잘못된 입력입니다");
            }
        }



    }


}



//        boolean exit = true;
//
//        while(exit) {
//
//            try {
//                for (Menu menu : burgerList.) {
//                    burgerList.printList();
//                }
//                System.out.println("0. 종료");
//                System.out.println();
//
//                System.out.println("숫자를 입력하세요");
//                String input = scanner.nextLine();
//                char inputChar = input.charAt(0);
//
//                for (Menu menu : burgerList) {
//                    char a = menu.getFood().charAt(0);
//                    if(a == inputChar) {
//                        menu.selectMenu(scanner);
//                    }
//                }
//
//                if(input.equals("0")) {
//                    exit = false;
//                }
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }
//
//
//        }

