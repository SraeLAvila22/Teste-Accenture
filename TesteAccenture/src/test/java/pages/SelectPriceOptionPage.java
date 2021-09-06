package pages;

import elementos.SelectPriceOptionElementos;

public class SelectPriceOptionPage extends EnterProductDataPage {

	SelectPriceOptionElementos elmt = new SelectPriceOptionElementos();

	public void selecionarOpcaoDePreco() {
		click(elmt.getGold());
		screenShot("Preço selecionado");
		threadSleep(2000);
		click(elmt.getBtnNext());
	}

}
