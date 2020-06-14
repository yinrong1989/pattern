package pattern.factory.factorymethod;

import pattern.factory.Pizza;
import pattern.factory.absfactory.LDCheesePizza;
import pattern.factory.absfactory.LDPepperPizza;

public class LDorderBizza extends OrderBizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza =null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if ("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
