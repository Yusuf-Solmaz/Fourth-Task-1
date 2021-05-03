
public class Customer implements IEntity {

	public Customer(String id, String firstName, String lastName, int dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		
	}
	public String id;
	public String firstName;
	public String lastName;
	
	public int dateOfBirth;
	public String NationalityId;
}
