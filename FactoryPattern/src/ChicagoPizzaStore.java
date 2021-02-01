public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return new ChicagoStyleCheesePizza();
    }
}
