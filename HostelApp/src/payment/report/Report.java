package payment.report;

import payment.model.Payment;
import payment.type.CreditCardPayment;
import payment.type.DebtCardPayment;

public class Report {
 private Payment [] payments;
 private int i;
 
 public Report() {
	 payments = new Payment[2];
 }
 
 public void add(Payment payment) {
	 payments[i] = payment;
	 i++;
 }
 
 @Override
 public String toString() {
	 String temp = "";
	 for(Payment x:payments)
		 temp+=x.toString() + "\n";
	 return temp;
 }
 
 public static void main(String[] args) {
	Report report = new Report();
	
	Payment ccp = new Payment(670.00);
	ccp.setPaymentType(new CreditCardPayment("Philip K. Dick", "6374.1528.9054.1184", "VISA"));
	report.add(ccp);
	
	Payment dcp = new Payment(500.00);
	dcp.setPaymentType(new DebtCardPayment("Ursula K. Le Guin", "60392-041", "International Bank"));
	report.add(dcp);
	
	System.out.println("Payment report..:");
	System.out.println(report.toString());
 }
}
