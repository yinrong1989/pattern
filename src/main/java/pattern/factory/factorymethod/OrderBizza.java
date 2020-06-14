package pattern.factory.factorymethod;

import pattern.factory.Pizza;


public abstract class OrderBizza {



    public abstract Pizza createPizza(String orderType);


}
