package lis;

public class Book{
	private String title;
	private String issn;
	private Date publicationDate;
	private Person author;
	
	public Book(String title, String issn, Date publicationDate, Person author){
		setTitle(title);
		setISSN(issn);
		setPublicationDate(publicationDate);
		setAuthor(author);
	}
	
	public Book(Book other){
		this.setTitle(other.title);
		this.setISSN(other.issn);
		this.setPublicationDate(other.publicationDate);
		this.setAuthor(other.author);
	}
	
	@Override
	public String toString(){
		return String.format("Book Details\n%s\nTitle: %s\nISSN: %s\nPublication Date: %s\nAuthor: %s",("-").repeat(30), title, issn, publicationDate, author);
	}
	
	public boolean equals(Book other){
		if(this.title.equals(other.title) && this.issn.equals(other.issn) && this.publicationDate.equals(other.publicationDate) && this.author.equals(other.author)){
			return true;
		}
		return false;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getISSN(){
		return issn;
	}
	
	public void setISSN(String issn){
		this.issn = issn;
	}
	
	public Date getPublicationDate(){
		return publicationDate;
	}
	
	public void setPublicationDate(Date publicationDate){
		this.publicationDate = publicationDate;
	}
	
	public Person getAuthor(){
		return author;
	}
	
	public void setAuthor(Person author){
		this.author = author;
	}
}