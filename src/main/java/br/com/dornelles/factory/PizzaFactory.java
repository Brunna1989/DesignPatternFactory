package br.com.dornelles.factory;

import br.com.dornelles.model.Pizza;
import br.com.dornelles.model.PizzaDeChocolate;
import br.com.dornelles.model.PizzaPepperoni;

public class PizzaFactory {

    public Pizza criarPizza(String sabor) {
        if (sabor.equals("pepperoni")) {
            return new PizzaPepperoni();
        } else if (sabor.equals("chocolate")) {
            return new PizzaDeChocolate();
        } else {
            throw new IllegalArgumentException("Sabor de pizza inexistente");
        }
    }


}
