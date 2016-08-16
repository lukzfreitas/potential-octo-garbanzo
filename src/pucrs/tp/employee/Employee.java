package pucrs.tp.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person{
	private int id;
	public double salaryBase;
	private List<Dependent> dependentList;

	public Employee(int id, String name, double salaryBase) {
		super(name);
		this.id = id;
		this.salaryBase = salaryBase;
		this.dependentList = new ArrayList<Dependent>();
	}

	public int getId() {
		return (this.id);
	}

	public double getSalaryBase() {
		return (this.salaryBase);
	}

	public void addDependent(Dependent dependent) {
		dependentList.add(dependent);
	}

	public double getSalary(int currentYear) {
		double additional = 1.0;
		for (Dependent d : dependentList) {
			if (dependentIsOfAge(d, currentYear))
				additional += 0.1;
		}
		return (salaryBase * additional);
	}

	public List<Dependent> getDependentList() {
		return (this.dependentList);
	}

	public boolean verifyDependentsNameEquals(Dependent dep) {
		for (Dependent d : this.dependentList) {
			if (d.getName().equals(dep.getName())) {
				dep.setName(null);
				return (false);
			}
		}
		return (true);
	}

	public boolean dependentIsOfAge(Dependent d, int currentYear) {
		if (d.getAge() >= 18)
			return (true);
		else
			return (false);
	}
}
