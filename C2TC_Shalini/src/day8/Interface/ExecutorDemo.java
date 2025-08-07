package day8.Interface;

public class ExecutorDemo {
	public static void main(String[] args) {
		Coder c1; //reference
		c1=new Student(); //obj
		c1.rules();
		c1=new Trainer ();//obj
		c1.rules();
	}

}
