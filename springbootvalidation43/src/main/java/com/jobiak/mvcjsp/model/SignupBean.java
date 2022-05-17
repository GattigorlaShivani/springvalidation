package com.jobiak.mvcjsp.model;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class SignupBean implements Serializable
{
@NotEmpty(message="cant leave the field empty")
@Size(min=10,max=10,message="have to enter 10 digits")
@Valid
private String mobile;
@NotBlank(message="cant leave the field blank")
@Valid
@Email

private String email;
@NotEmpty(message="cant leave the field empty")
@Size(min=12,max=12,message="have to enter all 12 digits")
@Valid
private String aadhar;

public String getMobile() 
{
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAadhar() {
	return aadhar;
}

public void setAadhar(String aadhar) {
	this.aadhar = aadhar;
}

public static void main(String[] args)
{
	// TODO Auto-generated method stub
}

}
