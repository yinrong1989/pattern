package pattern.adapter;

/**
 * @Classname Client
 * @Description
 * @Date 2020-03-31 22:02
 * @Created by yinrong
 */
public class Client
{
    public static void main(String[] args) {

        System.out.println("-------类适配器----------");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());

        System.out.println("-------对象适配器----------");
        phone.charging(new VoltageAdapter2(new Voltage220V()));
    }
}
