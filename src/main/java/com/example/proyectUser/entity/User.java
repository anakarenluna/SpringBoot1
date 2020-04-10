package com.example.proyectUser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="user_sequense")
	@SequenceGenerator(name="user_sequense", sequenceName="USER_SEQ")
	private Integer id;
	
	@Transient int transient1;
	
	@Column(name="username")
	private String  username;
	
	@Column(name="firstName")
	private  String firstName;
	
	@Column(name="lastName")
	private String  lastName;
	
	@Column(name="email")
	private String  email;
	
	@Column(name="password")
	private String  password;
	
	@Column(name="phone")
	private String  phone;
	
	@Column(name="userStatus")
	private int userStatus;
	
	/*public User()
	{
		
	}
	
	public User(int id, String  username, String firstName, String  lastName, String  email, String  password,
			 String  phone,
			 int userStatus)
	{
		this.id=id;
		this.username=username;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
		this.phone=phone;
		this.userStatus=userStatus;
		
	}*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getTransient1() {
		return transient1;
	}

	public void setTransient1(int transient1) {
		this.transient1 = transient1;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	
	
	

}
