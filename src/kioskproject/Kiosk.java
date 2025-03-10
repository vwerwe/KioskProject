package kioskproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    List<Menu> burgerList;

    public Kiosk(List<Menu> item) {
        this.burgerList = item;
    }




    public void start() {

        Scanner scanner = new Scanner(System.in);


        boolean exit = true;

        while(exit) {

            try {
                for (Menu menu : burgerList) {
                    burgerList.printList();
                }
                System.out.println("0. 종료");
                System.out.println();

                System.out.println("숫자를 입력하세요");
                String input = scanner.nextLine();
                char inputChar = input.charAt(0);

                for (Menu menu : burgerList) {
                    char a = menu.getFood().charAt(0);
                    if(a == inputChar) {
                        menu.selectMenu(scanner);
                    }
                }

                if(input.equals("0")) {
                    exit = false;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


        }

    }









}
