package pattern.singleton;

/**
* 静态内部类
* */
public class Singleton {



    private Singleton(){

    }
    private static class SingletonInsatance{
        private final static Singleton singleton =  new Singleton();
    }

    public  static Singleton getInstance(){
       return SingletonInsatance.singleton;
    }

    public static void main(String[] args) {
        System.out.println("静态内部类完成单例模式");
        System.out.println();
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton == singleton2);



    }
}
