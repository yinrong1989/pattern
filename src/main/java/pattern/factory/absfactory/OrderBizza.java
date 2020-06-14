package pattern.factory.absfactory;

import pattern.factory.Pizza;

public class OrderBizza {

    Absfactoy factory;

    public void setFactory(Absfactoy factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String orderType){

       return factory.creatPizza(orderType);
    }

    public static void main(String[] args) {
        OrderBizza orderBizza = new OrderBizza();
        orderBizza.setFactory(new BJFactory());
        orderBizza.orderPizza("cheese");
        orderBizza.setFactory(new LDFactory());
        orderBizza.orderPizza("cheese");
    }
}
