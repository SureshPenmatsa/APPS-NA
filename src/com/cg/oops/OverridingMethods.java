package com.cg.oops;

class Employee{
	public int calculateSalary(int salary, int incentivesOrOverTime) {
		return salary;
	}
}
class Labour extends Employee{
	@Override
	public int calculateSalary(int salary,int incentivesOrOverTime) {
		
		return salary+incentivesOrOverTime*200;
	}
}
class Manager extends Employee{
	@Override
	public int calculateSalary(int salary,int incentivesOrOverTime) {
		return salary+incentivesOrOverTime;
	}
}
public class OverridingMethods {
	public static void main(String[] args) {
		Employee e1=new Labour();
		System.out.println(e1.calculateSalary(500, 3));
		
		Employee e2=new Manager();
		System.out.println(e2.calculateSalary(2000, 1000));
		
	}	

}
