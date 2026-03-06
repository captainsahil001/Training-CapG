package com;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  //The entity has no primary key attribute defined
@Table(name="User_Information")
public class UserInformation { //Class "com.UserInformation" is managed, but is not listed in the persistence.xml file
	
	@Id          //Specifies the primary key of an entity. 
	@Column(name="user_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="user_Name",nullable=false)
	private String name;
	@Column(name="user_Email",nullable=false,unique=true)
	private String email;
	@Column(name="Mobile_Number",nullable=false,unique=true,length=10)
	private long mobile_number;
	@Column(name="Gender",nullable=false)
	private String gender;
	public UserInformation() {
		super();
	}
	public UserInformation(int id, String name, String email, long mobile_number, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile_number = mobile_number;
		this.gender = gender;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", name=" + name + ", email=" + email + ", mobile_number=" + mobile_number
				+ ", gender=" + gender + "]";
	}
	
	
}