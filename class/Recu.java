public class Recu {
	public static void main(String[] args){
		T t = new T();
		t.test(4);
		int res=t.fact(4);
		System.out.println(res);
		int ans = t.fib(6);
		System.out.println(ans);

	}
}
class T{
	public void test( int n){
		if(n>2){
			test(n-1);
		//}else{	
		}
		System.out.println(n);
	}

	public int fact( int n){
		for(int i =1; i<= n;i++){
			if( n ==1){
			return 1;
		}else{
			return fact(n-1) * n; //fact(n)????肯定死循环
			}
		}return 0;
		}
	
	public int fib(int n){
		if(n >= 1){
			if( n ==1|| n==2){
			return 1;
		}else{
			return fib(n-1) + fib(n-2); 
			}
		}return 0;
		//好像不用循环:)

	}
	}



