import java.util.Scanner;
public class Input{
	public static void main (String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水");
		Double salary = myScanner.nextDouble();
            		System.out.println("人的信息如下");
		System.out.println("名字=" + name +"\t年龄=" + age +"\t薪水=" + salary);
	}
}