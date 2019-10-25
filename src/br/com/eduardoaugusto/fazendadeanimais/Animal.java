/*
    PROJETO FAZENDA DE ANIMAIS UTILIZANDO PROGRAMAÇÃO ORIENTADA A OBJETOS
    NOME: Eduardo Augusto de Oliveira Borges
*/

package br.com.eduardoaugusto.fazendadeanimais;//Nome do pacote do projeto

//Inicia a classe Animal
public class Animal {
    //Declaração de variáveis
    public int idade;               //Declaração da varíavel idade
    public String tamanho;          //Declaração da varíavel tamanho
    public String somEmitido;       //Declaração da varíavel som emitido
    public boolean capacidadeVoar;  ////Declaração da varíavel capacidade de voar

    //Construtor da Classe Animal
    public Animal(int idade, String tamanho, String somEmitido, boolean capacidadeVoar) {
        this.idade = idade;
        this.tamanho = tamanho;
        this.somEmitido = somEmitido;
        this.capacidadeVoar = capacidadeVoar;
    }

    //Get da variavel Capacidade de Voar
    public boolean isCapacidadeVoar() {
        return capacidadeVoar;
    }

    //Set da variavel Capacidade de Voar
    public void setCapacidadeVoar(boolean capacidadeVoar) {
        this.capacidadeVoar = capacidadeVoar;
    }
    
    //Get da variavel idade
    public int getIdade() {
        return idade;
    }

    //Set da variavel idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Get da variavel tamanho
    public String getTamanho() {
        return tamanho;
    }

    //Set da variável tamanho
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    //Get da variavel somEmitido
    public String getSomEmitido() {
        return somEmitido;
    }

    //Set da variável somEmitido
    public void setSomEmitido(String somEmitido) {
        this.somEmitido = somEmitido;
    }   
}