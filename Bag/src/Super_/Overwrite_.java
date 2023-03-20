package Super_;

public class Overwrite_ {
    public static void main(String[] args) {
        Student s = new Student("s",15,"88888",99);
        System.out.println(s.say());

        Person p = new Person("jab",55);
        System.out.println(p.say());

    }
}
/*
方法重写/方法覆盖
子类的方法的参数，方法名称与父类的方法，参数名称完全一致
子类方法返回类型与父类方法返回类型一致或者是父类返回类型的子类
子类方法不能缩小父类方法范围 public> pro> 默认>pri

重载和重写的区别
1.重载 本类 方法名必须一样 参数类型 个数 顺序必须不一样 返回类型无要求 修饰符无要求
2.重写 父子类 方法名必须一样 参数类型 个数 顺序必须一样 返回类型一样或子类 不能缩小范围





 */