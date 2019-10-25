/*
    PROJETO FAZENDA DE ANIMAIS UTILIZANDO PROGRAMAÇÃO ORIENTADA A OBJETOS
    NOME: Eduardo Augusto de Oliveira Borges
*/

package br.com.eduardoaugusto.fazendadeanimais;//Nome do pacote do projeto

import javax.swing.JOptionPane; //Importação da biblioteca JOptionPane

//Inicio da classe Cliente, na qual possui o método main para a chamada inicial
public class Cliente {
    
    //Método Telas para interação com o usuário
    public void Telas() {
        String[] opcoes = {"Galinha", "Pato", "Morcego", "Vaca"}; //Declaração e inicializao das opções de animais
        
        //Inicia uma janela JOption com as opções de animais para o usuário escolher
        int escolha = JOptionPane.showOptionDialog(null, "Escolha um animal", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes);
        
        //Declaração das variaveis
        String cor = "";
        String idade;
        String tamanho;

        //Inicia janela de JOptionPane de acordo com a opção do animal que foi escolhido
        if (escolha == 0 || escolha == 1) {
            cor = JOptionPane.showInputDialog("Digite a cor das Penas");
        }
        if (escolha == 2 || escolha == 3) {
            cor = JOptionPane.showInputDialog("Digite a cor do Pelo");
        }
        idade = JOptionPane.showInputDialog("Digite a idade (em meses)");
        tamanho = JOptionPane.showInputDialog("Digite o tamanho (em cm)");

        //Inicializa a classe de acordo com a opção de animal que o usuário escolheu
        switch (escolha) {
            case 0:
                Galinha gl = new Galinha(cor, Integer.parseInt(idade), tamanho, null, true); //Instancia a classe Galinha
                gl.exibir();    //Chama o método exibir na classe Galinha para exibir as informações ao usuário
                break;
            case 1:
                Pato pt = new Pato(cor, Integer.parseInt(idade), tamanho, null, true); //Instancia a classe Pato
                pt.exibir();    //Chama o método exibir na classe Pato para exibir as informações ao usuário
                break;
            case 2:
                Morcego mc = new Morcego(cor, Integer.parseInt(idade), tamanho, null, true); //Instancia a classe Morcego
                mc.exibir();    //Chama o método exibir na classe Morcego para exibir as informações ao usuário
                break;
            case 3:
                Vaca vc = new Vaca(cor, Integer.parseInt(idade), tamanho, null, true); //Instancia a classe Vaca
                vc.exibir();    //Chama o método exibir na classe Vaca para exibir as informações ao usuário
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente(); //Instancia a classe Cliente
        cliente.Telas();                 //Chama o método Telas na classe Cliente
    }
}
