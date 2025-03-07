package kioskproject;

public class MenuItem {
    private String food;
    private int price;
    private String explain;

    MenuItem (String food, int price, String explain) {
        this.food = food;
        this.price = price;
        this.explain = explain;
    }

    MenuItem hamburger1 = new MenuItem("TeriBurger", 3500, "소스에서 숯불 및 마늘 향이 강하다.");
    MenuItem hamburger2 = new MenuItem("BulgogiBurger", 4700, "다소 삼삼한 맛이다.");
    MenuItem hamburger3 = new MenuItem("ChickenBurger", 4000, "번, 닭다리살패티, 데리야키소스, 양상추, 마요네즈, 머스타드로 구성되어 있다.");
    MenuItem hamburger4 = new MenuItem("Shrimp", 4700, "빵, 타르타르 소스, 새우 패티, 양상추, 사우전드 아일랜드 드레싱, 빵으로 구성되어 있다.");






}
