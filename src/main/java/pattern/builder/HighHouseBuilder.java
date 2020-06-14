package pattern.builder;

/**
 * @Classname CommonHouseBuilder
 * @Description 高层房子
 * @Date 2020-03-30 22:20
 * @Created by yinrong
 */
public class HighHouseBuilder extends HouseBuilder{


    @Override
    public void buildBaisc() {
        System.out.println("高层房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高层房子建围墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("高层房子盖屋顶");
    }
}
