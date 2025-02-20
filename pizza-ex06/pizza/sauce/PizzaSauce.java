package pizza.sauce;
import pizza.MenuItem;

public abstract class PizzaSauce implements MenuItem {
    public abstract String toString();

    public String toNiceString() {
        return "Pizza Sauce: " + this.toString();
    }

    public Double getPrice() {
        return this.getPrice();
    }
}