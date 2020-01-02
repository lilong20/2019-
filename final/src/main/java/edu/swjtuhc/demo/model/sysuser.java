package edu.swjtuhc.demo.model;

public class sysuser {
String name;
String username;
int password;
int age;
String gender;
int UID;

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getUID() {
	return UID;
}
public void setUID(int uID) {
	UID = uID;
}
@Override
public String toString() {
	return "sysuser [name=" + name + ", username=" + username + ", password=" + password + ", age=" + age + ", sex="
			+ gender + ", UID=" + UID + "]";
}


}
