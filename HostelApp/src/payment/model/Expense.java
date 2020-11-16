package payment.model;

import java.time.LocalDateTime;

public abstract class Expense {
	private double amount;
	
	public Expense(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public abstract LocalDateTime getTime();

	@Override
	public String toString() {
		return "Total amount....: " + amount + "\n";
	}
		
}
