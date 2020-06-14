package pattern.factory.absfactory;

import pattern.factory.Pizza;

public class BJFactory implements Absfactoy {
    @Override
    public Pizza creatPizza(String orderType) {
        Pizza pizza =null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if ("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }

        return pizza;
    }

}
