public class Para {
	public static void main(String[] args){
	Person p = new Person();
	B b = new B();
	p.name ="marry";
	p.age = 22;

	b.test200(p);

	System.out.println(p.age);
	}
}
class Person{
	String name;
	int age;
}
class B{
	public void test200(Person p){
		
		//p = new Person();
		p.name ="tom";
		p.age =200; 
	}
}