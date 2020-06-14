package pattern.builder;

/**
 * @Classname Client
 * @Description
 * @Date 2020-03-30 22:45
 * @Created by yinrong
 */
public class Client {
    public static void main(String[] args) {
        /**不同的构建者，构建不同类型的房子*/
        /**构建流程与构建者本身*/
        HouseDirector houseDirector = new HouseDirector(new CommonHouseBuilder());
        System.out.println("构造方式一");
        houseDirector.constructHouse();
        System.out.println("-----------------------------------");
        System.out.println("构造方式二");
        HouseDirector houseDirector2 = new HouseDirector(new CommonHouseBuilder2());
        houseDirector2.constructHouse2();



    }
}
