package task2;

public class Student {

	String name;
	String registrationNumber;
	String mobileNumber;
	String sequenceNumber;
	String collegeNameDepartmentYear;

	public Student(String name, String mobileNumber, String sequenceNumber, String collegeNameDepartmentYear) {
		
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.sequenceNumber = sequenceNumber;
		this.collegeNameDepartmentYear = collegeNameDepartmentYear;
		registrationNumber = collegeNameDepartmentYear + "-" + sequenceNumber;
		
	}

}