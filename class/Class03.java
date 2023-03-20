public class Class03 {
	public static void main(String[] args){
	A hi = new A(); 
	//hi.a();
	hi.c();
	}
}
class A{
	public void a( int n) {
		System.out.println("a1!" + n);
		//B he = new B();
		//he.b();
	}	//System.out.println("a2!");
	public void c() {
        a(10);
		System.out.println("c ok");
	
	}
	
}
/*class B{	
	public void b() {
		System.out.println("b!");
	}
}*/