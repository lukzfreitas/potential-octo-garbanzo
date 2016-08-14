package pucrs.tp.reports;

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

}
