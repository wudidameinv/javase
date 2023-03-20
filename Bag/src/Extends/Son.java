package Extends;

public class Son {
    public static void main(String[] args) {
        Sons s = new Sons();
        System.out.println(s.name);
        System.out.println(s.hobby);
        System.out.println(s.age);
    }
}
class Grand{
    String name ="laotou";
    int age = 10;
}
class Fat extends Grand{
    String name ="buzhidao";
    String hobby ="heh";
}
class Sons extends Fat{
    String name ="sin";

}