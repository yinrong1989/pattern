package pattern.prototype;

import java.io.*;

public class DeployClone  implements Cloneable,Serializable{




    protected Sheep deepClone(){
        //创建对象流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        Sheep sheep =null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            sheep = (Sheep)ois.readObject();


        } catch (Exception e) {
            e.printStackTrace();
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return sheep;
    }
}
