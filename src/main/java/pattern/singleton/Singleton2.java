package pattern.singleton;

public class Singleton2 {

    private static volatile Singleton2 singleton;

    private  Singleton2(){

    }

    public static Singleton2 getInstance(){
        if (singleton == null){
            synchronized (Singleton2.class){
                if (singleton == null){
                    singleton = new Singleton2();
                }
            }
        }
        return  singleton;
    }
    public static void main(String[] args) {
        System.out.println("双向检查完成单例模式");
        System.out.println();
        Singleton2 singleton3 = Singleton2.getInstance();
        Singleton2 singleton4 = Singleton2.getInstance();
        System.out.println(singleton3.hashCode());
        System.out.println(singleton4.hashCode());
        System.out.println(singleton3 == singleton4);



    }

}
