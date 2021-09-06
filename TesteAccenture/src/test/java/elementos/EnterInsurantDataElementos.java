package elementos;

import org.openqa.selenium.By;

import pages.Metodos;

public class EnterInsurantDataElementos {
	
	Metodos mtd = new Metodos();
	
	private By firstname = By.id("firstname");
	private By lastname = By.id("lastname");
	private By birthdate = By.id("birthdate");
	private By gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	private By streetaddress = By.id("streetaddress");
	private By country = By.id("country");
	private By zipcode = By.id("zipcode");
	private By city = By.id("city");
	private By occupation = By.id("occupation");
	private By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span");
	private By btnNext = By.id("nextenterproductdata");
	
	
	public By getFirstname() {
		return firstname;
	}
	public By getLastname() {
		return lastname;
	}
	public By getBirthdate() {
		return birthdate;
	}
	public By getStreetaddress() {
		return streetaddress;
	}
	public By getCountry() {
		return country;
	}
	public By getZipcode() {
		return zipcode;
	}
	public By getCity() {
		return city;
	}
	public By getOccupation() {
		return occupation;
	}
	
	public By getGender() {
		return gender;
	}
	public By getHobbies() {
		return hobbies;
	}
	public By getBtnNext() {
		return btnNext;
	}

}
