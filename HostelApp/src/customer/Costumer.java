package customer;

public class Costumer {
	Title Title;
	private String name;
	private String lastName;
	private String email;
	private String dayOfBirthday;
	
	/* MEU CONSTRUTOR */
	public Costumer(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		 return email;
	 }
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDayOfBirthday() {
		return dayOfBirthday;
	}
	
	public void setDayOfBirthday(String dayOfBirthday) {
		this.dayOfBirthday = dayOfBirthday;
	}
	
	public Title getTitle() {
		return Title;
	}

	public void setTitle(Title Title) {
		this.Title = Title;
	}
     	
}
