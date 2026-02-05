package sortwithsearch;

import java.time.LocalDate;
import java.util.Objects;

public class Student implements Comparable<Student>{
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	private int id;
	private String name;
	private String email;
	private String gender;
	private LocalDate localDate;
	
	public Student() {}
	
	public Student(int id, String name,String email, String gender, LocalDate localDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.localDate = localDate;
	}
	
	@Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", localDate=" + localDate +
                '}';
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, gender, localDate);
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;

        return id == student.id &&
               Objects.equals(name, student.name) &&
               Objects.equals(email, student.email) &&
               Objects.equals(gender, student.gender) &&
               Objects.equals(localDate, student.localDate);
    }
    
    @Override
    public int compareTo(Student o) {
    	return this.getId()-o.getId();
    }
	
	
	


}
