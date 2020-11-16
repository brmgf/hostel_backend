package payment.type;

import payment.model.PaymentType;

public class CheckPayment extends PaymentType {
	private String bankId;
	private String branchId;
	private String bankName;
	
	public CheckPayment(String bankId, String branchId, String bankName) {
		super("Check payment");
		this.bankId = bankId;
		this.branchId = branchId;
		this.bankName = bankName;
	}
	
	public String getBankId() {
		return bankId;
	}
	
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	
	public String getBranchId() {
		return branchId;
	}
	
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	@Override
	public String toString() {
		String temp = super.toString() +
			    	"\nBank Id.........: " + getBankId() +
			    	"\nBranch Id.......: " + getBranchId() + "\n" ;
		return temp;
	}
	
	
}
