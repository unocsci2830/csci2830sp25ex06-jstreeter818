package pizza;

import pizza.topping.PizzaTopping;
import pizza.sauce.PizzaSauce;
import pizza.crust.PizzaCrust;

import java.util.ArrayList;

/**
 * Pizza represents a pizza in our application. It holds together all the components of pizza like
 * crust, sauce, and toppings. For our application, we limit to one crust, one sauce, and multiple toppings
 */
public class Pizza implements MenuItem{
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private ArrayList<PizzaTopping> toppingList;
    private ArrayList<MenuItem> selectionList;

    public Pizza() {
        this.crust = null;
        this.sauce = null;
        this.toppingList = new ArrayList<PizzaTopping>();
        this.selectionList = new ArrayList<MenuItem>();
    }

    /**
     * getCrust returns the type of PizzaCrust
     * @return PizzaCrust type
     */
    public PizzaCrust getCrust() {
        return this.crust;
    }

    /**
     * setCrust sets the type of PizzaCrust
     * @param crust is any valid PizzaCrust
     */
    public void setCrust(PizzaCrust crust) {
        this.crust = crust;
        this.selectionList.add(crust);
    }
    
    public PizzaSauce getSauce() {
        return this.sauce;
    }

    public void setSauce(PizzaSauce sauce) {
        this.sauce = sauce;
        this.selectionList.add(sauce);
    }

    public ArrayList<PizzaTopping> getTopping() {
        return this.toppingList;
    }

    public void setTopping(ArrayList<PizzaTopping> toppings) {
        this.toppingList = toppings;
    }

    /**
     * addTopping appends a new topping to the list of toppings
     * @param topping is any valid PizzaTopping
     */
    public void addTopping(PizzaTopping topping) {
        this.toppingList.add(topping);
        this.selectionList.add(topping);
    }

    public void display() {
        System.out.println("$" + this.crust.getPrice() + " " + this.crust.toNiceString());
        System.out.println("$" + this.sauce.getPrice() + " " + this.sauce.toNiceString());
        for (PizzaTopping t : this.toppingList) {
            System.out.println("$" + t.getPrice() + " " + t.toNiceString());
        }
        System.out.println("Total price: $" + this.getPrice());
    }

    @Override
    public Double getPrice() {
        Double totalPrice = 0.0;
        for (MenuItem m : this.selectionList) {
            totalPrice += m.getPrice();
        }
        return totalPrice;
    }
}