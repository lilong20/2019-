package com.example.demo.model;

public class SysUser {
	int uid;
    String username;
    String password;
    String name;
    int age;
    String sex;
    String headimg;
    
@Override
	public String toString() {
		return "SysUser [uid=" + uid + ", username=" + username + ", password=" + password + ", name=" + name + ", age="
				+ age + ", sex=" + sex + ", avater=" + headimg + "]";
	}
public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
public String getUserneme() {
	return username;
}
public void setUserneme(String userneme) {
	this.username = userneme;
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
	return  headimg;
}
public void setAvater(String avater) {
	this. headimg = headimg;
}
}
