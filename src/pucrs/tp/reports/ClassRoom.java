package pucrs.tp.reports;

import java.util.ArrayList;

/**
 *
 * @author bernardo
 */
public class ClassRoom implements Report {
	private ArrayList<Student> studentsList;
	private int cursor;

	public ClassRoom() {
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

	/**
	 * Calcula a média geral dos alunos cadastrados em uma turma
	 * @return
     */
	public double calculateAverage() {
		double sum = 0;
		for (int i = 0; i < studentsList.size(); i++) {
			sum += studentsList.get(i).getAverage();
		}
		return sum / studentsList.size();
	}

	@Override
	public String getHeader() {
		return "Id : Name          : Grades";
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
		return "Total students in the class room: " + studentsList.size();
	}
}
