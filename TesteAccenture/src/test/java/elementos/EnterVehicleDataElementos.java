package elementos;

import org.openqa.selenium.By;

public class EnterVehicleDataElementos {
	
	private By automobile = By.id("nav_automobile");
	private By make = By.id("make");
	private By engineperformance = By.id("engineperformance");
	private By dateofmanufacture = By.id("dateofmanufacture");
	private By numberofseats = By.id("numberofseats");
	private By fuelType = By.id("fuel");
	private By listprice = By.id("listprice");
	private By licenseplatenumber = By.id("licenseplatenumber");
	private By annualmileage = By.id("annualmileage");
	private By btnNext = By.id("nextenterinsurantdata");
	
	
	public By getMake() {
		return make;
	}
	public By getEngineperformance() {
		return engineperformance;
	}
	public By getDateofmanufacture() {
		return dateofmanufacture;
	}
	public By getNumberofseats() {
		return numberofseats;
	}
	public By getFuelType() {
		return fuelType;
	}
	public By getListprice() {
		return listprice;
	}
	public By getLicenseplatenumber() {
		return licenseplatenumber;
	}
	public By getAnnualmileage() {
		return annualmileage;
	}
	public By getBtnNext() {
		return btnNext;
	}
	public By getAutomobile() {
		return automobile;
	}
}
