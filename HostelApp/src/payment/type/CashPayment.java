package payment.type;

import payment.model.PaymentType;

public class CashPayment extends PaymentType {
	private double amountTendered;
		
	public CashPayment(double amountTendered) {
		super("Cash payment");
		this.amountTendered = amountTendered;
	}
	
	public double getAmountTendered() {
		return amountTendered;
	}
	
	public void setAmountTendered(double amountTendered) {
		this.amountTendered = amountTendered;
	}
		
	@Override
	public String toString() {
		String temp = super.toString() +
			    	"\nAmount tendered.: " + getAmountTendered() + "\n";
		return temp;
	}
}
