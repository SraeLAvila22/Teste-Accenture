package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SendQuotePage;

public class CotarSeguro extends SendQuotePage {

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		abrirBrowser(site);
		threadSleep(3000);
	}

	@When("preencher o formulario aba Enter Vehicle Data e pressionar next")
	public void preencher_o_formulario_aba_enter_vehicle_data_e_pressionar_next() {
		preencherDadosDoVeiculo();
	}

	@When("preencher o formulario aba Enter Insurant Data e pressionar next")
	public void preencher_o_formulario_aba_enter_insurant_data_e_pressionar_next() {
		preencherDadosDoSeguro();
	}

	@When("preencher o formulario aba Enter Product Data e pressionar next")
	public void preencher_o_formulario_aba_enter_product_data_e_pressionar_next() {
		preencherDadosDoProduto();
	}

	@When("preencher o formulario aba Select Price Option e pressionar next")
	public void preencher_o_formulario_aba_select_price_option_e_pressionar_next() {
		selecionarOpcaoDePreco();
	}

	@When("preencher o formulario aba Send Quote e pressionar Send")
	public void preencher_o_formulario_aba_send_quote_e_pressionar_send() {
		enviarCotacao();
	}

	@Then("verificar a mensagem Sending email success na tela")
	public void verificar_a_mensagem_sending_email_success_na_tela() {
		verificarCotacao();
	}

}
