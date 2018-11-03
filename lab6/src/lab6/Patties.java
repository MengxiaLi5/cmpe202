package lab6;

import java.util.ArrayList;

public class Patties implements Print{
	
	String orders;
	
	public Patties(){
		orders="";
	}

	@Override
	public void add(int number, CustomBurger burger) {
		orders += Integer.toString(number) + " " + burger.getType() + "\n";
		String top = "";
		String middle = "";
		String bottom = "";
		ArrayList<Topping> toppings = burger.getTop();
		for(Topping topping: toppings){
			if(topping.vertical.equals("top")){
				top = "     " + topping.name + "\n";
			}
			else if(topping.vertical.equals("middle")){
				middle = "    ->|" + topping.name + "\n";
			}else if(topping.vertical.equals("bottom")){
				bottom = "     " + topping.name + "\n";
			}
		}
		orders += top + middle + bottom;
	}

	@Override
	public void add(int number, String type, String price) {
		orders += Integer.toString(number) + " " + type + "\n";
	}


	@Override
	public void printing(String time, String number) {
		System.out.println(this.getClass().getName()+"\n");
		System.out.println("Order Number: " + number);
		System.out.println("      " + time + "      ");
		System.out.println("      FIVE GUYS      ");
		System.out.println("Sandwitch#1");
		System.out.println(orders);
	}

	@Override
	public void Cash(double d) {
		
	}


}
