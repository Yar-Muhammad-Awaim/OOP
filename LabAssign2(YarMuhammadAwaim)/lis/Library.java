package lis;

public class Library{
	private String name;
	private Book book;
	private Person incharge;
	private Person staff;
	
	public Library(String name, Book book, Person incharge, Person staff){
		setName(name);
		setBook(book);
		setIncharge(incharge);
		setStaff(staff);
	}
	
	public Library(Library other){
		this.setName(other.name);
		this.setBook(other.book);
		this.setIncharge(other.incharge);
		this.setStaff(other.staff);
	}
	
	@Override
	public String toString(){
		return String.format("%s\n%Name: %s\nBook: %s\nIncharge: %s\nStaff: %s\n");
	}
	
	public boolean equals(Library other){
		if(this.name.equals(other.name) && this.book.equals(other.book) && this.incharge.equals(other.incharge) && this.staff.equals(other.staff)){
			return true;
		}
		return false;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Book getBook(){
		return book;
	}
	
	public void setBook(Book book){
		this.book = book;
	}
	
	public Person getIncharge(){
		return incharge;
	}
	
	public void setIncharge(Person incharge){
		this.incharge = incharge;
	}
	
	public Person getStaff(){
		return staff;
	}
	
	public void setStaff(Person staff){
		this.staff = staff;
	}
}