package org.student;

public class Student extends org.department.Department {

	private void studentName() {
		
		System.out.println("This is studentName method from Student class of org.student package");

	}
	private void studentDept() {
		System.out.println("This is studentDept method from Student class of org.student package");

	}
	
	private void studentId() {
		System.out.println("This is studentId method from Student class of org.student package");

	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		

	}

}
