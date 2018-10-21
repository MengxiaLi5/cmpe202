package lab6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Food {

	public static void main(String[] args) {

		System.out.println("food 1:");
		Scanner scanner = new Scanner(System.in);
        String burger = scanner.nextLine();
        Order order = new Order(burger);


        if(burger.equals("LBB")){
        	System.out.println("Topping1:");
            Scanner scanner2 = new Scanner(System.in);
            String topping1 = scanner.nextLine();
        	if(!topping1.equals("1")) {
            	order.setToppingName1(topping1);
            	System.out.println("Topping2:");
            	Scanner scanner3 = new Scanner(System.in);
                String topping2 = scanner.nextLine();
                if(!topping2.equals("1")) {
                 	order.setToppingName2(topping2);
                 	System.out.println("Topping3:");
                 	Scanner scanner4 = new Scanner(System.in);
                 	String topping3 = scanner.nextLine();
                 	if(!topping3.equals("1")){
                 		order.setToppingName3(topping3);
                 		System.out.println("Topping4:");
                     	Scanner scanner5 = new Scanner(System.in);
                     	String topping4 = scanner.nextLine();
                     	if(!topping4.equals("1")){
                     		order.setToppingName4(topping4);
                     	}
                 	}
                 }
            }
        }


        if(burger.equals("LBB")) order.setBurgerPrice(5.59);
        System.out.println("food 2");
        String fries = scanner.nextLine();
        Order order2 = new Order(fries);
        if(fries != "1"){
        	if(fries.equals("LTL CAJ")) order.setBurgerPrice(2.79);
        }
        System.out.println("Charge:");
		int money = scanner.nextInt();

		
		System.out.println("    FIVE GUYS");
		System.out.println(" BURGERS AND FRIES");
		System.out.println("  STORE # CA-1294");
		System.out.println("5353 ALMADEN EXPY N60");
		System.out.println(" SAN JOSE, CA 95118");
		System.out.println("  (P) 408-264-9300");
		System.out.println("");
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String date = df.format(new Date());
		System.out.println(date);
		System.out.println("");
		System.out.println("    FIVE GUYS");
		System.out.println("order number: 45");
		System.out.println("1:  "+ order.getBurgerName()+"      "+ order.getBurgerPrice());
		if(burger.equals("LBB")) System.out.println("  {{{BACON}}}}");
		if(order.getToppingName1() != null){
			if(order.getToppingName1().equals("G ONION") || order.getToppingName1().equals("JALA Grilled")){
				System.out.println("-> | " + order.getToppingName1());
			} else{
				System.out.println(order.getToppingName1());
			}
		}
		if(order.getToppingName2() != null){
			if(order.getToppingName2().equals("G ONION")|| order.getToppingName2().equals("JALA Grilled")){
				System.out.println("-> | " + order.getToppingName2());
			} else{
				System.out.println(order.getToppingName2());
			}
		}
		if(order.getToppingName3() != null){
			if(order.getToppingName3().equals("G ONION")|| order.getToppingName3().equals("JALA Grilled")){
				System.out.println("-> | " + order.getToppingName3());
			}else{
				System.out.println(order.getToppingName3());
			}
		}
		if(order.getToppingName4() != null){
			if(order.getToppingName4().equals("G ONION")|| order.getToppingName4().equals("JALA Grilled")){
				System.out.println("-> | " + order.getToppingName4());
			}else{
				System.out.println(order.getToppingName4());
			}
		}
		if(!fries.equals("1")){
			System.out.println("2: " + order2.getBurgerName());
		}
		double total = order.getBurgerPrice() + order2.getBurgerPrice();
		double change = money - total;
		System.out.println("Total:    " + total);
		System.out.println("Cash: $" + money);
		System.out.println("change: $" + change);
		System.out.println("Register:1    Tran Seq No: 57845");
		System.out.println("Cashier:Sakda* S.");
		System.out.println("********************************");
		System.out.println("Don't throw away your receipt!");




		System.out.println("--------------------------------");
		System.out.println("Patties - 1");
		System.out.println("");
		System.out.println("order number: 45");
		System.out.println(date);
		System.out.println("");
		System.out.println("    FIVE GUYS");
		System.out.println("Sandwitch #1");
		System.out.println("1:  "+ order.getBurgerName());
		if(order.getToppingName1() != null){
			if(order.getToppingName1().equals("G ONION") || order.getToppingName1().equals("JALA Grilled")){
				System.out.println("-> | " + order.getToppingName1());
			} else{
				System.out.println(order.getToppingName1());
			}
		}
		if(order.getToppingName2() != null){
			if(order.getToppingName2().equals("G ONION")|| order.getToppingName2().equals("JALA Grilled")){
				System.out.println("-> | " + order.getToppingName2());
			} else{
				System.out.println(order.getToppingName2());
			}
		}
		if(order.getToppingName3() != null){
			if(order.getToppingName3().equals("G ONION")|| order.getToppingName3().equals("JALA Grilled")){
				System.out.println("-> | " + order.getToppingName3());
			}else{
				System.out.println(order.getToppingName3());
			}
		}
		if(order.getToppingName4() != null){
			if(order.getToppingName4().equals("G ONION")|| order.getToppingName4().equals("JALA Grilled")){
				System.out.println("-> | " + order.getToppingName4());
			}else{
				System.out.println(order.getToppingName4());
			}
		}
		if(burger.equals("LBB")) System.out.println("  {{{BACON}}}}");
		if(!fries.equals("1")){
			System.out.println("1: " + order2.getBurgerName());
		}
		System.out.println("Register:1    Tran Seq No: 57845");
		System.out.println("Cashier:Sakda* S.");
	}
}
