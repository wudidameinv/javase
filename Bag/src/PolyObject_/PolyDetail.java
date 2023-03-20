package PolyObject_;

public class PolyDetail {
    public static void main(String[] args) {
        //A a =new A();
        A a = new B();
        System.out.println(a instanceof A);//判断某个对象是否为运行类型或子类型
        System.out.println(a instanceof B);

    }
}
/*
多态
Animal animals = new Cat();
Object obj = new Cat();
向上转型
左 编译类型 编译类型不能改变
右 运行类型 可以强制改变
animals 就作为cat类型运行
animals.eat(); fish

同理 Cat cat =(Cat) Animal;
向下转型
cat.catch();
调用属性看编译类型 方法看运行类型

*/
class A{
}
class B extends A{
}


