package pucrs.tp.reports;

import java.util.ArrayList;

/**
 *
 * @author bernardo
 */
public class Class implements Report {
	private ArrayList<Student> studentsList;
	private int cursor;

	public Class() {
		studentsList = new ArrayList<>();
		cursor = 0;
	}

	public void addStudent(Student student) {
		studentsList.add(student);
	}

	public Student getStudent(int id) {
		for (Student student : studentsList) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	public boolean updateStudent(Student changed) {
		for (int i = 0; i < studentsList.size(); i++) {
			if (studentsList.get(i).getId() == changed.getId()) {
				studentsList.set(i, changed);
				return true;
			}
		}
		return false;
	}

	public double calculateAverage(int id) {
		Student student = getStudent(id);
		if (student != null) {
			int[] grades = student.getGradeList();
			double sum = 0.0;
			for (int i = 0; i < grades.length; i++) {
				sum += grades[i];
			}
			return sum / grades.length;
		}
		return -1.0;
	}

	@Override
	public String getHeader() {
		return null;
	}

	@Override
	public void reset() {
		cursor = 0;
	}

	@Override
	public String nextLine() {
		if (cursor < studentsList.size()) {
			String line = studentsList.get(cursor).toString();
			cursor++;
			return line;
		} else {
			return null;
		}
	}

	@Override
	public String getFooter() {
		return null;
	}
}
