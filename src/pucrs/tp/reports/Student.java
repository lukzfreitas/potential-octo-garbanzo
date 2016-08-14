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
	private double avarage;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		this.gradeList = new int[QTDOFGRADE];
		this.avarage = 0;
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

	public boolean inputGrade(int number, int grade) {
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

	/**
	 * Seguindo o critério de completude, foi criado o método calculateAverage nesta classe,
	 * pois a média pertence ao objeto Student
     */
	public void calculateAverage() {
		int grade = 0;
		for (int i = 0; i < QTDOFGRADE; i++) {
			grade += gradeList[i];
		}
		this.avarage =  grade / gradeList.length;
	}

	/**
	 * Retorna a média do aluno calculada pelo método @calculateAverage
	 * @return Double
     */
	public double getAverage() {
		return this.avarage;
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
