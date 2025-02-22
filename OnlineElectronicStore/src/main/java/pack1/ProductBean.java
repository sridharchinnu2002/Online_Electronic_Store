package pack1;

import java.io.Serializable;

public class ProductBean  implements Serializable
{
  private String pcode,pname,pcompany,pprice,pqnty;

public String getPcode() {
	return pcode;
}

public void setPcode(String pcode) {
	this.pcode = pcode;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getPcompany() {
	return pcompany;
}

public void setPcompany(String pcompany) {
	this.pcompany = pcompany;
}

public String getPprice() {
	return pprice;
}

public void setPprice(String pprice) {
	this.pprice = pprice;
}

public String getPqnty() {
	return pqnty;
}

public void setPqnty(String pqnty) {
	this.pqnty = pqnty;
}
  
  public ProductBean() {}
  
  
}
