package pages;

import elementos.EnterVehicleDataElementos;

public class EnterVehicleDataPage extends Metodos{
	
	Metodos mtd = new Metodos();
	EnterVehicleDataElementos elmt = new EnterVehicleDataElementos();
	
	public void preencherDadosDoVeiculo() {
		click(elmt.getAutomobile());
		click(elmt.getMake());
		escrever(elmt.getMake(), "h");
		escrever(elmt.getEngineperformance(), "2.0");
		escrever(elmt.getDateofmanufacture(), "04/20/2017");
		click(elmt.getNumberofseats());
		escrever(elmt.getNumberofseats(), "5");
		click(elmt.getFuelType());
		escrever(elmt.getFuelType(), "g");
		escrever(elmt.getListprice(), mtd.numberGenerator(5));
		escrever(elmt.getLicenseplatenumber(), mtd.letterGenerator(3)+mtd.numberGenerator(3));
		escrever(elmt.getAnnualmileage(), mtd.numberGenerator(5));
		screenShot("Formulário dos dados do veiculo preenchido");
		threadSleep(2000);
		click(elmt.getBtnNext());
	}

}
