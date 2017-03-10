using System.IO;
using System;
using System.Collections.Generic;
using static Employee;
using static Address;
using static Role;

class Program
{
    static List<Employee> employees = new List<Employee>()
    {
     new Employee(1, "Laura", Role.PM, new Address("Pfalzgasse 1, Zurich","Switzerland")),
     new Employee(2, "Julien",Role.DEV, new Address("Switzerland")),
     new Employee(3, "David", Role.QA, null),
     new Employee(4, "Simon", new Address("2 Rue Germain Pilon, Paris","France"))};
													
    static void Main()
    {
        string salary = null;
        Console.WriteLine("{0}\t{1} {2} {3}", "Name".PadLeft(10), "Address".PadLeft(30), "Country".PadLeft(15), "Salary".PadLeft(20));
        Console.WriteLine(new String('-', 85));
        foreach (Employee employee in employees) {
            Console.WriteLine("{0}\t{1}", employee.ToString(), "|" + ("" + salary).PadLeft(10));
        }
    }
}

public class Employee {
    public long id { get; set; }
	
	public string name { get; set; }
	
	public Role role { get; set; }
	
	public Address address { get; set; }
	
	public Employee() {
	}

	public Employee(long id, string name, Role role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public Employee(long id, string name, Role role, Address address) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.address = address;
	}
	
	public Employee(long id, string name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public override string ToString(){
        return String.Format("{0}   |   {1}", name.PadLeft(10), address);
    }
}

public class Address {
	
	public string location { get; set; }
	
	public string country { get; set; }
	
	public Address(string country) {
		this.country = country;
	}

	public Address(string location, string country) {
		this.location = location;
		this.country = country;
	}
	
	public override string ToString(){
        return String.Format("{0}   |   {1}", ("" + location).ToString().PadLeft(30), ("" + country).ToString().PadLeft(10));
    }
}

public enum Role {
	PM,
	DEV,
	QA
}
