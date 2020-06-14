package pattern.factory;

public abstract class Pizza {

    public abstract void prepare();

    public void cut(){
        System.out.println("切披萨");
        }
    public void box(){
        System.out.println("打包");
    }

    public Pizza() {
        prepare();
        cut();
        box();
    }
}
