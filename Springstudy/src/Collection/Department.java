package Collection;

import java.util.List;

public class Department {

	private String name;
	private String[] empname;
	private List<Employee> emplist;
	
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getEmpname() {
		return empname;
	}
	public void setEmpname(String[] empname) {
		this.empname = empname;
	}
	
}
