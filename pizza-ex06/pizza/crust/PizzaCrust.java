package pizza.crust;
import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem{
    protected String ingredient;

    public PizzaCrust() {
        this.ingredient = "";
    }

    public abstract String toString();

    public String toNiceString() {
        return "Crust: " + this.toString() + " (" + this.ingredient + ")";
    }

    public String getIngredient() {
        return this.ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String checkIntegrity() {
        return "";
    }

    public Double getPrice() {
        return this.getPrice();
    }
}