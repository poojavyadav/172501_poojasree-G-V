package com.movie.pojo;

public class UserPojo {
private String emailId;
private String password;
private String confirmPassword;
public UserPojo(String emailId, String password, String confirmPassword) {
	super();
	this.emailId = emailId;
	this.password = password;
	this.confirmPassword = confirmPassword;
}
public UserPojo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "UserPojo [emailId=" + emailId + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}

}
