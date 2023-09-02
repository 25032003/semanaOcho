package edu.pizza;

import edu.pizza.Interfaces.PizzaBase;
import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;
import edu.pizza.especialidades.PizzaItaliana;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        Pizza pizza = new Pizza("pizza Margherita", 10.99);
        pizza.addTopping(new Topping("Tomato",40.00));
        pizza.addTopping(new Topping("Mozzarella", 25.00));
        pizza.addTopping(new Topping("Basil", 10.00));
        pizza.prepare();

        //Ejercicio 2
        Pizza pizza2 = new PizzaItaliana("Pizza Margherita", 15.00, "Tou isl");
        pizza.addTopping(new Topping("Tomato", 15.00));
        pizza.addTopping(new Topping("Mozzarella", 5.00));
        pizza.addTopping(new Topping("Champinon", 10.00));
        pizza.prepare();
       System.out.println("This is the salsa:" + PizzaItaliana.getSalsa ());

        //Ejercicio 3
        PizzaBase pb1 = new PizzaBase("Pizza esta lista", 25.00);


    }
}