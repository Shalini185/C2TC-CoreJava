package day2.entiyl;

public class CustomerDemo {
	public static  void main(String[] args) {
		 Customer01 cus1 = new Customer01();
		 Customer01 cus2 = new Customer01();
		 Customer01 cus3 = new Customer01();
		
		 //cus1.setId(41);
		 cus2.setId(62);
		// cus1.setName("Shalini");
		 cus2.setName("Ram");
		// cus1.setCity("Cuddalore");
		 System.out.println(cus1);
		 System.out.println("Customer 1 city : " + cus1.getCity() + " Customer 1 name : " + cus2.getName() );
		 
	}

}
