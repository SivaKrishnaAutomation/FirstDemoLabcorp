package com.test.training;

public class EncapsulationEx {

	public static void main(String[] args) {
		
		Bean b = new Bean();
		b.setEmpID(111);
		b.setEmpName("ABC");
		b.setSalary(120.12);
		
		int empID = b.getEmpID();
		String empName = b.getEmpName();
		double sal = b.getSalary();
		
		System.out.println(empID+"...."+empName+"...."+sal);
	}

}

class Bean{
	
	private int empID;
	private String empName;
	private double salary;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
