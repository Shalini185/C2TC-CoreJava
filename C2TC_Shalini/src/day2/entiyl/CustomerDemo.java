package day2.entiyl;

public class CustomerDemo {
	public static  void main(String[] args) {
		 Customer01 cus1 = new Customer01();
		 Customer01 cus2 = new Customer01(41,"shalzz","Chennai");
		 Customer01 cus3 = new Customer01(42,"ram");
		
		 //cus1.setId(41);
		 cus2.setId(62);
		// cus1.setName("Shalini");
		 cus2.setName("Ram");
		// cus1.setCity("Cuddalore");
		 cus3.setName("Ramkumar");
		 System.out.println(cus2);
		 System.out.println(cus3);
		 System.out.println("Customer 1 city : " + cus1.getCity() + " Customer 1 name : " + cus2.getName() );
		 
	}

}
