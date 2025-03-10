package kioskproject;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public List<MenuItem> burgerList;



    public Menu(List<MenuItem> item) {
        burgerList = new ArrayList<>(item);
    }




    public String getBurger () {
        return "Burger";
    }

    public List<MenuItem> getBurgerList() {
        return burgerList;
    }


}
