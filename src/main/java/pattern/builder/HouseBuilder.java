package pattern.builder;

/**
 * @Classname HouseBuilder
 * @Description 抽象建造者
 * @Date 2020-03-30 22:13
 * @Created by yinrong
 */
public abstract class HouseBuilder {


    protected  House house = new House();

    public abstract void buildBaisc();
    public abstract void buildWalls();
    public abstract void buildRoofed();


    public  House buildHouse(){
        return house;
    }
}
