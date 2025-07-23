package Day3.Scanner;
import java.util.Scanner;
public class personDemo {
	public static void main(String[] args) {
Scanner ob = new Scanner(System.in);
		
		String name;
		System.out.println("Enter Person Name : ");
		name = ob.next();
		System.out.println("Enter age: ");
		int age = ob.nextInt();
		System.out.println("Enter gender: ");
		String gender = ob.next();
		System.out.println("Enter taxable income: ");
		int income = ob.nextInt();
		
		//Person object and initialize values using setter
		person per = new person();
		per.setName(name);
		per.setAge(age);
		per.setGender(gender);
		per.setIncome(income);
		
		//display person details using toString() method
		System.out.println(per);
		
		TaxCalci calc = new TaxCalci();
		calc.calculateTax(per); //tax calculation
		System.out.println("After calculating tax : ");
		System.out.println(per);

		ob.close();
	}

	

}
