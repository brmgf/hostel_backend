package payment.model;

public abstract class PaymentType {
	private String type;
	protected boolean authorized;
	
	public PaymentType(String type) {
		super();
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public boolean isAuthorized() {
		return authorized;
	}

	public void setAuthorized(boolean authorized) {
		this.authorized = authorized;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		String temp = "Payment option..: " + type;
		return temp;
	}
}
