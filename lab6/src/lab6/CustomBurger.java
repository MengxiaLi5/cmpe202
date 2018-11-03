package lab6;

import java.util.ArrayList;

public class CustomBurger {

	private String name;
	private String price;
	private ArrayList<Topping> toppings = new ArrayList<Topping>();
	
	public CustomBurger(String name, String price){
		this.name = name;
		this.price = price;
	}
	
	public void addTopping(String vertical, String name){
		Topping addTop = new Topping(vertical, name);
		toppings.add(addTop);
	}
	public String getType(){
		return this.name;
	}
	public String getPrice(){
		return this.price;
	}
	public ArrayList<Topping> getTop(){
		return this.toppings;
	}
}
