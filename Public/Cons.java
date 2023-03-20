public class Cons {
	public static void main(String[] args){
	Person p = new Person();
	System.out.println(p.name);
	System.out.println(p.age);

	
	Person p1 = new Person();
	System.out.println(p1.name);
	System.out.println(p1.age);
	
	Person p2 = new Person("sot",55);
	System.out.println(p2.name);
	System.out.println(p2.age);
	}
}
class Person{
	String name;
	int age;
	public Person(){
		age =18;
	}
	public Person(String pname, int page){
		System.out.println("GOUZAOQI");
		name = pname;
		age = page;
	}
}