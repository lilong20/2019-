package edu.swjtuhc.demo.mode;

public class Good {
	String goodsname; 
	String goodsprice;
	int gid;
	@Override
	public String toString() {
		return "Good [goodsname=" + goodsname + ", goodsprice=" + goodsprice + ", gid=" + gid + "]";
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
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	

}
