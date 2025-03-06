package lis;

public class Address{
	private String street;
	private String city;
	
	public Address(String street, String city){
		setStreet(street);
		setCity(city);
	}
	
	public Address(Address other){
		this.setStreet(other.street);
		this.setCity(other.city);
	}
	
	public String getStreet(){
		return street;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public boolean equals(Address other){
		if(this.street.equals(other.street) && this.city.equals(other.city)){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		return String.format("Street: %s\nCit:%s\n", street, city);
	}
}