public class Test04 {
    public static void main(String[] args) {
        Sub b = new Sub();
        b.test300();
        b.test100();
        System.out.println(b.getN4());
    }
}
class  Sub extends Base {

    public void test300(){
        System.out.println("test300");
    }
}
