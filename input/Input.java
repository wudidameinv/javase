import java.util.Scanner;
public class Input{
	public static void main (String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		String name = myScanner.next();
		System.out.println("����������");
		int age = myScanner.nextInt();
		System.out.println("������нˮ");
		Double salary = myScanner.nextDouble();
            		System.out.println("�˵���Ϣ����");
		System.out.println("����=" + name +"\t����=" + age +"\tнˮ=" + salary);
	}
}