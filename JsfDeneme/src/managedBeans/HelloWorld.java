package managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld")
public class HelloWorld {
	
	
	private String message = "Hello This is my First JSF";

	
	public String sendMessage(){
		return message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	

}
