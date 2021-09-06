package pages;

import org.openqa.selenium.By;

import elementos.SendQuoteElementos;

public class SendQuotePage extends SelectPriceOptionPage {

	SendQuoteElementos elmt = new SendQuoteElementos();

	public void enviarCotacao() {
		escrever(elmt.getEmail(), emailgenerator());
		escrever(elmt.getPhone(), numberGenerator(11));
		escrever(elmt.getUsername(), nameGenerator(3, "accenture"));
		String password = passgenerator("Accenture.123");
		escrever(elmt.getPassword(), password);
		escrever(elmt.getConfirmpassword(), password);
		screenShot("Formulário de cotação preenchido");
		threadSleep(4000);
		click(elmt.getBtnSend());

	}
	
	public void verificarCotacao() {
		threadSleep(10000);
		screenShot("Cotação realizada com sucesso");
		threadSleep(2000);
		click(By.xpath("/html/body/div[4]/div[7]/div/button"));
		threadSleep(4000);
		fecharBrowser();
	}

}
