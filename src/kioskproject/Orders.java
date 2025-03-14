package kioskproject;

public class Orders {
    private String menu;
    private int price;

    public Orders(String menu, int price) {
        this.menu = menu;
        this.price = price;
    }

    public String getMenu() {
        return menu;
    }

    public int getPrice() {
        return price;
    }

}
