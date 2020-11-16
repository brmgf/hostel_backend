package customer;

import customer.address.Address;

public class CreateCostumer {

	public static void main(String[] args) {
		
		Costumer philip = new Costumer("Philip", "K. Dick");
		philip.setTitle(Title.Mr);
		System.out.println("Cliente: " + philip.getTitle() + " " + philip.getName() + " " + philip.getLastName());
		philip.setEmail("pkd@email.com");
		System.out.println("Contato: " + philip.getEmail());
		philip.setDayOfBirthday("16/12/1928");
		
		Address addressPhilip = new Address("Eletric Sheep, 123", "SP", "32456-976");
		addressPhilip.setDweller(philip);
		addressPhilip.setCity("Ubik");
		System.out.println("");
		System.out.println("::::::: Endereço :::::::");
		System.out.println("Rua: " + addressPhilip.getAddress());
        System.out.println("UF: " + addressPhilip.getUf());
        System.out.println("");
        
        Costumer ursula = new Costumer("Ursula", "Le Guin");
        ursula.setTitle(Title.Miss);
        System.out.println("Cliente: " + ursula.getTitle() + " " + ursula.getName() + " " + ursula.getLastName());
        ursula.setEmail("k.leguin@email.com");
        System.out.println("Contato: " + ursula.getEmail());
        ursula.setDayOfBirthday("21/10/1929");
        
        Address addressUrsula = new Address("Omelas 69", "RJ", "32524-008");
        addressUrsula.setDweller(ursula);
		addressUrsula.setCity("Earthsea");
		System.out.println("");
		System.out.println("::::::: Endereço :::::::");
		System.out.println("Rua: " + addressUrsula.getAddress());
        System.out.println("UF: " + addressUrsula.getUf());
        System.out.println("");
	}
	
	
}
