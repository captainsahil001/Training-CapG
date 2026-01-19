package oops.array.arrayId;

public class Employee {
	private int id;
    private String name;
    private double salary;
    private String department;
    private int experience;

    public Employee(int id, String name, double salary, String department, int experience) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getExperience() {
        return experience;
    }

    
    public void fetchDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Experience: " + experience);
    }

}
