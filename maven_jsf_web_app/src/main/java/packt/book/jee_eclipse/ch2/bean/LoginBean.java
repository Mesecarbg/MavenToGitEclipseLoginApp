package packt.book.jee_eclipse.ch2.bean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="LoginBean")
@RequestScoped
public class LoginBean {
private String userName;
private String password;
private String errorMsg;

public String validate() {
 if("admin".equalsIgnoreCase(userName) && "admin".equalsIgnoreCase(password)) {
	 errorMsg = null;
	 return "Welcome admin!";
 }else {
	 errorMsg = "Invalid user id or password. Please try again!";
	 return null;
 }
}

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getErrorMsg() {
	return errorMsg;
}
public void setErrorMsg(String errorMsg) {
	this.errorMsg = errorMsg;
}


}
