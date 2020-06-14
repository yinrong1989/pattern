package pattern.bridge;

/**
 * @Classname Phone
 * @Description
 * @Date 2020/5/30 1:42 下午
 * @Created by yinrong
 */
public abstract class Phone {

    private Brand brand;



    public abstract String getPhoneType();

    public Phone(Brand brand) {

        this.brand = brand;
    }

    protected void open(){
        System.out.print(getPhoneType());
        this.brand.open();
    }
    protected void close(){
        System.out.print(getPhoneType());
        this.brand.close();
    }
    protected void call(){
        System.out.print(getPhoneType());
        this.brand.call();
    }


}
