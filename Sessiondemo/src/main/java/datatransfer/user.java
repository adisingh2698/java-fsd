package datatransfer;

public class user {
private String fname;
private String lname;
private String city;
private long contact;
private String mailid;
private int age;
public user() {
	
}
@Override
public String toString() {
	return "user [fname=" + fname + ", lname=" + lname + ", city=" + city + ", contact=" + contact + ", mailid="
			+ mailid + ", age=" + age + "]";
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
