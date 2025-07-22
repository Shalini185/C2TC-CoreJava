package day2.entiyl;

public class Customer01 {
	private int id;
	private String name;
	private String city;
	public Customer01() {
		this.id=41;
		this.name="unknown";
		this.city="pudhucherry";
		
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
