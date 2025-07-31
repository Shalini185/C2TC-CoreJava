package day8.Interfaces.ExtendingInterfaces;

public class ExtendinginterfaceDemo implements ChildInterface{
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}

}
