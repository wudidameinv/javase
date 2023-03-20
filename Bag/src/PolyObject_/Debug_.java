package PolyObject_;

public class Debug_ {
    //创建对象的流程
    //（1）加载 person类信息
    //(2)初始化 2.1 默认初始化 2.2 显式初始化 2.3 构造器初始化
    //(3)返回对象的地址
}
//类变量和类方法
// public static int i = 0;
//静态变量 一定要初始化 而且是对象共享
//static变量同一个类所有对象共享 在类加载的时候就生成了

//使用静态变量 类名.类变量名 或对象名.类变量名
//类名随着类的加载而生成 不需要创建实例对象也可以访问

//当某类的所有对象都需要同一个变量时 创建类变量
//非静态变量是某个对象特有的 不是共有的
//类变量 也成为静态变量 static  没有创建对象也能使用 加载类的时候就已经生成
//不加则是 实例变量 普通变量 非静态变量  不能通过类名直接访问 只能通过创建实例对象
//类变量随着类的加载开始 随着类的消亡销毁

//静态方法 public static void say(){}


