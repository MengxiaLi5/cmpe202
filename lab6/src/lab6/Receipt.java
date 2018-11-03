package lab6;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Receipt implements Print{
	
	String orders;
	float total;
	double amount;
	
	public Receipt(){
		orders="";
		total = 0;
	}

	@Override
	public void add(int number, CustomBurger burger) {
		String price = burger.getPrice();
		String script = Integer.toString(number) + "   " + burger.getType();
		orders += script + "         "+ price + "\n";
		ArrayList<Topping> toppings = burger.getTop();
		for(Topping topping: toppings){
			String ex = "";
			if(topping.vertical.equals("middle"))
				ex = "->|";
			ex += topping.name;
			orders += ("  "+ex+"\n");
		}
		total += Float.parseFloat(price);
		
	}

	@Override
	public void add(int number, String type, String price) {
		String script = Integer.toString(number) + "   " + type;
		orders += script + "         "+ price + "\n";
		total += Float.parseFloat(price);
	}

	@Override
	public void Cash(double d) {
		this.amount = d;
	}
	
	@Override
	public void printing(String time, String number) {
		System.out.println(this.getClass().getName()+"\n");
		System.out.println("      FIVE GUYS      ");
		System.out.println("    BURGER AND FRIES ");
		System.out.println("    STORE # CA-1294  ");
		System.out.println("5353 ALMADEN EXPY N60");
		System.out.println("  SAN JOSE, CA 95118 ");
		System.out.println("   (P) 408-264-9300  ");
		System.out.println("\n");
		System.out.println("      " + time + "      ");
		System.out.println("      FIVE GUYS      ");
		System.out.println("Order Number: " + number);
		System.out.println(orders);
		System.out.println("\n");
		String first = "Sub. Total";
		String second = "$"+total;
		System.out.println(first + "         "+second);
		System.out.println("Cash: " + "           "+amount);
		DecimalFormat df = new DecimalFormat("0.00");
		Double c  = amount - total;
		String change = df.format(c);
		System.out.println("Change:" +"          "+ change);
	}
	



}
