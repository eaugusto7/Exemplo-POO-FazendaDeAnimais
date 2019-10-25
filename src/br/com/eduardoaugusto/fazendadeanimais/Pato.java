/*
    PROJETO FAZENDA DE ANIMAIS UTILIZANDO PROGRAMAÇÃO ORIENTADA A OBJETOS
    NOME: Eduardo Augusto de Oliveira Borges
*/

package br.com.eduardoaugusto.fazendadeanimais;//Nome do pacote do projeto

import javax.swing.JOptionPane; //Importação da biblioteca JOptionPane

public class Pato extends Ave implements ControleAve{ //Classe filha da Classe Ave

    //Construtor da Classe Pato
    public Pato(String corPena, int idade, String tamanho, String somEmitido, boolean capacidadeVoar) {
        super(corPena, idade, tamanho, somEmitido, capacidadeVoar); //O construtor recebe as variaveis da classe pai
    }
    
    @Override //Sobrescreve o método exibir() para exibir a mensagem final ao usuário
    public void exibir(){
        this.setSomEmitido("Grasnido"); //Define o som emitido como Grasnido
        super.setCapacidadeVoar(true);  //Define a capacidade de voar do animal como verdadeiro
        
        //Exibe a mensagem final ao usuário em modo texto
        System.out.println("\nAnimal: Pato\n" + "Tipo: Ave\n" + "Idade: "+super.getIdade()+"meses\nTamanho: "+super.getTamanho()+"cm\nCaracteristica: "+super.getCaracteristica()+"\n"
                           + "Som emitido: "+super.somEmitido+"\nCor Pena: "+super.getCorPena());
        
        if(super.capacidadeVoar)System.out.println("Capacidade de voar: Sim");
        else System.out.println("Capacidade de voar: Nao \n");
    
        //Exibe a mensagem final ao usuário utilizando JOptionPane
        JOptionPane.showMessageDialog(null, "Animal: Pato \nTipo: Ave\nIdade: " + idade + "meses\nTamanho: "+tamanho+"cm\nCaracteristica: "+this.getCaracteristica()
                                             +"\nSom Emitido: " + this.getSomEmitido() + "\nCor da Pena: " + this.getCorPena() + "\nCapacidade de Voar: Sim");
    }
}
