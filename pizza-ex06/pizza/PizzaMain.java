package pizza;

import pizza.topping.PizzaTopping;

import pizza.topping.MeatTopping;
import pizza.topping.BaconTopping;
import pizza.topping.ChickenTopping;
import pizza.topping.PeperoniTopping;
import pizza.topping.SausageTopping;

import pizza.topping.CheeseTopping;
import pizza.topping.CheddarTopping;
import pizza.topping.MozzarellaTopping;
import pizza.topping.ParmesanTopping;
import pizza.topping.RicottaTopping;

import pizza.topping.VeggieTopping;
import pizza.topping.JalapenoTopping;
import pizza.topping.MushroomTopping;
import pizza.topping.OliveTopping;
import pizza.topping.SpinachTopping;

import pizza.sauce.PizzaSauce;
import pizza.sauce.BarbecueSauce;
import pizza.sauce.TomatoSauce;

import pizza.crust.PizzaCrust;
import pizza.crust.ThickCrust;
import pizza.crust.ThinCrust;

import java.util.Scanner;

public class PizzaMain {
    private Pizza pizza;
    private Scanner input;

    public PizzaMain() {
        pizza = new Pizza();
        input = new Scanner(System.in);
    }

    private void inputCrustChoice() {
        Boolean ValidChoice = false;
        Integer choice = 0;
        ThickCrust thickCrust = null;

        System.out.println("What kind of crust would you like:");
        System.out.println("1 - Thin crust");
        System.out.println("2 - Thick crust");
        System.out.print("Your choice: ");

        while (!ValidChoice) {
            choice = input.nextInt();
            switch(choice) {
                case 1:
                    pizza.setCrust(new ThinCrust());
                    ValidChoice = true;
                    break;
                case 2:
                    thickCrust = new ThickCrust();
                    pizza.setCrust(thickCrust);
                    ValidChoice = true;
                    break;
                default:
                    System.out.println("Pick 1 or 2");
            }
        }

        if(choice == 2) {
            System.out.print("Deep Dish? (Y/N): ");
            ValidChoice = false;

            while(!ValidChoice) {
                String deepDishChoice = input.next();

                switch(deepDishChoice) {
                    case "y":
                    case "Y":
                        thickCrust.setIsDeepDish(true);
                        ValidChoice = true;
                        break;
                    case "n":
                    case "N":
                        thickCrust.setIsDeepDish(false);
                        ValidChoice = true;
                        break;
                    default:
                        System.out.println("Pick Y or N");
                }
            }
        }
        
        System.out.println("Select crust ingredient:");
        System.out.println("1 - Flour");
        System.out.println("2 - Cauliflower");
        System.out.print("Your choice: ");
        ValidChoice = false;

        while(!ValidChoice) {
            choice = input.nextInt();
            switch(choice) {
                case 1:
                    pizza.getCrust().setIngredient("Flour");
                    ValidChoice = true;
                    break;
                case 2:
                    pizza.getCrust().setIngredient("Cauliflower");
                    ValidChoice = true;
                    break;
                default:
                    System.out.println("Pick 1 or 2");
            }
        }
    }

    private void inputSauceChoice() {
        Boolean ValidChoice = false;
        System.out.println("What kind of sauce would you like:");
        System.out.println("1 - Tomato sauce");
        System.out.println("2 - Barbecue sauce");
        System.out.print("Your choice: ");

        while (!ValidChoice) {
            Integer choice = input.nextInt();
            switch(choice) {
                case 1:
                    pizza.setSauce(new TomatoSauce());
                    ValidChoice = true;
                    break;
                case 2:
                    pizza.setSauce(new BarbecueSauce());
                    ValidChoice = true;
                    break;
            }
        }
    }

    private void inputToppingChoices() {
        System.out.print("How many toppings? ");
        Integer numToppings = input.nextInt();

        for(Integer i = 0; i < numToppings; i++) {
            Boolean ValidChoice = false;
            System.out.println("1 - Peperoni");
            System.out.println("2 - Sausage");
            System.out.println("3 - Bacon");
            System.out.println("4 - Chicken");
            System.out.println("5 - Jalapeno");
            System.out.println("6 - Mushroom");
            System.out.println("7 - Olive");
            System.out.println("8 - Spinach");
            System.out.println("9 - Mozzarella");
            System.out.println("10 - Ricotta");
            System.out.println("11- Cheddar");
            System.out.println("12 - Parmesan");
            System.out.print("Your choice: ");

            while(!ValidChoice) {
                Integer choice = input.nextInt();
                switch(choice) {
                    case 1:
                        pizza.addTopping(new PeperoniTopping());
                        ValidChoice = true;
                        break;
                    case 2:
                        pizza.addTopping(new SausageTopping());
                        ValidChoice = true;
                        break;
                    case 3:
                        pizza.addTopping(new BaconTopping());
                        ValidChoice = true;
                        break;
                    case 4:
                        pizza.addTopping(new ChickenTopping());
                        ValidChoice = true;
                        break;
                    case 5:
                        pizza.addTopping(new JalapenoTopping());
                        ValidChoice = true;
                        break;
                    case 6:
                        pizza.addTopping(new MushroomTopping());
                        ValidChoice = true;
                        break;
                    case 7:
                        pizza.addTopping(new OliveTopping());
                        ValidChoice = true;
                        break;
                    case 8:
                        pizza.addTopping(new SpinachTopping());
                        ValidChoice = true;
                        break;
                    case 9:
                        pizza.addTopping(new MozzarellaTopping());
                        ValidChoice = true;
                        break;
                    case 10:
                        pizza.addTopping(new RicottaTopping());
                        ValidChoice = true;
                        break;
                    case 11:
                        pizza.addTopping(new CheddarTopping());
                        ValidChoice = true;
                        break;
                    case 12:
                        pizza.addTopping(new ParmesanTopping());
                        ValidChoice = true;
                        break;
                    default:
                        System.out.println("Pick between 1-12");
                }
            }
        }
    }

    private void showPizza() {
        pizza.display();
        System.out.println(pizza.getCrust().checkIntegrity());
    }

    public void runMenu() {
        inputCrustChoice();
        inputSauceChoice();
        inputToppingChoices();
        showPizza();
    }

    public static void main(String[] args) {
        PizzaMain pm = new PizzaMain();
        pm.runMenu();
    }
}