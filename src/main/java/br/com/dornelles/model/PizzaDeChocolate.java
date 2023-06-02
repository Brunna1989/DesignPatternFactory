package br.com.dornelles.model;

public class PizzaDeChocolate implements Pizza {

    @Override
    public String preparar() {
        return "Seu pedido está sendo preparado";
    }

    @Override
    public String assar() {
        return "Humm... sua pizza já está no forno";
    }

    @Override
    public String entregar() {
        return "Seu pedido saiu para entrega!";
    }
}
