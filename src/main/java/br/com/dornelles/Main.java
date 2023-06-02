package br.com.dornelles;

import br.com.dornelles.factory.PizzaFactory;
import br.com.dornelles.model.Pizza;

public class Main {


    public static void main(String[] args) {
        try {
            PizzaFactory pizzaFactory = new PizzaFactory();

            Pizza pizzaPepperoni = pizzaFactory.criarPizza("pepperoni");
            pizzaPepperoni.preparar();
            pizzaPepperoni.assar();
            pizzaPepperoni.entregar();

            System.out.println(pizzaPepperoni.preparar());
            System.out.println(pizzaPepperoni.assar());
            System.out.println(pizzaPepperoni.entregar());

            Pizza pizzaChocolate = pizzaFactory.criarPizza("chocolate");
            pizzaChocolate.preparar();
            pizzaChocolate.assar();
            pizzaChocolate.entregar();

            Pizza pizzaCalabresa = pizzaFactory.criarPizza("calabresa");
            pizzaCalabresa.preparar();
            pizzaCalabresa.assar();
            pizzaCalabresa.entregar();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}