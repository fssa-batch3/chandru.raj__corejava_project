package day05.practice;

public class Department {
	String deptName;
    int deptId;
    
    // Constructor for Department class
    public Department(String deptName, int deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
    }
}

class Student {
    String name;
    int id;
    Department department;
    
    // Constructor for Student class
    public Student(String name, int id, Department department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
}
