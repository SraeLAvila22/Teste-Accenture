package elementos;

import org.openqa.selenium.By;

public class SendQuoteElementos {
	
	private By email = By.id("email");
	private By phone = By.id("phone");
	private By username = By.id("username");
	private By password = By.id("password");
	private By confirmpassword = By.id("confirmpassword");
	private By btnSend = By.id("sendemail");
	
	
	public By getEmail() {
		return email;
	}
	public By getPhone() {
		return phone;
	}
	public By getUsername() {
		return username;
	}
	public By getPassword() {
		return password;
	}
	public By getConfirmpassword() {
		return confirmpassword;
	}
	public By getBtnSend() {
		return btnSend;
	}

}
