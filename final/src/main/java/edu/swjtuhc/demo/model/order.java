package edu.swjtuhc.demo.model;

public class order {
int goodsprice;
String goodsname;
int goodsnumber;
String username;
public int getGoodsprice() {
	return goodsprice;
}
public void setGoodsprice(int goodsprice) {
	this.goodsprice = goodsprice;
}
public String getGoodsname() {
	return goodsname;
}
public void setGoodsname(String goodsname) {
	this.goodsname = goodsname;
}

public int getGoodsnumber() {
	return goodsnumber;
}
public void setGoodsnumber(int goodsnumber) {
	this.goodsnumber = goodsnumber;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "order [goodsprice=" + goodsprice + ", goodsname=" + goodsname + ", goodsnumber=" + goodsnumber
			+ ", username=" + username + "]";
}

}
