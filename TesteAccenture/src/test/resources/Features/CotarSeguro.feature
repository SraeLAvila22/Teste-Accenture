#Author: israeljdavila@gmail.com

@RunAll
Feature: Cotar seguro de um veiculo
  Eu como usuario quero cotar um seguro para o meu veiculo


  Scenario: Cotar um seguro
    Given que eu esteja no site "http://sampleapp.tricentis.com/101/app.php"
    When preencher o formulario aba Enter Vehicle Data e pressionar next
    And preencher o formulario aba Enter Insurant Data e pressionar next
    And preencher o formulario aba Enter Product Data e pressionar next
    And preencher o formulario aba Select Price Option e pressionar next
    And preencher o formulario aba Send Quote e pressionar Send
    Then verificar a mensagem Sending email success na tela






