package pattern.adapter;

/**
 * @Classname VoltageAdapter
 * @Description
 * @Date 2020-03-31 21:54
 * @Created by yinrong
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int outPut5V() {

        int src=outPut220V();
        int dstV=src/44;

        return dstV ;
    }
}
