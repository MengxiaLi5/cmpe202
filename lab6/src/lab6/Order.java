package lab6;

/**
 * @author mengxiali
 *
 */
public class Order {
	private String burgerName;
	private double burgerPrice;
	private String toppingName1;
	private String toppingName2;
	private String toppingName3;
	private String toppingName4;
	public Order(String burgerName) {
		this.burgerName = burgerName;
	}
	public String getBurgerName() {
		return burgerName;
	}
	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}
	public double getBurgerPrice() {
		return burgerPrice;
	}
	public void setBurgerPrice(double burgerPrice) {
		this.burgerPrice = burgerPrice;
	}
	public String getToppingName1() {
		return toppingName1;
	}
	public void setToppingName1(String toppingName1) {
		this.toppingName1 = toppingName1;
	}
	public String getToppingName2() {
		return toppingName2;
	}
	public void setToppingName2(String toppingName2) {
		this.toppingName2 = toppingName2;
	}
	public String getToppingName3() {
		return toppingName3;
	}
	public void setToppingName3(String toppingName3) {
		this.toppingName3 = toppingName3;
	}
	public String getToppingName4() {
		return toppingName4;
	}
	public void setToppingName4(String toppingName4) {
		this.toppingName4 = toppingName4;
	}

	
}
