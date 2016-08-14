package pucrs.tp.employee;

public class Date {
	private int day, month, year;

	// A consistencia foi simplificada propositalmente
	public Date(int d, int m, int y) throws IllegalArgumentException {
		if ((d < 1) || d > 31)
			throw new IllegalArgumentException("day invalid");
		if ((m < 1) || (m > 12))
			throw new IllegalArgumentException("month invalid");
		if (y < 1900)
			throw new IllegalArgumentException("year invalid");
		switch (m) {
		case 2:
			if (d > 29)
				throw new IllegalArgumentException("day invalid");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (d > 30)
				throw new IllegalArgumentException("day invalid");
			break;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return (this.day + "//" + this.month + "//" + this.year);
	}
}