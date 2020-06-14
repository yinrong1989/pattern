package pattern.prototype;


import java.io.*;
import java.lang.reflect.Array;

public class Sheep extends DeployClone{
    private String name;

    private Integer age;

    private String color;

    private Sheep friend;

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    //克隆该实例，适用默认的克隆
    @Override
    protected Object clone()  {

        Sheep sheep =null;
        try {
            sheep =(Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    protected Sheep deepClone2(){
        return super.deepClone();
    }
    @Override
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
