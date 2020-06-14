package pattern.adapter;

/**
 * @Classname Phone
 * @Description
 * @Date 2020-03-31 22:00
 * @Created by yinrong
 */
public class Phone {
      public void charging(Voltage5V voltage5V){
          if (voltage5V.outPut5V()==5){
              System.out.println("充电");
          }else{
              System.out.println("不能充电");
          }


      }
}
