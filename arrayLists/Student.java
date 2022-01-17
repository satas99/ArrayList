package arrayLists;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private long identityNumber;
	public Student() {
		super();
	}
	public Student(int id, String firstName, String lastName, long identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public long getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(long identityNumber) {
		this.identityNumber = identityNumber;
	}
	
}
