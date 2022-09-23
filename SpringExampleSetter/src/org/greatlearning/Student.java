package org.greatlearning;

public class Student {
	private String id;
	
	private String name;
private  String city;

private  Address address;


	public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

	public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void displayInfo()
	{
		System.out.println(id+"  "+name+" "+city);
		System.out.println(address);
	}

}
