package pack1;

import java.io.Serializable;

public class CustomerBean implements Serializable
{
  private String uname,pwrd,fname,lname,addr,mid,phno;

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPwrd() {
	return pwrd;
}

public void setPwrd(String pwrd) {
	this.pwrd = pwrd;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getAddr() {
	return addr;
}

public void setAddr(String addr) {
	this.addr = addr;
}

public String getMid() {
	return mid;
}

public void setMid(String mid) {
	this.mid = mid;
}

public String getPhno() {
	return phno;
}

public void setPhno(String phno) {
	this.phno = phno;
}
  
  public CustomerBean() {}
}
