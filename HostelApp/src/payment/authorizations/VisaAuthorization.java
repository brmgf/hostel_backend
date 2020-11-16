package payment.authorizations;

import payment.type.CardPayment;

public class VisaAuthorization implements Authorization {

	@Override
	public boolean authorize(CardPayment cardPayment, double amount) {
		// TODO Auto-generated method stub
		return true;
	}

}
