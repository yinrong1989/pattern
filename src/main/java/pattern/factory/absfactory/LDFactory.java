package pattern.factory.absfactory;

import pattern.factory.Pizza;

public class LDFactory implements Absfactoy {
    @Override
    public Pizza creatPizza(String orderType) {
     Pizza pizza =null;
     if (orderType.equals("cheese")){
        pizza = new LDCheesePizza();
     }else if ("pepper".equals(orderType)){
         pizza = new LDPepperPizza();
     }

     return pizza;
    }
}
