package pattern.adapter;

/**
 * @Classname Votage220V
 * @Description 220V电压
 * @Date 2020-03-31 21:49
 * @Created by yinrong
 */
public class Voltage220V {


    public int outPut220V(){
        int src =220;
        System.out.println("电压="+src+"V");
        return src;
    }

}
