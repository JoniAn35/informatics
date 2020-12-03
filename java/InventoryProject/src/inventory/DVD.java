package inventory;

public class DVD extends Product{
	private int lenght;
	private int ageRating;
	private String studio;
	
	public DVD(int number, String name, int qty, double price, int lenght, int rating, String studio) {
		super(number, name, qty, price);
		this.setLenght(lenght);
		this.setAgeRating(rating);
		this.setStudio(studio);
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(int ageRating) {
		this.ageRating = ageRating;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}
	
    public double getInventoryValue(){
        return (super.getPrice() * super.getQtyInStock()) * 1.05;
    }
    
    public String toString(){
	     return "\n\nItem Number      : " + super.getItemNumber() 
	   			+ "\nName             : " + super.getName()
	   			+ "\nMovie Lenght	  : " + this.lenght
	   			+ "\nAge Rating 	  : " + this.ageRating
	   			+ "\nFilm Studio	  : " + this.studio
	   			+ "\nQuantity in stock: " + super.getQtyInStock()
	   			+ "\nPrice            : " + super.getPrice()
	   			+ "\nStock Value      : " + getInventoryValue()
	   			+ "\nProduct Status   : " + (super.getActive()?"Active":"Discontinued");
	}
	
}
