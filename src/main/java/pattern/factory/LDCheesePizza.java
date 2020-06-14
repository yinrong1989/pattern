package pattern.factory;

public class LDCheesePizza  extends Pizza {
    @Override
    public void prepare() {
        System.out.println("伦敦奶油pizza");
    }
}
