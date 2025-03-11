package kioskproject;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        MenuItem hamburger1 = new MenuItem("1.TeriBurger   ", 3500, "소스에서 숯불 및 마늘 향이 강하다.");
        MenuItem hamburger2 = new MenuItem("2.BulgogiBurger", 4700, "다소 삼삼한 맛이다.");
        MenuItem hamburger3 = new MenuItem("3.ChickenBurger", 4000, "번, 닭다리살패티, 데리야키소스, 양상추, 마요네즈, 머스타드로 구성되어 있다.");
        MenuItem hamburger4 = new MenuItem("4.ShrimpBurger ", 4700, "빵, 타르타르 소스, 새우 패티, 양상추, 사우전드 아일랜드 드레싱, 빵으로 구성되어 있다.");

        MenuItem drink1 = new MenuItem("1.Coke         ", 1700, "단맛이 나는 톡쏘는 탄산음료");
        MenuItem drink2 = new MenuItem("2.Orangejuice  ", 1700, "오렌지 맛이나는 과일주스");
        MenuItem drink3 = new MenuItem("3.Cider        ", 1900, "깔끔한 톡쏘는 탄산음료");
        MenuItem drink4 = new MenuItem("4.ZeroCoke     ", 2000, "깔끔하면서 설탕이 안들어간 탄산음료");


        Menu menuList = new Menu(List.of(hamburger1, hamburger2, hamburger3, hamburger4), List.of(drink1, drink2, drink3, drink4));

        Kiosk kiosk = new Kiosk(List.of(menuList));
        kiosk.start();







    }
}
