package lis;

public class Date{
	private int date;
	private int month;
	private int year;
	
	public Date(int year, int month, int date){
		setYear(year);
		setMonth(month);
		setDate(date);
	}
	
	public Date(Date other){
		this.setYear(other.year);
		this.setMonth(other.month);
		this.setDate(other.date);
	}
	
	public int getDate(){
		return date;
	}
	
	public void setDate(int date) {
		if(date < 1 || date > 31){
			System.out.println("Illegal argument for date.");
			return;
		}
		this.date = date;
	}
	
	public int getMonth(){
		return month;
	}
	
	public void setMonth(int month){
		if(month < 1 || month > 12){
			System.out.println("Illegal argument for month.");
			return;
		}
		this.month = month;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int year){
		if(year < 0 || year > 9999){
			System.out.println("Illegal argument for year.");
		}
	}
	
	public boolean equals(Date other){
		if(this.date == other.date && this.month == other.month && this.year == other.year){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		return String.format("%02d-02%d-%04d", date, month, year);
	}
}