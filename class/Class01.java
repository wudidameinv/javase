import java.util.Scanner;
public class Class01 {
	public static void main(String[] args){
		Person p = new Person();
		p.cal01();
		p.cal02(5);
		int returns = p.getSum(2,3);
		System.out.println( returns);

	}
}
class Person{
		public void cal01(){
		int res = 0;
		for(int i= 0; i<100;i++){
			res += i;
		}
		System.out.println("jieguoshi"+ res);
	}
		public void cal02(int n){
		int res = 0;
		for(int i  = 1; i<= n;i++){
			res += i;
			
		}
	System.out.println("jieguoshi"+ res);
	}

	public int getSum(int n1,int n2){
		int res = n1 + n2;
		return res;
	}

}
//void 不用写return 其他要写
//要有一个接受return的值
//class
//引用方法
//接收值
//属性
//方法
