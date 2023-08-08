package com.sikku.command;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class User {
	@NotEmpty(message = "User name is required")
	private String uname;
	@NotEmpty(message="User password is required")
	@Size(min=6, max=10,message="user password must be min 6 and maximum 10 character")
	private String upwd;
	@NotEmpty(message="User email is required")
	@Email
	private String uemail;
	@NotEmpty(message="User mobile is required")
	@Pattern(regexp = "91-[0-9]{10}", message = "Formate 91-DDDDDDDDDD")
	private String umobile;
	@NotNull(message="User age is required")
	@Range(min=18, max=25,message="age must be in range 18-25")
	private int uage;
	@NotNull(message="User DOB is required")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Past(message = "User DOB must be past date")
	private Date udob;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUmobile() {
		return umobile;
	}

	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public Date getUdob() {
		return udob;
	}

	public void setUdob(Date udob) {
		this.udob = udob;
	}

}
