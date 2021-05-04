package ödevDörtİki;

public class Customer implements Entity{
	
	private String Id;
	private String firstName;
	private String lastName;
	private String birthday;
	private String nationalityId;
	
	
	public Customer() {
		
	}
	
	public Customer(String id, String firstName, String lastName, String birthday, String nationalityId) {

		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.nationalityId = nationalityId;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
}
