package pattern.factory.absfactory;

import pattern.factory.Pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("北京奶油pizza");
    }
}
