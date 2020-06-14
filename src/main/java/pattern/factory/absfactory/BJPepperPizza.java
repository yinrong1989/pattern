package pattern.factory.absfactory;

import pattern.factory.Pizza;

public class BJPepperPizza  extends Pizza {
    @Override
    public void prepare() {
        System.out.println("北京胡椒pizza");
    }
}
