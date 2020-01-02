package com.example.demo.model;

import java.util.Date;

public class dairy {
	private String dairy;
	private String photo;
	private Date date;
	public String getDairy() {
		return dairy;
	}
	public void setDairy(String dairy) {
		this.dairy = dairy;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "dairy [dairy=" + dairy + ", photo=" + photo + ", date=" + date + "]";
	}
	
}
