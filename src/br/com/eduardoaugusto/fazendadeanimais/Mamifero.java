/*
    PROJETO FAZENDA DE ANIMAIS UTILIZANDO PROGRAMAÇÃO ORIENTADA A OBJETOS
    NOME: Eduardo Augusto de Oliveira Borges
*/

package br.com.eduardoaugusto.fazendadeanimais;//Nome do pacote do projeto

/**
 *
 * @author EAugusto
 */
public class Mamifero extends Animal{ //Classe filha da Classe Animal
    //Declaração de Variaveis
    public String corPelo;          //Declaração da variavel cor do pelo
    public String caracteristica;   //Declaração da variavel caracteristica

    //Construtor da Classe Mamifero
    public Mamifero(String corPelo, int idade, String tamanho, String somEmitido, boolean capacidadeVoar) {
        super(idade, tamanho, somEmitido, capacidadeVoar); //O construtor recebe variaveis da classe pai
        this.setCaracteristica("Capacidade de Amamentar"); //Define a caracteristica dos mamiferos
        this.corPelo = corPelo;
    }

    //Get da variavel Cor do Pelo
    public String getCorPelo() {
        return corPelo;
    }

    //Set da variavel Cor do Pelo
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
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
