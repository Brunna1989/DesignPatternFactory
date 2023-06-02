import br.com.dornelles.factory.PizzaFactory;
import br.com.dornelles.model.Pizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaFactoryTest {

    @Test
    public void preparandoPizzaPepperoni() {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.criarPizza("pepperoni");
        Assertions.assertEquals(pizza.preparar(), "Seu pedido está sendo preparado");
    }

    @Test
    public void assandoPizzaPepperoni() {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.criarPizza("pepperoni");
        Assertions.assertEquals(pizza.assar(), "Humm... sua pizza já está no forno");
    }

    @Test
    public void entregandoPizzaPepperoni() {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.criarPizza("pepperoni");
        Assertions.assertEquals(pizza.entregar(), "Seu pedido saiu para entrega!");
    }

    @Test
    public void preparandoPizzaChocolate() {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.criarPizza("chocolate");
        Assertions.assertEquals(pizza.preparar(), "Seu pedido está sendo preparado");
    }

    @Test
    public void assandoPizzaChocolate() {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.criarPizza("chocolate");
        Assertions.assertEquals(pizza.assar(), "Humm... sua pizza já está no forno");
    }

    @Test
    public void entregandoPizzaChocolate() {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.criarPizza("chocolate");
        Assertions.assertEquals(pizza.entregar(), "Seu pedido saiu para entrega!");
    }

    @Test
    public void testandoSaborInexistente(){
        PizzaFactory pizzaFactory = new PizzaFactory();
        Assertions.assertThrows(IllegalArgumentException.class,() -> pizzaFactory.criarPizza("calabresa"));
    }
}

