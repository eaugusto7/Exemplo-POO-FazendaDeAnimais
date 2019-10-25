/*
    PROJETO FAZENDA DE ANIMAIS UTILIZANDO PROGRAMAÇÃO ORIENTADA A OBJETOS
    NOME: Eduardo Augusto de Oliveira Borges
*/

package br.com.eduardoaugusto.fazendadeanimais;//Nome do pacote do projeto

import javax.swing.JOptionPane; //Importação da biblioteca JOptionPane

public class Morcego extends Mamifero implements ControleMamifero{ //Classe filha da classe Mamifero
    
    //Construtor da Classe Morcego
    public Morcego(String corPelo, int idade, String tamanho, String somEmitido, boolean capacidadeVoar) {
        super(corPelo, idade, tamanho, somEmitido, capacidadeVoar); //O construtor recebe as variaveis da classe pai
    }
    
    @Override //Sobrescreve o método exibir() para exibir a mensagem final ao usuário
    public void exibir(){
        this.setSomEmitido("Farfalho"); //Define o som emitido como Farfalho
        super.setCapacidadeVoar(true); //Define a capacidade de voar do animal como verdadeiro
        
        //Exibe a mensagem final ao usuário em modo texto
        System.out.println("\nAnimal: Morcego\n" + "Tipo: Mamifero\n" + "Idade: "+super.getIdade()+"meses\nTamanho: "+super.getTamanho()+"cm\nCaracteristica: "+super.getCaracteristica()+"\n"
                           + "Som emitido: "+super.somEmitido+"\nCor Pelo: "+super.getCorPelo());
        
        if(super.capacidadeVoar)System.out.println("Capacidade de voar: Sim");
        else System.out.println("Capacidade de voar: Nao \n");
   
        //Exibe a mensagem final ao usuário utilizando JOptionPane
        JOptionPane.showMessageDialog(null, "Animal: Morcego \nTipo: Mamifero\nIdade: " + idade + "meses\nTamanho: "+tamanho+"cm\nCaracteristica: "+this.getCaracteristica()
                                             +"\nSom Emitido: " + this.getSomEmitido() + "\nCor do Pelo: " + this.getCorPelo() + "\nCapacidade de Voar: Sim");
    }
}
