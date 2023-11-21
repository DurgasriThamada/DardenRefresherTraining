package oops.java;

public class AbstractClass_4 {

	abstract void methodOne();
	
}

// If any class has an abstract method, then the class should be declared as abstract

abstract class AbstractClass1{
	
	abstract void methodOne();
	abstract void methodTwo();
}

class Ex {
	public static void main(String Args[]) {
		//attempting to instantiate an abstract class will result in a compilation error
		AbstractClass1 absCls = new AbstractClass1();
	}
}

// if a class extends abstract class it should override all the abstract methods of the abstract class
class Ex1 extends AbstractClass1{

	@Override
	void methodOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void methodTwo() {
		// TODO Auto-generated method stub
		
	}
	
}

//if the class extends abstract class and dooesn't have any abstract methods of the abstract class then the class should be an abstract class
abstract class Ex2 extends AbstractClass1{

}

//abstract class cannot be private as it restricts the visibility which unable the extension to the other classes
private abstract class A{
	
}

//abstract class cannot be final as it restricts the visibility which unable the extension to the other classes
final abstract class B{
	
}

//class can be abstract without having any abstract methods in it.
abstract class C{
	
}