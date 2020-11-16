package payment;

import payment.authorizations.Authorization;
import payment.authorizations.MasterCardAuthorization;
import payment.authorizations.VisaAuthorization;
import payment.model.Payment;
import payment.model.PaymentType;
import payment.type.CashPayment;
import payment.type.CheckPayment;
import payment.type.CreditCardPayment;
import payment.type.DebtCardPayment;

public class Test {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		//Pagamento em dinheiro
		Payment payment1 = new Payment(56.00);
		PaymentType cashp = new CashPayment(60.00);
		payment1.setPaymentType(cashp);
		t.processPayment(payment1);
		
		//Pagamento em cheque
		Payment payment2 = new Payment(670.00);
		PaymentType checkp = new CheckPayment("47", "VISA", "INTERNATIONAL BANK");
		payment2.setPaymentType(checkp);
		t.processPayment(payment2);
		
		//Pagamento em cartão de crédito
		Payment payment3 = new Payment(500.00);
		PaymentType ccp = new CreditCardPayment("Philip K. Dick", "6374.1528.9054.1184", "VISA");
		payment3.setPaymentType(ccp);
		t.processPayment(payment3);
		Authorization acc = new VisaAuthorization();
		payment3.setAuthorization(acc);
		payment3.authorize();
		
		//Pagamento cartão de débito
		Payment payment4 = new Payment(300.00);
		PaymentType dcp = new DebtCardPayment("Ursula K. Le Guin", "60392-041", "International Bank");
		payment4.setPaymentType(dcp);
		t.processPayment(payment4);
		Authorization adc = new MasterCardAuthorization();
		payment4.setAuthorization(adc);
		payment4.authorize();		
	}
	
	public void processPayment(Payment p) {
		p.proccess();
		System.out.println(p.toString());
	}
	
}
