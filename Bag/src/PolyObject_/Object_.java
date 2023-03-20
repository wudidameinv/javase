package PolyObject_;

public class Object_ {
    public static void main(String[] args) {
    Integer inter1 = new Integer(500); //无参是默认的 如果有参需要重新创建构造器
    Integer inter2 = new Integer(500);
        System.out.println(inter1 == inter2);
        System.out.println(inter1.equals(inter2));
    }
//Integer不是自己定义的 判断两个值是否相等
    //equals只能判断引用类型 String重写比较内容 Integer也重写
    //基本数据类型判断数值是否相等 == 字符是基本类型 引用类型判断地址是否相同 字符串是引用类型
}
class Inter{
 public int num;
    public Inter(int num) {
        this.num = num;
    }
}
