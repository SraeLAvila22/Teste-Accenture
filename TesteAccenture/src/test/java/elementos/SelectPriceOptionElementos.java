package elementos;

import org.openqa.selenium.By;

public class SelectPriceOptionElementos {
	
	private By gold = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span");
	private By btnNext = By.id("nextsendquote");
	
	
	public By getGold() {
		return gold;
	}
	public By getBtnNext() {
		return btnNext;
	}
}
