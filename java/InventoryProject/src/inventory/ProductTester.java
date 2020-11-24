package inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maxSize, menuChoice;
		
		System.out.println("Enter the number of products you would like to add.");
		System.out.print("Enter 0 (zero) if you do not wish to add products: ");
		
		maxSize = getUserChoice(-1, in);

		if(maxSize ==0) {
			System.out.println("No products required!");
		}else {
			Product[] products = new Product[maxSize];
	        addToInventory(products, in);
	        
	        do {
	        	menuChoice = getMenuOption(in);
	        	executeMenuChoice(menuChoice, products, in);
	        } while(menuChoice != 0);
		}
	}

	public static void desplayInventory(Product[] x) {
		int l = x.length;
		for(int i = 0; i < l; i++) {
			System.out.println(x[i]);
		}
	}
	
	public static void addToInventory(Product[] x, Scanner in) { 
		in.nextLine();
    	String tempName;
    	int tempQty;
    	double tempPrice;
    	int tempNumber;
    	int l = x.length;

    	for(int i = 0; i < l; i++) {
			System.out.print("\n\nPlease enter the product name: ");
			tempName = in.nextLine();
			
			System.out.print("Please enter the quantity of stock for this product: ");
			tempQty = in.nextInt();
			
			System.out.print("Please enter the price for this product: ");
			tempPrice = in.nextDouble();
			
			System.out.print("Please enter the item number: ");
			tempNumber = in.nextInt();
	
			x[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
    	}
	}
	
	public static int getNumProducts(Scanner in) {
		int maxSize = getUserChoice(-1, in);
		
		return maxSize;
	}
	
	public static int getMenuOption(Scanner in) {
		System.out.println(	"\n1. View Inventory" + 
							"\n2. Add Stock" + 
							"\n3. Deduckt Stock" + 
							"\n4. Discontinue Product" +
							"\n0. Exit" +
							"\nPlease enter a menu option: ");
		
		return getUserChoice(4, in);
	}
	
	public static int getProductNumber(Product[] x, Scanner in) {
		int l = x.length;
		
		for(int i = 0; i < l; i++) {
			System.out.println(i + " " + x[i].getName());
		}
		
		System.out.println("Please select a product: ");
		int productChoice = getUserChoice((l - 1), in);
		
		return productChoice;
	}
	
	public static int getUserChoice(int maxValue, Scanner in) {
		int choice = -1;
		
		do{
			try{	
				choice = in.nextInt();	
				if(choice < 0 || (maxValue > 0 && choice > maxValue)) {
					System.out.println("Incorrect Value entered");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();
			}
			catch(Exception e){
				System.out.println(e);
				in.nextLine();
			}
		} while(choice < 0 || (maxValue > 0 && choice > maxValue));
		
		return choice;
	}
	
	public static void addInventory(Product[] x, Scanner in) {
		int productChoice;
		int updateValue = -1;
		
		productChoice = getProductNumber(x, in);
		
		System.out.println("How many products do you want to add?");
		updateValue = getUserChoice(-1, in);
		
		x[productChoice].addToInventory(updateValue);
	}
	
	public static void deductInventory(Product[] x, Scanner in) {
		int productChoice;
		int updateValue = -1;
		
		productChoice = getProductNumber(x, in);
		
		System.out.println("How many products do you want to deduct?");
		updateValue = getUserChoice(x[productChoice].getQtyInStock(), in);
		
		x[productChoice].deductFromInventory(updateValue);
	}
	
	public static void discontinueInventory(Product[] x, Scanner in) {
		int productChoice = getProductNumber(x, in);
		x[productChoice].setActive(false);
	}
	
	public static void executeMenuChoice(int choice, Product[] x, Scanner in) {
		switch (choice) {
			case 1:
				desplayInventory(x);
				break;
			case 2:
				addInventory(x, in);
				break;
			case 3:
				deductInventory(x, in);
				break;
			case 4: 
				discontinueInventory(x, in);
				break;
		}
	}
}
