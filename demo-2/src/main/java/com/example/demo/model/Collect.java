package com.example.demo.model;

public class Collect {
int cid;
String goodsname;
String goodsprice;

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getGoodsname() {
	return goodsname;
}
public void setGoodsname(String goodsname) {
	this.goodsname = goodsname;
}
public String getGoodsprice() {
	return goodsprice;
}
public void setGoodsprice(String goodsprice) {
	this.goodsprice = goodsprice;
}
@Override
public String toString() {
	return "Collect [cid=" + cid + ", goodsname=" + goodsname + ", goodsprice=" + goodsprice + "]";
}

}
