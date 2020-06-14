package pattern.factory.simple;

import pattern.factory.Pizza;
import pattern.factory.absfactory.BJCheesePizza;
import pattern.factory.absfactory.BJPepperPizza;

public class SimpleFacory {

    public Pizza createPizza(String orderType){
     Pizza pizza =null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if ("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
