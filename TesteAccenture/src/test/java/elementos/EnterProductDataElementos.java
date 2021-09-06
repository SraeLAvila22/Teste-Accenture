package elementos;

import org.openqa.selenium.By;

public class EnterProductDataElementos {
	
	private By startDate = By.id("startdate");
	private By insurancesum = By.id("insurancesum");
	private By meritrating = By.id("meritrating");
	private By damageinsurance = By.id("damageinsurance");
	private By optionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span");
	private By courtesycar = By.id("courtesycar");
	private By btnNext = By.id("nextselectpriceoption");
	
	public By getStartDate() {
		return startDate;
	}
	public By getInsurancesum() {
		return insurancesum;
	}
	public By getMeritrating() {
		return meritrating;
	}
	public By getDamageinsurance() {
		return damageinsurance;
	}
	public By getOptionalProducts() {
		return optionalProducts;
	}
	public By getCourtesycar() {
		return courtesycar;
	}
	public By getBtnNext() {
		return btnNext;
	}
	
}
