package depInjSetter;

public class Employee {
	private int id;  
	private String name;  
	private Address address; 
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	void display(){  
	    System.out.println(id+" "+name);  
	}  
	void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}  
}
