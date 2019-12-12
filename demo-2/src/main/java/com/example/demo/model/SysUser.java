package com.example.demo.model;

public class SysUser {
	int Uid;
   public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
String userneme;
   String password;
   String name;
   int age;
   
   String sex;
   String avater;
public String getUserneme() {
	return userneme;
}
public void setUserneme(String userneme) {
	this.userneme = userneme;
}
@Override
public String toString() {
	return "SysUser [Uid=" + Uid + ", userneme=" + userneme + ", password=" + password + ", name=" + name + ", age="
			+ age + ", sex=" + sex + ", avater=" + avater + "]";
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return sex;
}
public void setGender(String gender) {
	this.sex = gender;
}
public String getAvater() {
	return avater;
}
public void setAvater(String avater) {
	this.avater = avater;
}
}
