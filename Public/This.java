public class This {
	public static void main(String[] args){
		Dog dog1 = new Dog("55",55);
		Dog dog2 = new Dog ("88",88);
	
	//	dog1.info();
	System.out.println(dog1.compa(dog2));

	}
}
class Dog{
	String name;
	int age ;

	public Dog( String name,int age){
		this.name = name;
		this.age =age;
	}
	//public void info(){
	//	System.out.println(name);
	
	public boolean compa(Dog dog){
		return this.name.equals(dog.name);
	}
}
