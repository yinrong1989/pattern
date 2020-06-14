package pattern.bridge;

/**
 * @Classname Client
 * @Description
 * @Date 2020/5/30 1:58 下午
 * @Created by yinrong
 */
public class Client {
    public static void main(String[] args) {
        Brand xiaomi = new XiaoMi();
        Brand vivo = new Vivo();

        Phone phone1 = new FlodedPhone(vivo);
        Phone phone2 = new FlodedPhone(xiaomi);
        Phone phone3 = new UpRightPhone(vivo);
        Phone phone4 = new UpRightPhone(xiaomi);
        phone1.open();
        phone1.call();
        phone1.close();
        phone2.open();
        phone2.call();
        phone2.close();
        phone3.open();
        phone3.call();
        phone3.close();
        phone4.open();
        phone4.call();
        phone4.close();
    }
}
