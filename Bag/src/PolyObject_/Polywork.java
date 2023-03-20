package PolyObject_;

public class Polywork {
    public static void main(String[] args) {
        Work w = new Work("jim",5000);
        Manager m = new Manager("mary",6000,10000);

        Polywork p = new Polywork(); //因为这个类就是Polywork 所以可以创建对象 使用方法
        p.showannu(w);                  //一个包内 非静态方法可以互相调用
        p.showannu(m);

    }public void showannu(Empolyee e){ //静态方法只能调用静态方法 所以肯定写不进去
            System.out.println(e.getanau());
    }
}
class Empolyee{
    private String name;
    private double salary;

    public Empolyee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getanau(){
        return 12*salary;
    }
}
class Work extends Empolyee{
    public Work(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getanau() {
        return super.getanau();
    }
}
class Manager extends Empolyee{
    private double bouns;

    public Manager(String name, double salary, double bouns) {
        super(name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public double getanau() {
        return super.getanau() + bouns;
    }
}
