public class Test01 {
    public static void main(String[] args) {
      // A a = new A();   在不同类调用方法需要新建对象 用对象调用
        //主方法里面不能用public修饰属性 是因为定义的非静态变量
       // a.hi();    hi（）是无参方法
    }
}
class A{
    public int n1 =100;//修饰属性
    protected int n2 =200;
    int n3 =300;
    private int n4 =400;

    public void m1(){//修饰方法
        System.out.println("m1");
    }
    protected void m2(){
        System.out.println("m2");
    }
    public void hi(){
        m1();
        m2();//本类中方法相互调用  但不可以在方法中定义方法
        //同类 方法相互调用可以不新建对象 **
    }

}
class B{
    public static void main(String[] args) {

        A a = new A();
        a.m1();
        a.m2();
        a.hi();
    }
    //在B中创建对象才能调用A的方法
}

/*
//修饰符有public protected 默认 private 修饰
            同类          同包      子类      不同包
public  ok              ok          ok       ok
protected ok            ok          ok       no
默认 没有修饰符 ok         ok          ok       no
private ok              no          no       no

修饰符可以修饰类中的属性 成员方法 类
只能用public 默认修饰类

 */
/*
如果不赋值 有默认的值
int 0 double 0.0 String null boolean false

作用域 属性（成员变量） 和 局部变量
局部变量是指在成员方法中定义的变量 只能在成员方法中使用 必须赋值后才能使用
全局变量/属性/成员变量 作用域为整个类 有默认值 可以直接使用

属性和局部变量可以重名 访问方法就近原则
同一成员方法中 局部变量不能重名
属性生命周期较长随着对象创建而产生 局部变量随代码块执行而销毁

全局变量可以在别的类通过创建对象而使用 可以加修饰符
局部变量只能在成员方法中使用 不能加修饰符

包package
import放在package 在类定义前 下面可以有多句且没有顺序要求
声明当前类所属的包 放在类的前面 一个类只有一句package

构造器和方法区别
1.相同：都可以被修饰
2.构造器没有返回值 没有int double等返回类型 也没有void
  方法需要返回值或void
3.构造器名必须与类名完全相同
4.构造器可以使用this指向类
5.构造器是对对象进行初始化 不是创建对象
6.有参构造器 无参构造器 重载

封装使用 get set方法 访问private属性
在set时可以对赋值条件进行判断 字符串长度 数值大小等

因为用构造器可以避开 set的判断条件
所以可以在构造器中写入set方法***
 setName(name);或 this.setName(name)

private 只能通过set赋值 不能直接赋值
构造器 一次性对各种属性进行初始化
不用一个个用set赋值




 */
