package com.example.demo.model;

public class SelectSpot {
	int vid;
	String city ;  
	String viewname;
	String route ;  
	String  img ;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getViewname() {
		return viewname;
	}
	public void setViewname(String viewname) {
		this.viewname = viewname;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "SelectSpot [vid=" + vid + ", city=" + city + ", viewname=" + viewname + ", route=" + route + ", img="
				+ img + "]";
	}
	
}
