package pattern.bridge;

/**
 * @Classname XiaoMi
 * @Description
 * @Date 2020/5/30 1:48 下午
 * @Created by yinrong
 */
public class Vivo implements Brand{


    @Override
    public void open() {
        System.out.println("Vivo开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo关机");
    }
}
