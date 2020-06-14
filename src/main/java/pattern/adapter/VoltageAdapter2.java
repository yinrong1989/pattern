package pattern.adapter;

/**
 * @Classname VoltageAdapter
 * @Description
 * @Date 2020-03-31 21:54
 * @Created by yinrong
 */
public class VoltageAdapter2  implements Voltage5V {

    Voltage220V voltage220V;

    public VoltageAdapter2(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int outPut5V() {
        int dstV =0;
        if (voltage220V !=null){
            int src=voltage220V.outPut220V();
             dstV=src/44;

        }

        return dstV ;
    }
}
