package pattern.flyweight;

public abstract class Flyweight {



    //内部状态
      public String intrinsic;
      //外部状态
     protected final String extrinsic;

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate(int extrinsic );

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public String getExtrinsic() {
        return extrinsic;
    }
}
