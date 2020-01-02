package com.example.demo.model;

public class goods {
	String goodsname; 
	String goodsprice;
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
		return "goods [goodsname=" + goodsname + ", goodsprice=" + goodsprice + "]";
	}
	
}
