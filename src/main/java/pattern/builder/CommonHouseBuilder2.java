package pattern.builder;

/**
 * @Classname CommonHouseBuilder
 * @Description 普通房子
 * @Date 2020-03-30 22:20
 * @Created by yinrong
 */
public class CommonHouseBuilder2 extends HouseBuilder2{


    @Override
    public HouseBuilder2 buildBaisc() {
        System.out.println("普通房子打地基");
        return  this;
    }

    @Override
    public HouseBuilder2 buildWalls() {
        System.out.println("普通房子建围墙");
        return  this;
    }

    @Override
    public HouseBuilder2 buildRoofed() {
        System.out.println("普通房子盖屋顶");
        return  this;
    }
}
