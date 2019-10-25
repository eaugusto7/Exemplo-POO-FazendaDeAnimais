/*
    PROJETO FAZENDA DE ANIMAIS UTILIZANDO PROGRAMAÇÃO ORIENTADA A OBJETOS
    NOME: Eduardo Augusto de Oliveira Borges
*/

package br.com.eduardoaugusto.fazendadeanimais;//Nome do pacote do projeto

//Inicia a classe Ave
public class Ave extends Animal{ //Classe filha da Classe Animal
    //Declaração de Variaveis
    public String corPena;              //Declaração da variavel cor da pena
    public String caracteristica;       //Declaração da variavel caracteristica

    //Construtor da Classe Ave
    public Ave(String corPena, int idade, String tamanho, String somEmitido, boolean capacidadeVoar) {
        super(idade, tamanho, somEmitido, capacidadeVoar); //O construtor recebe variaveis da classe pai
        this.setCaracteristica("Capacidade de por ovos");  //Define a caracteristica das aves
        this.corPena = corPena;
    }

    //Get da variavel Cor da Pena
    public String getCorPena() {
        return corPena;
    }

    //Set da variavel Cor da Pena
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //Get da variavel Caracteristica
    public String getCaracteristica() {
        return caracteristica;
    }

    //Set da variavel Caracteristica
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}