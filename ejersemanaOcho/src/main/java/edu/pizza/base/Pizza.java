package edu.pizza.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private static String name;

    //Convertir el price en una funcion que me retorme el valor de la pizza en base a sus ingredientes
    //private static double price;
    private double price;
    private static List<Topping> toppings = new ArrayList<>();


    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
    public Pizza(String name, double price, Topping... toppings) {
        this.name = name;
        this.price = price;
        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + ", price=" + price + ", toppings=" + toppings + '}';
    }

    public static void prepare() {
        System.out.println("Preparing..... " + name);
        System.out.println("Adding toppings:");
        double total = 0;

        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            total = total + topping.getPrecio();

            //put 1 seconds delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("The Pizza is ready!");
        System.out.println("Total price: " + total);
    }
}
