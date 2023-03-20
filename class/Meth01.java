public class Meth01 {
	public static void main(String[] args){

		Person p = new Person();
		p.name="marry";
		p.age=22;

		Myto to = new Myto();
		Person b = to.copy(p);//******

		System.out.println( b== p); 
	}
}
//class MyTool{
//	public void print(int[][] map){

//	}
//}
class Person{
	String name;
	int age;
}
class Myto{
	public Person copy(Person p){ //********person
		Person b = new Person();
		b.name = p.name;
		b.age = p.age; 
		return b;
	}
}
//void person 不兼容
//copy方法 类型也应当是person类型