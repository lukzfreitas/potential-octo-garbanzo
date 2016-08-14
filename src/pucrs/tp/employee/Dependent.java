package pucrs.tp.employee;

public class Dependent {
	private String name;
	private Date dateBirth;

	public Dependent(String name, Date dateBirth) throws IllegalArgumentException {
		if (name == null)
			throw new IllegalArgumentException("Name undefined");
		if (dateBirth == null)
			throw new IllegalArgumentException("Date undefined");
		this.name = name;
		this.dateBirth = dateBirth;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateBirth() {
		return (dateBirth);
	}

	public int age(int currentYear) {
		return (currentYear = dateBirth.getYear());
	}

	public String toString() {
		return (this.name + ", " + this.dateBirth.toString());
	}
}