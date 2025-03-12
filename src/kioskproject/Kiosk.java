package kioskproject;

import java.util.*;

public class Kiosk {

    private List<Menu> menuList;

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


    public void showDessert() {
        for (Menu menu : menuList) {
            menu.printDessert();
        }
    }

    public void showCategory() {
        Menu menu = menuList.get(0);
        menu.printCategory();
    }


    public void start() {

        Scanner scanner = new Scanner(System.in);
        Menu menuBox = menuList.get(0);

        boolean exit = true;



        while(exit) {

            try {

                showCategory();

                System.out.println("메뉴를 선택하세요");
                int choiceMenu1 = scanner.nextInt();
                scanner.nextLine();
                switch (choiceMenu1) {
                    case 0 : return;
                    case 1 : showBurger();
                        break;
                    case 2 : showDrink();
                        break;
                    case 3 : showDessert();
                        break;
                    default :
                        System.out.println("잘못된 입력입니다.");
                        continue;
                }

                System.out.println("메뉴를 선택하세요");
                int choiceMenu2 = scanner.nextInt();
                scanner.nextLine();
                if(choiceMenu1 == 1) {
                    switch (choiceMenu2) {
                        case 0 : continue;
                        case 1 : menuBox.getBurgerList().get(0).selectMenu();
                            break;
                        case 2 : menuBox.getBurgerList().get(1).selectMenu();
                            break;
                        case 3 : menuBox.getBurgerList().get(2).selectMenu();
                            break;
                        case 4 : menuBox.getBurgerList().get(3).selectMenu();
                            break;
                        default:
                            System.out.println("잘못된 입력입니다");
                            continue;
                    }
                }
                if(choiceMenu1 == 2) {
                    switch (choiceMenu2) {
                        case 1 : menuBox.getDrinkList().get(0).selectMenu();
                            break;
                        case 2 : menuBox.getDrinkList().get(1).selectMenu();
                            break;
                        case 3 : menuBox.getDrinkList().get(2).selectMenu();
                            break;
                        case 4 : menuBox.getDrinkList().get(3).selectMenu();
                            break;
                        default:
                            System.out.println("잘못된 입력입니다");
                    }
                }
                if(choiceMenu1 == 3) {
                    switch (choiceMenu2) {
                        case 1 :
                            menuBox.getDessertList().get(0).selectMenu();
                            break;
                        case 2 :
                            menuBox.getDessertList().get(1).selectMenu();
                            break;
                        case 3 : menuBox.getDessertList().get(2).selectMenu();
                            break;
                        case 4 : menuBox.getDessertList().get(3).selectMenu();
                            break;
                        default:
                            System.out.println("잘못된 입력입니다");
                    }
                }

                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까? \n 1.확인     2.취소");

                int choiceBuy = scanner.nextInt();


            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다");
                scanner.nextLine();
                continue;
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

