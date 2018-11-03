package lab6;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args){
		Cashier cashier = new Cashier();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(date);
		String number = "45";
		CustomBurger burger = new CustomBurger("LBB", "5.59");
		burger.addTopping("top", "LETTUCE");
		burger.addTopping("top", "TOMATO");
		burger.addTopping("mid", "G ONION");
		burger.addTopping("mid", "JALA Grilled");
		burger.addTopping("bottom", "{{{{ BACON }}}}");
		cashier.order(1, burger);
		cashier.order(1, "LTL CAJ", "2.79");
		cashier.setamount(20.00);
		cashier.printPrinting(time, number);

	}
}
