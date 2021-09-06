package pages;

import elementos.EnterInsurantDataElementos;

public class EnterInsurantDataPage extends EnterVehicleDataPage {
	
	EnterInsurantDataElementos elmt = new EnterInsurantDataElementos();

	public void preencherDadosDoSeguro() {
		escrever(elmt.getFirstname(), nameGenerator(4, "Accenture"));
		escrever(elmt.getLastname(), nameGenerator(4, "Accenture"));
		escrever(elmt.getBirthdate(), "03/18/1988");
		click(elmt.getGender());
		escrever(elmt.getStreetaddress(), nameGenerator(4, "Accenture"));
		click(elmt.getCountry());
		escrever(elmt.getCountry(), "br");
		escrever(elmt.getZipcode(), numberGenerator(8));
		escrever(elmt.getCity(), nameGenerator(3, "Accenture"));
		click(elmt.getOccupation());
		escrever(elmt.getOccupation(), "e");
		click(elmt.getHobbies());
		screenShot("Formulário dos dados do seguro preenchido");
		threadSleep(2000);
		click(elmt.getBtnNext());

	}

}
