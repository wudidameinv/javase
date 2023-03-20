public class Test03 {
    public static void main(String[] args) {
    }
}
class Base  {
    public int n1 = 100;
    protected int n2 = 200;
     int n3 =300;
     private int n4 =400;

     public Base(){
         System.out.println("base()");
         //无参构造器 必须要有***
     }
     public void test100(){
         System.out.println("test100");

     }

    public int getN4() {
        return n4;
    }
}
