package map_and_set;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String gender;
	private LocalDate dateOfBirth;
	private int experience;
	private String mail;
	private long phoneNumber;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String gender, LocalDate dateOfBirth, int experience, String mail,
			long phoneNumber) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.experience = experience;
		this.mail = mail;
		this.phoneNumber = phoneNumber;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		System.out.println("Hashcode Invoked");
		return Objects.hash(dateOfBirth, experience, gender, id, mail, name, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		System.out.println("equals methods invoked");
		Employee other = (Employee) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && experience == other.experience
				&& Objects.equals(gender, other.gender) && id == other.id && Objects.equals(mail, other.mail)
				&& Objects.equals(name, other.name) && phoneNumber == other.phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", experience=" + experience + ", mail=" + mail + ", phoneNumber=" + phoneNumber + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
		System.out.println("compareTo() invoked");
		return this.getId()- o.getId();	
		}
	
}
