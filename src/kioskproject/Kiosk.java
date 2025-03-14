package kioskproject;

import java.util.*;

public class Kiosk {

    private List<Menu> menuList;
    private List<Orders> orderList = new ArrayList<>();

    public Kiosk(List<Menu> item) {
        this.menuList = item;
    }

    //버거 메뉴판
    public void showBurger() {
        menuList.forEach(Menu::printBurger);
    }

    //음료 메뉴판
    public void showDrink() {
        menuList.forEach(Menu::printDrink);
    }

    //디저트 메뉴판
    public void showDessert() {
        menuList.forEach(Menu::printDessert);
    }

    //상위 메뉴판
    public void showCategory() {
        Menu menu = menuList.get(0);
        menu.printCategory();
    }

    //장바구니에 담겨있을 때 보여주는 메뉴
    public void showOrderMenu() {
        Menu menu = menuList.get(0);
        menu.printOrderMenu();
    }

    // 할인정보 체크
    public double disCheck(int item) {
        for (Customer e : Customer.values()) {
            if (item == e.getNumber()) {
                return e.getDiscount();
            }
        }
        return 0;
    }

    //주문하기
    public void checkOrder(Scanner scanner) {
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        System.out.println("[ Orders ]");
        int total = 0;
        for (Orders o : orderList) {
            System.out.println(o.getMenu() + "   |   " + o.getPrice());
            total += o.getPrice();
        }
        System.out.println("[ Total ]");
        System.out.println("W " + total);
        System.out.println();
        System.out.println("1. 주문        2. 메뉴판");
        int order = scanner.nextInt();
        if (order == 1) {
            System.out.println("할인 정보를 입력해주세요");
            System.out.println("1. 국가유공자 : 10%");
            System.out.println("2. 군인      : 5%");
            System.out.println("3. 학생      : 3%");
            System.out.println("4. 일반      : 0%");

            int input = scanner.nextInt();
            double discount = disCheck(input);
            int finalTotal, discountPrice = 0;
            discountPrice = (int) (total * discount);
            finalTotal = total - discountPrice;

            System.out.println("할인 금액 : " + discountPrice + "원");
            System.out.println("주문이 완료되었습니다. 금액은 " + finalTotal + "원 입니다.");
            orderList = new ArrayList<>();

        } else if (order == 2) {
            System.out.println("메뉴판으로 돌아갑니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }


    public void start() {

        Scanner scanner = new Scanner(System.in);
        String orderMenu = "";
        int orderPrice = 0;
        Menu menuBox = menuList.get(0);
        boolean exit = true;

        while (exit) {

            try {
                showCategory();
                if (!orderList.isEmpty()) {
                    showOrderMenu();
                }

                System.out.println("메뉴를 선택하세요");
                int choiceMenu1 = scanner.nextInt();
                //선택한 카테고리에 맞게 메뉴판 출력
                switch (choiceMenu1) {
                    case 0:
                        return;
                    case 1:
                        showBurger();
                        break;
                    case 2:
                        showDrink();
                        break;
                    case 3:
                        showDessert();
                        break;
                    case 4:
                        if (orderList.isEmpty()) {
                            throw new Exception("장바구니가 비어있습니다.");
                        } else {
                            checkOrder(scanner);
                        }
                        continue;
                    default:
                        System.out.println("잘못된 입력입니다.");
                        continue;
                }

                System.out.println("메뉴를 선택하세요");
                int choiceMenu2 = scanner.nextInt();
                //버거 메뉴판 출력과 선택한 메뉴 장바구니에 담기
                if (choiceMenu1 == 1) {
                    switch (choiceMenu2) {
                        case 0:
                            continue;
                        case 1:
                            menuBox.getBurgerList().get(0).selectMenu();
                            orderMenu = menuBox.getBurgerList().get(0).getFood();
                            orderPrice = menuBox.getBurgerList().get(0).getPrice();
                            break;
                        case 2:
                            menuBox.getBurgerList().get(1).selectMenu();
                            orderMenu = menuBox.getBurgerList().get(1).getFood();
                            orderPrice = menuBox.getBurgerList().get(1).getPrice();
                            break;
                        case 3:
                            menuBox.getBurgerList().get(2).selectMenu();
                            orderMenu = menuBox.getBurgerList().get(2).getFood();
                            orderPrice = menuBox.getBurgerList().get(2).getPrice();
                            break;
                        case 4:
                            menuBox.getBurgerList().get(3).selectMenu();
                            orderMenu = menuBox.getBurgerList().get(3).getFood();
                            orderPrice = menuBox.getBurgerList().get(3).getPrice();
                            break;
                        default:
                            System.out.println("잘못된 입력입니다");
                            continue;
                    }
                }
                //음료 메뉴판 출력과 선택한 메뉴 장바구니에 담기
                if (choiceMenu1 == 2) {
                    switch (choiceMenu2) {
                        case 0:
                            continue;
                        case 1:
                            menuBox.getDrinkList().get(0).selectMenu();
                            orderMenu = menuBox.getDrinkList().get(0).getFood();
                            orderPrice = menuBox.getDrinkList().get(0).getPrice();
                            break;
                        case 2:
                            menuBox.getDrinkList().get(1).selectMenu();
                            orderMenu = menuBox.getDrinkList().get(1).getFood();
                            orderPrice = menuBox.getDrinkList().get(1).getPrice();
                            break;
                        case 3:
                            menuBox.getDrinkList().get(2).selectMenu();
                            orderMenu = menuBox.getDrinkList().get(2).getFood();
                            orderPrice = menuBox.getDrinkList().get(2).getPrice();
                            break;
                        case 4:
                            menuBox.getDrinkList().get(3).selectMenu();
                            orderMenu = menuBox.getDrinkList().get(3).getFood();
                            orderPrice = menuBox.getDrinkList().get(3).getPrice();
                            break;
                        default:
                            System.out.println("잘못된 입력입니다");
                            continue;
                    }
                }
                //디저트 메뉴판 출력과 선택한 메뉴 장바구니에 담기
                if (choiceMenu1 == 3) {
                    switch (choiceMenu2) {
                        case 0:
                            continue;
                        case 1:
                            menuBox.getDessertList().get(0).selectMenu();
                            orderMenu = menuBox.getDessertList().get(0).getFood();
                            orderPrice = menuBox.getDessertList().get(0).getPrice();
                            break;
                        case 2:
                            menuBox.getDessertList().get(1).selectMenu();
                            orderMenu = menuBox.getDessertList().get(1).getFood();
                            orderPrice = menuBox.getDessertList().get(1).getPrice();
                            break;
                        case 3:
                            menuBox.getDessertList().get(2).selectMenu();
                            orderMenu = menuBox.getDessertList().get(2).getFood();
                            orderPrice = menuBox.getDessertList().get(2).getPrice();
                            break;
                        case 4:
                            menuBox.getDessertList().get(3).selectMenu();
                            orderMenu = menuBox.getDessertList().get(3).getFood();
                            orderPrice = menuBox.getDessertList().get(3).getPrice();
                            break;
                        default:
                            System.out.println("잘못된 입력입니다");
                            continue;
                    }
                }
                //장바구니 리스트에 추가
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까? \n 1.확인     2.취소");
                int choiceBuy = scanner.nextInt();
                if (choiceBuy == 1) {
                    System.out.println(orderMenu + "가 장바구니에 추가되었습니다");
                    Orders orders = new Orders(orderMenu, orderPrice);
                    orderList.add(orders);
                } else if (choiceBuy == 2) {
                    System.out.println("취소되었습니다.");
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}



