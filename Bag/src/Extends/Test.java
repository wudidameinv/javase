package Extends;

public class Test {
    public static void main(String[] args) {
        //用的子类 信息更多 用父类就没有添加的东西了
        Pc pc = new Pc("ii",55,66,"888");//构造器使用***
        //System.out.println(pc.detail()); 重写后
        //system.out.println(pc.detail+""+brand）;
        //System.out.println(pc.detail()+ "" + pc.brand); 未重写时
        //其他类调用方法声明对象 方法调用detail()


    }
}
/*
子类继承父类
如果子类想要得到父类的私有属性需要通过如下方法
即父类提供public方法 得到属性使子类使用
public int getN4(){
return n4;
}

创建子类对象 调用子类方法 现在子类中查找 没有去父类 有（是否满足访问权限 不满足报错 满足调用） 没有 再往上找直到object
都没找到 提示方法不存在
属性 方法都是这样

调用子类有参构造器时 默认有super（）调用父类无参构造器 ***
无参构造器因为有this所以没有super 不会调用父类无参构造器 ***

父类构造器完成父类属性初始化
子类构造器完成子类属性初始化 因为有this 所以不能有super 因为都是需要写在第一行

用super.属性名 直接访问父类属性 甚至是父类的父类
super.方法名也是一样的







 */
