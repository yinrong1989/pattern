package pattern.prototype;

public class Client {

    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建 ");

        Sheep sheep = new Sheep("tom",1,"白色");
        Sheep sheep2 =(Sheep) sheep.clone();
        Sheep sheep3 =(Sheep)sheep.clone();
        sheep3.setName("jim");
        Sheep sheep4 =(Sheep)sheep.clone();
        Sheep sheep5 =(Sheep)sheep.clone();
        Sheep sheep6 =(Sheep)sheep.clone();
        Sheep sheep7 =(Sheep)sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        System.out.println(sheep6);
        System.out.println(sheep7);

        Sheep sheepTom = new Sheep("tom",2,"白色");
        Sheep frendSheep = new Sheep("lily",2,"黑色");
        sheepTom.setFriend(frendSheep);
        frendSheep.setFriend(sheepTom);
        Sheep sheepTomCopy = sheepTom.deepClone2();
        System.out.println(sheepTom);
        System.out.println(sheepTomCopy);
    }
}
