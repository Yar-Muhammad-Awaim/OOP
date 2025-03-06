package lis;

public class Person{
	private String name;
	private String role;
	private Address address;
	
	public Person(String name, String role, Address address){
		setName(name);
		setRole(role);
		setAddress(address);
	}
	
	public Person(Person other){
		this.setName(other.name);
		this.setRole(other.role);
		this.setAddress(other.address);
	}
	
	@Override
	public String toString(){
		return String.format("Name: %s\nRole: %s\nAddress: %s", name, role, address);
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getRole(){
		return role;
	}
	
	public void setRole(String role){
		this.role = role;
	}
	public Address getAddress(){
		return address;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}
}