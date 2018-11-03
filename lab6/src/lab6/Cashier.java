package lab6;
import java.util.* ;

public class Cashier {
	
	ArrayList<Print> print;
	Print receipt;
	Print patties;
	double money;
	
	public Cashier(){
		print = new ArrayList<>();
		receipt = new Receipt();
		patties = new Patties();
		
		print.add(receipt);
		print.add(patties);
			
	}

	public void order(int i, CustomBurger burger) {
		for(Print prints: print){
			prints.add(i,burger);
		}
		
	}

	public void order(int i, String type, String price) {
		for(Print prints: print){
			prints.add(i,type,price);
		}
		
	}

	public void printPrinting(String time, String number) {
		for(Print prints: print){
			prints.printing(time,number);
		}
		
	}
	
	public void setamount(double d){
		this.money = d;
		receipt.Cash(money);
	}
	

}
