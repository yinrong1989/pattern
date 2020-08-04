package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String,Flyweight> pool = new HashMap<>();



    public static Flyweight getFlyweight(String extrinsic){
        //享元工厂
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsic)){
             flyweight =pool.get(extrinsic);
        }else{
             flyweight = new ConcreteFlyweight(extrinsic);
             pool.put(extrinsic,flyweight);
            System.out.print("创建 " + extrinsic + " 并从池中取出---->");
        }
        return flyweight;
    }

}
