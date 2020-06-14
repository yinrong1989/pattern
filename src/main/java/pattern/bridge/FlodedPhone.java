package pattern.bridge;

/**
 * @Classname FlodedPhone
 * @Description
 * @Date 2020/5/30 1:46 下午
 * @Created by yinrong
 */
public class FlodedPhone  extends Phone{


    @Override
    public String getPhoneType() {
        return "折叠手机";
    }

    public FlodedPhone(Brand brand) {
        super(brand);
    }



}
