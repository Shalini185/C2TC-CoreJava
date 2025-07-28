package day7.polymorphiam;//overloading

public class Addition {
	public void add() {
		System.out.println("Addition");
	}
	public int add(int a) {
		return a;
	}
	public  double add(double b) {
		return b;
	}
	public int add(int a, int b) {
		return a+b;
	}
	public void show(int n, String name) {
		System.out.println(n + name);
	}
	public void show(String name, int n) {
System.out.println(name + n);
}
}
