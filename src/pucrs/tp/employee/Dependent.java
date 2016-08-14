package pucrs.tp.employee;

public class Dependent extends Person{
	private Date dateBirth;

	public Dependent(String name, Date dateBirth) throws IllegalArgumentException {
		super(name);
		if (dateBirth == null)
			throw new IllegalArgumentException("Date undefined");

		this.dateBirth = dateBirth;
	}

	public Date getDateBirth() {
		return (dateBirth);
	}

	public int age(int currentYear) {
		return (currentYear = dateBirth.getYear());
	}

	public String toString() {
		return (this.getName() + ", " + this.dateBirth.toString());
	}
}