package day2.entiyl;

public class Customer01 {
	private int id;
	private String name;
	private String city;
	
	//default constructor
	public Customer01() {
		System.out.println("");
		this.id=41;
		this.name="unknown";
		this.city="pudhucherry";
		
	}
	
	 
	//parameterized constructor with 3parameter
	public Customer01(int id, String name, String city) {
		//super();
		this();
		this.id = id;
		this.name = name;
		this.city = city;
		
	}
	//parameterized constructor with 2parameter
	public Customer01(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
		//System.out.println(id ":" + name +);
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Customer01 [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	

}
