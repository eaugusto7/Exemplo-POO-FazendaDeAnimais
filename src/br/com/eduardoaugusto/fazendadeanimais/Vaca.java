/*
    PROJETO FAZENDA DE ANIMAIS UTILIZANDO PROGRAMAÇÃO ORIENTADA A OBJETOS
    NOME: Eduardo Augusto de Oliveira Borges
*/

package br.com.eduardoaugusto.fazendadeanimais;//Nome do pacote do projeto

import javax.swing.JOptionPane; //Importação da biblioteca JOptionPane

public class Vaca extends Mamifero implements ControleMamifero{ //Classe filha da Classe Mamifero
    //Construtor da Classe Vaca
    public Vaca(String corPelo, int idade, String tamanho, String somEmitido, boolean capacidadeVoar) {
        super(corPelo, idade, tamanho, somEmitido, capacidadeVoar); //O construtor recebe as variaveis da classe pai
    }
    
    @Override //Sobrescreve o método exibir() para exibir a mensagem final ao usuário
    public void exibir(){
        this.setSomEmitido("Mugido");   //Define o som emitido como Mugido
        super.setCapacidadeVoar(false); //Define a capacidade de voar do animal como falso
        
        //Exibe a mensagem final ao usuário em modo texto
        System.out.println("\nAnimal: Vaca\n" + "Tipo: Mamifero\n" + "Idade: "+super.getIdade()+"meses\nTamanho: "+super.getTamanho()+"cm\nCaracteristica: "+super.getCaracteristica()+"\n"
                           + "Som emitido: "+super.somEmitido+"\nCor Pelo: "+super.getCorPelo());
        
        if(super.capacidadeVoar)System.out.println("Capacidade de voar: Sim");
        else System.out.println("Capacidade de voar: Nao \n");
    
        //Exibe a mensagem final ao usuário utilizando JOptionPane
        JOptionPane.showMessageDialog(null, "Animal: Vaca \nTipo: Mamifero\nIdade: " + idade + "meses\nTamanho: "+tamanho+"cm\nCaracteristica: "+this.getCaracteristica()
                                             +"\nSom Emitido: " + this.getSomEmitido() + "\nCor do Pelo: " + this.getCorPelo() + "\nCapacidade de Voar: Nao");
    }
}
