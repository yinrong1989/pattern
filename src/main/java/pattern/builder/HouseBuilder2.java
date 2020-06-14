package pattern.builder;

/**
 * @Classname HouseBuilder
 * @Description 抽象建造者
 * @Date 2020-03-30 22:13
 * @Created by yinrong
 */
public abstract class HouseBuilder2 {


    protected  House house = new House();

    public abstract HouseBuilder2 buildBaisc();
    public abstract HouseBuilder2 buildWalls();
    public abstract HouseBuilder2 buildRoofed();


    public  House buildHouse(){
        return house;
    }
}
