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
	@NotEmpty
	@Size(min=3, max=12)
	private String uname;
	@NotEmpty
	@Size(min=6, max=10)
	private String upwd;
	@NotEmpty
	@Email
	private String uemail;
	@NotEmpty
	@Pattern(regexp = "91-[0-9]{10}")
	private String umobile;
	@NotNull
	@Range(min=18, max=25)
	private int uage;
	@NotNull
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Past
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
