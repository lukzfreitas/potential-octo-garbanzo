package pucrs.tp.employee;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Dependent extends Person{
	private Date dateBirth;
	private int age;

	public Dependent(String name, Date dateBirth) throws IllegalArgumentException {
		super(name);
		if (dateBirth == null)
			throw new IllegalArgumentException("Date undefined");

		this.dateBirth = dateBirth;
	}

	public Date getDateBirth() {
		return (dateBirth);
	}

	public void calculateAge() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		this.age = year - dateBirth.getYear();
	}

	public int getAge() {
		return this.age;
	}

	public String toString() {
		return (this.getName() + ", " + this.dateBirth.toString());
	}
}