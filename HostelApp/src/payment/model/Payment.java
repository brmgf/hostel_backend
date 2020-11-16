package payment.model;

import java.time.LocalDateTime;

import payment.authorizations.Authorization;
import payment.type.CardPayment;

public class Payment extends Expense implements Processable {
	private PaymentType paymentType;
	private LocalDateTime localDateTime;
	private Authorization authorization;
	
	public Payment(double amount) {
		super(amount);
	}
	
	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	
	@Override
	public LocalDateTime getTime() {
		return localDateTime;
	}
	
	public Authorization getAuthorization() {
		return authorization;
	}

	public void setAuthorization(Authorization authorization) {
		this.authorization = authorization;
	}
	
	@Override
	public String toString() {
		this.localDateTime = LocalDateTime.now();
		int day = localDateTime.getDayOfMonth();
		int month = localDateTime.getMonthValue();
		int year = localDateTime.getYear();
		int hour = localDateTime.getHour();
		int minute = localDateTime.getMinute();
		
		System.out.println("Processing the payment..");
		System.out.println("Date:" + day + "/" + month + "/" + year +
						   " at:" + hour + ":" + minute);
		String temp =  super.toString() + paymentType;
		return temp;
	}

	@Override
	public void proccess() {
		
	}
	
	public boolean authorize() {
		boolean temp = false;
		if(paymentType instanceof CardPayment) {
			CardPayment cp = (CardPayment) paymentType;
			temp = authorization.authorize(cp, this.getAmount());
			if(temp == true)
				paymentType.setAuthorized(true);
		}
		return temp;
	}
	
}
