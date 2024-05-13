package lotto;

public class Customer {
    private int money;

    public Customer() {
        this.money = (int) (Math.random()*1000);
    }
    public int getMoney() {
        return this.money;
    }
    public void purchase(int count) {
//        ...
    }
    private void validatePrice() {
        // purchase
    }
}
