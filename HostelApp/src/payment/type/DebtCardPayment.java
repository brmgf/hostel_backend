package payment.type;

public class DebtCardPayment extends CardPayment{
	private String bankName;
	
	public DebtCardPayment(String nameCard, String number, String bankName) {
		super(nameCard, number);
		this.bankName = bankName;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String toString() {
		String temp = super.toString() +
					  "\nBank name.......: " + getBankName() + "\n";
		return temp;
	}
}
