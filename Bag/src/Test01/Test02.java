public class Test02 {
    public static void main(String[] args) {

        //第一种方法
        //先 new person 再一个个set

        Person p = new Person();
        p.setName("jac");
        p.setAge(25);
        p.say();

        //第二种方法
        //利用构造器 new person（实参数）直接进行set

        Person pi =new Person("hanpiiiiii",448,99);
        pi.say();
        //如果say是return 可以system
        //如果say是System 直接调用

    }
}

class Person{
    public String name;
    public int age ;
    private double salary;//属性一定要写

    public Person(){  //构造器需要两个 一个默认的无参数的 一个自己设置的 ***
        //构造器是为了输入实际参数进行初始化
       //也可以system
        //这样是保证用set确保范围合适 避免用构造器跳过set步骤

    }
    public Person(String name,int age ,double salary){
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }
    // get set是封装用的 因为属性private
    //保证数据私密 获得数据的方式***

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >2 && name.length() <6){//控制范围
            this.name = name;
        //    System.out.println(name);
        }else{
            this.name = "shenjingbing";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >=1 && age <=100){
            this.age = age;
        //    System.out.println(age);
        }else{
            this.age = 18;//不符合条件变成默认值
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;//也可以直接设置默认值
    }

    public void say(){
        System.out.println("name= " +name +" age = "+age+ " salary " +salary);
    }//输出信息用 也可以写return~
}
