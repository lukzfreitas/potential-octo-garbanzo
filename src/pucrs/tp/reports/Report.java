package pucrs.tp.reports;

/**
 *
 * @author bernardo
 */
public interface Report {
	String getHeader();

	void reset();

	String nextLine();

	String getFooter();
}
