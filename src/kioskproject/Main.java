package kioskproject;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        MenuItem hamburger1 = new MenuItem("Teri Burger       ", 3500, "소스에서 숯불 및 마늘 향이 강하다.");
        MenuItem hamburger2 = new MenuItem("Bulgogi Burger    ", 4700, "다소 삼삼한 맛이다.");
        MenuItem hamburger3 = new MenuItem("Chicken Burger    ", 4000, "번, 닭다리살패티, 데리야키소스, 양상추, 마요네즈, 머스타드로 구성되어 있다.");
        MenuItem hamburger4 = new MenuItem("Shrimp Burger     ", 4700, "빵, 타르타르 소스, 새우 패티, 양상추, 사우전드 아일랜드 드레싱, 빵으로 구성되어 있다.");

        MenuItem drink1 = new MenuItem("Coke              ", 1700, "단맛이 나는 톡쏘는 탄산음료");
        MenuItem drink2 = new MenuItem("Orange Juice      ", 1700, "오렌지 맛이나는 과일주스");
        MenuItem drink3 = new MenuItem("Cider             ", 1900, "깔끔한 톡쏘는 탄산음료");
        MenuItem drink4 = new MenuItem("ZeroCoke          ", 2000, "깔끔하면서 설탕이 안들어간 탄산음료");

        MenuItem dessert1 = new MenuItem("French fries      ", 1800, "클래식한 감자튀김");
        MenuItem dessert2 = new MenuItem("Fried Squid Rings ", 2000, "오징어 튀김");
        MenuItem dessert3 = new MenuItem("Seasoning Potato  ", 1900, "양념 뿌려서 먹는 감자튀김");
        MenuItem dessert4 = new MenuItem("Cheese Sticks     ", 1700, "치즈스틱");

        // 카테고리별로 리스트 생성
        Menu menuList = new Menu(
                List.of(hamburger1, hamburger2, hamburger3, hamburger4),
                List.of(drink1, drink2, drink3, drink4),
                List.of(dessert1, dessert2, dessert3, dessert4)
        );

        Kiosk kiosk = new Kiosk(List.of(menuList));
        kiosk.start();







    }
}
