package codingTestday12;
class Animal{  
	String printMsg(){return "Animal";}  
}  
class Horse extends Animal{  
	String printMsg(){return "Horse";}  
}  
class Dog extends Animal{  
	String printMsg(){
		return "Dog";
	}  
}  
class Cat extends Animal{  
	String printMsg(){
		return "Cat";
	}  
}
class TestPolymorphism{  
	public static void main(String args[]){  
		Animal b;  
		b=new Horse();  
		System.out.println("Horse Animal: "+b.printMsg());  
		b=new Dog();  
		System.out.println("Dog animal: "+b.printMsg());  
		b=new Cat();  
		System.out.println("Cat animal: "+b.printMsg());  
	}  
}