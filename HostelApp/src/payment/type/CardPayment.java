package payment.type;

import payment.model.PaymentType;

public abstract class CardPayment extends PaymentType{
	private String nameCard;
	private String number;
	
	public CardPayment(String nameCard, String number) {
		super("Card payment");
		this.nameCard = nameCard;
		this.number = number;
	}
		
	public String getNameCard() {
		return nameCard;
	}
	
	public void setNameCard(String nameCard) {
		this.nameCard = nameCard;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		String temp = "\nPayment Authorized: " + authorized + "\n" +
					  super.toString() +
			    	  "\nName on card....: " + getNameCard() +
			    	  "\nNumber on card..: " + getNumber() ;
		return temp;
	}
}
