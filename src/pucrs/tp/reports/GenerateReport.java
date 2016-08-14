package pucrs.tp.reports;

import pucrs.tp.address.Address;
import pucrs.tp.address.InputBook;
import pucrs.tp.employee.Date;
import pucrs.tp.employee.Dependent;
import pucrs.tp.employee.Employee;

/**
 *
 * @author bernardo
 */
public class GenerateReport {

    public static void generateReport(Report report) {
        System.out.println(report.getHeader());
        report.reset();
        String line = report.nextLine();
        while (line != null) {
            System.out.println(line);
            line = report.nextLine();
        }
        System.out.println(report.getFooter());
    }

    public static void main(String[] args) {
        Student student = new Student(123, "Lucas");
        Student student1 = new Student(456, "Isadora");
        ClassRoom classRoom = new ClassRoom();
        student.inputGrade(0, 9);
        student.inputGrade(1, 9);
        student.inputGrade(2, 10);
        student.calculateAverage();
        student1.inputGrade(0, 10);
        student1.inputGrade(1, 9);
        student1.inputGrade(2, 10);
        student1.calculateAverage();
        classRoom.addStudent(student);
        classRoom.addStudent(student1);
        GenerateReport.generateReport(classRoom);
        System.out.println(classRoom.calculateAverage());

    }

}
