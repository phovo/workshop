import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	static List<Employee> employees = Arrays.asList(new Employee(1, "Laura", Role.PM, new Address("Pfalzgasse 1, Zurich", "Switzerland")),
													new Employee(2, "Julien", Role.DEV, new Address("Switzerland")),
													new Employee(3, "David", Role.QA, null),
													new Employee(4, "Simon", null, new Address("2 Rue Germain Pilon, Paris", "France")));
	
	static List<Salary> salaries = Arrays.asList(new Salary(Role.PM, Double.valueOf(6000)),
												 new Salary(Role.DEV, Double.valueOf(5000)),
												 new Salary(Role.QA, Double.valueOf(3000)));

	public static void main(String[] args) {
		Helper.showHeader();
		for (Employee employee : employees) {
			Helper.showContent(employee.getName(), employee.getAddress() != null ? employee.getAddress().getLocation() : null, employee.getAddress() != null ? employee.getAddress().getCountry() : null, null) ;
		}
	}
}

enum Role {
	PM,
	DEV,
	QA
}

class Helper {
	public static void showHeader() {
		System.out.println("\n" +
				  String.format("%10s", "Name") +
				  String.format("%25s", "Address") + 
				  String.format("%30s", "Country") + 
				  String.format("%15s", "Salary") + "\n" +
				  String.join("", Collections.nCopies(80, "-")));
	}
	
	public static void showContent(String name, String location, String country, String salary) {
		System.out.println(String.format("%10s", name) + String.format("%5s", "|") + 
		  String.format("%30s", location) + String.format("%5s", "|") + 
		  String.format("%15s", country) + String.format("%5s", "|") + 
		  String.format("%10s", salary));
	}
}

class Employee {
	
	private long id;
	
	private String name;
	
	private Role role;
	
	private Address address;
	
	public Employee() {
		super();
	}

	public Employee(long id, String name, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public Employee(long id, String name, Role role, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}

class Address {
	
	private String location;
	
	private String country;
	
	public Address() {
		super();
	}

	public Address(String country) {
		super();
		this.country = country;
	}

	public Address(String location, String country) {
		super();
		this.location = location;
		this.country = country;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return "[" + location + " " + country +"]";
	}
}

class Salary {
	
	private Role role;
	
	private Double value;
	
	public Salary() {
		super();
	}

	public Salary(Role role, Double value) {
		super();
		this.role = role;
		this.value = value;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}