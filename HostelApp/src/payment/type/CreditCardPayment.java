package payment.type;

import java.time.LocalDate;

public class CreditCardPayment extends CardPayment {
	private String issuer;
	private LocalDate experationDate;
	private String securityCode;

	public CreditCardPayment(String nameCard, String number, String issuer) {
		super(nameCard, number);
		this.issuer = issuer;
	}
	
	public String getIssuer() {
		return issuer;
	}
	
	public void setIssues(String issuer) {
		this.issuer = issuer;
	}
	
	public LocalDate getExperationDate() {
		return experationDate;
	}

	public void setExperationDate(LocalDate experationDate) {
		this.experationDate = experationDate;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	
	public boolean equals(Object object) {
		CreditCardPayment ccp = null;
		if(object instanceof CreditCardPayment) {
			ccp = (CreditCardPayment) object;
			if(ccp.getNumber().equals(this.getNumber())) {
				return true;
			}
		} else {
			return false;
		}
		return false;
	}
	
	public String toString() {
		String temp = super.toString() +
			    	  "\nIssuer..........: " + getIssuer() + "\n";
		return temp;
	}
}
