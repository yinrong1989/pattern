package pattern.factory.absfactory;

import pattern.factory.Pizza;

public interface Absfactoy {

    public Pizza creatPizza(String orderType);
}
