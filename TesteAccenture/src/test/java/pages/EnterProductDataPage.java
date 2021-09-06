package pages;

import elementos.EnterProductDataElementos;

public class EnterProductDataPage extends EnterInsurantDataPage{
	
	EnterProductDataElementos elmt = new EnterProductDataElementos();
	
	public void preencherDadosDoProduto() {
		escrever(elmt.getStartDate(), "12/12/2021");
		click(elmt.getInsurancesum());
		escrever(elmt.getInsurancesum(), "5");
		click(elmt.getMeritrating());
		escrever(elmt.getMeritrating(), "s");
		click(elmt.getDamageinsurance());
		escrever(elmt.getDamageinsurance(), "f");
		click(elmt.getOptionalProducts());
		click(elmt.getCourtesycar());
		escrever(elmt.getCourtesycar(), "n");
		screenShot("Formulário do produto preenchido");
		threadSleep(2000);
		click(elmt.getBtnNext());
	}

}
