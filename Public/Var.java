public class Var {
	public static void main(String[] args){
	Person p = new Person();
	Person p1 = new Person();
	T t = new T() ;
	

	t.test1();
	t.test2(p1);
	}
}
class T{
	public void test1(){
		Person p1 = new Person() ;//两种不同方式！！
		System.out.println(p1.name);
	}
	public void test2(Person p){
		System.out.println(p.name);
	}
		
}
class Person{
	String name = "tom";
	public void say(){
		String name ="marry";
		System.out.println("sayname" + name);
	}
}
//可变参数 实参可以为0个或任意多个
//
//可变参数的实参可以为数组
//
//可变参数的本质就是数组
//
//可变参数可以和普通类型的参数一起放在形参列表 但可变参数必须放在最后
//
//一个形参列表只能有一个可变参数
class A{
    public int sum(int n1,int...ints){
    return n1;//除了void都要有返回值 可变参数也有参数名
    }
    public void say( int n2,int[] arr,String ...strs){
    	//里面可以有变量 数组 可变参数（本质也是数组）
    }
}

