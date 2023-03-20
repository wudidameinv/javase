package Extends;

public class Pc extends Compu{  //子 继承 父
   public String brand ;//先定义属性 用于后续添加
    //因为继承 构造器自动加上父类的属性 再自行添加自己要加的
    public Pc(String cpu, int memory, int disk,String brand) {
        super(cpu, memory, disk);
        this.brand =brand;//***构造器的初始化作用
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String detail() {
        return super.detail() + " " +brand;
        //system.out.println(detail() +"" +brand);
        //因为方法在本类所以可以直接调用
        //不然需要声明对象
    }
}
