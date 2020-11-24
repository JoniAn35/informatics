package inventory;

public class Product {
	private int itemNumber;		//unique value for identification
    private String name;		//name of the product
    private int qtyInStock;		//quantity in stock
    private double price;		//price of the product
    private boolean active = true; //status of the product
    
    public Product() {
    }
    
    public Product(int number, String name, int qty, double price){ 
      this.itemNumber = number;
      this.name = name;
      this.qtyInStock = qty;
      this.price = price;
    }

    public void addToInventory(int quantity) {
    	this.qtyInStock += quantity;
    }
    
    public void deductFromInventory(int quantity) {
    	this.qtyInStock -= quantity;
    }
    
    //returns the current value of itemNumber
	public int getItemNumber() {
		return itemNumber;
	}

	//updates the value of itemNumber
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	//returns the current value of name
	public String getName() {
		return name;
	}

	//updates the value of name
	public void setName(String name) {
		this.name = name;
	}

	//returns the current value of qtyInStock
	public int getQtyInStock() {
		return qtyInStock;
	}

	//updates the value of qtyInStock
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	//returns the current value of price
	public double getPrice() {
		return price;
	}

	//updates the value of price
	public void setPrice(double price) {
		this.price = price;
	}

	//returns the current value of active
	public boolean getActive() {
		return active;
	}

	//updates the value of active
	public void setActive(boolean active) {
		this.active = active;
	}
	
	//get total value of inventory for this Product
    public double getInventoryValue(){
      return price * qtyInStock;
    }
	
	//override toString() Method from the Object class
	//to allow display of each object to the console
	public String toString(){
	     return "\n\nItem Number      : " + this.itemNumber 
	   			+ "\nName             : " + this.name 
	   			+ "\nQuantity in stock: " + this.qtyInStock 
	   			+ "\nPrice            : " + this.price
	   			+ "\nStock Value      : " + getInventoryValue()
	   			+ "\nProduct Status   : " + (this.active?"Active":"Discontinued");
	}

}



