package customer.address;

import customer.Costumer;

public class Address {
	private Costumer dweller;
	private String address;
	private String uf;
	private String zipCode;
	private String city;
	
	public Address(String address, String uf, String zipCode) {
		this.address = address;
		this.uf = uf;
		this.zipCode = zipCode;
	}
	public Costumer getDweller() {
		return dweller;
	}
	
	public void setDweller(Costumer dweller) {
		this.dweller = dweller;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAdress(String address) {
		this.address = address;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

}
