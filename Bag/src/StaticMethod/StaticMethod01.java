package StaticMethod;

public class StaticMethod01 {
    public static void main(String[] args) {


    Stu s1 = new Stu("mary");
    s1.payFee(10000);
    s1.showFee();
}
}
class Stu{
    private String name ;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        Stu.fee += fee;
    }
    public void showFee(){
        System.out.println(Stu.fee);
    }
}
