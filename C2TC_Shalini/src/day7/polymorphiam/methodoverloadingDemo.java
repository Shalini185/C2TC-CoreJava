package day7.polymorphiam;

public class methodoverloadingDemo {
	public static void main(String[] args) {
		
		Addition s=new Addition();
		s.add();
		System.out.println(s.add(6));
		System.out.println(s.add(6.3));
		
		s.show(1," shal");
		s.show("shal ",12);
	}

}
