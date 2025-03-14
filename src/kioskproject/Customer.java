package kioskproject;

public enum Customer {
    VETERAN(1, 0.1), SOLDIER(2, 0.05), STUDENT(3, 0.03), GENERAL(4, 0);

    private int number;
    private double discount;

    Customer(int number, double discount) {
        this.number = number;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public int getNumber() {
        return number;
    }
}
