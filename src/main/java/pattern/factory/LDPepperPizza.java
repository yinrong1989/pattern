package pattern.factory;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("伦敦胡椒pizza");
    }
}
