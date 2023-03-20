package Super_;

import java.sql.SQLOutput;

public class Super02 {
    public static void main(String[] args) {
         B b = new B();
         b.test();


    }
}
class B extends A{
    public void say(){
        System.out.println(super.n1); //使用super调用父类的属性
    }
    public void cal(){
        System.out.println("b cal");
    }
    public void sum(){
        System.out.println("b sum");
    }
    public void test(){
        this.cal();
        super.sum();
    }
}
/*
用super.属性名 直接访问父类属性 甚至是父类的父类
super.方法名也是一样的
 */