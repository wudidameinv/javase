package PolyObject_;

public class Polyarr {
    public static void main(String[] args) {
        Person[] person = new Person[3]; //创建数组
        person[0] = new Person("jack",25);
        person[1] = new Student("jane",22,89);
        person[2] = new Teacher("mary",45,45000);

    for(int i =0; i< person.length;i++) {
        System.out.println(person[i].say());//动态绑定机制
    }
    for(int i =0; i< person.length;i++) {
            if (person[i] instanceof Student){
                ((Student)person[i]).study(); //向下转型
            }else if(person[i] instanceof Teacher){
                ((Teacher)person[i]).teach();//向下转型 这样父类person可以使用子类的特殊方法
            }else{
                System.out.println("wu");
            }
        }
    }
}
