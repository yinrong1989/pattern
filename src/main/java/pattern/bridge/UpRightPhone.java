package pattern.bridge;

/**
 * @Classname UpRightPhone
 * @Description
 * @Date 2020/5/30 1:46 下午
 * @Created by yinrong
 */
public class UpRightPhone  extends Phone{

    @Override
    public String getPhoneType() {
        return       "翻盖手机";
    }

    public UpRightPhone(Brand brand) {
        super(brand);
    }
}
