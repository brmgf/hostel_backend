package payment.authorizations;

import payment.type.CardPayment;

public interface Authorization {
	public abstract boolean authorize(CardPayment cardPayment, double amount);
}
