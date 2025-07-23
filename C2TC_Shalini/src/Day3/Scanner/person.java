package Day3.Scanner;

public class person {
	private int tax;
	private int income;
	private String name;
	private String gender;
	private int  age;
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [tax=" + tax + ", income=" + income + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ "]";
	}
	

}
