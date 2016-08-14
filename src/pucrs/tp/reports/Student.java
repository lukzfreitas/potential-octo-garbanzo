package pucrs.tp.reports;

/**
 *
 * @author bernardo
 */
public class Student {

	private static final int QTDOFGRADE = 3;
	private int id;
	private String name;
	private int[] gradeList;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		gradeList = new int[QTDOFGRADE];
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int[] getGradeList() {
		return gradeList;
	}

	public boolean infoGrade(int number, int grade) {
		if (grade < 0 || grade > 10) {
			return false;
		} else {
			if (number < 0 || number >= QTDOFGRADE) {
				return false;
			}
		}
		gradeList[number] = grade;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(id).append(" : ").append(name).append(", grades: ");
		for (int i = 0; i < QTDOFGRADE; i++) {
			str.append("N").append(i + 1).append(": ").append(gradeList[i]);
			if (i < QTDOFGRADE - 1) {
				str.append(", ");
			}
		}
		return str.toString();
	}
}
