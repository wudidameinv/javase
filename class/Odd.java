public class Odd {
	public static void main(String[] args){
	A a = new A();

	if(a.isOdd(5)){
		System.out.println("odd");
	}else{
		System.out.println("ou");
	}
	//a.ifOdd(1);
	}
}
/*	class A {
	public int ifOdd ( int n ){
		if (n % 2 != 0){
			System.out.println("odd");
		}else{
			System.out.println("ou");
		}
		return 0;
	}
}*/


class A{
	public boolean isOdd(int num){
		return num % 2 !=0;// ? true;false;
	}

}