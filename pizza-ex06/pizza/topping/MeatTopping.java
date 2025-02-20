package pizza.topping;

public class MeatTopping extends PizzaTopping {
    private Integer spiciness;

    public MeatTopping() {
        this.spiciness = 0;
    }

    public Integer getSpiciness() {
        return this.spiciness;
    }

    public void setSpiciness(Integer spiciness) {
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Meat Topping";
    }

    @Override
    public String toNiceString() {
        return super.toNiceString();
    }

    public Double getPrice() {
        return this.getPrice();
    }
}