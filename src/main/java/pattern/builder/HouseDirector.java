package pattern.builder;

/**
 * @Classname HouseDirector
 * @Description 建房子指挥者
 * @Date 2020-03-30 22:23
 * @Created by yinrong
 */
public class HouseDirector {

    HouseBuilder houseBuilder;
    HouseBuilder2 houseBuilder2;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseDirector(HouseBuilder2 houseBuilder2) {
        this.houseBuilder2 = houseBuilder2;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public HouseBuilder2 getHouseBuilder2() {
        return houseBuilder2;
    }

    public void setHouseBuilder2(HouseBuilder2 houseBuilder2) {
        this.houseBuilder2 = houseBuilder2;
    }

    public void  constructHouse(){
        houseBuilder.buildBaisc();
        houseBuilder.buildWalls();
        houseBuilder.buildRoofed();
        houseBuilder.buildHouse();
    }
    public void  constructHouse2(){
        houseBuilder2.buildBaisc().buildWalls().buildRoofed().buildHouse();

    }

    public static void main(String[] args) {





    }
}
