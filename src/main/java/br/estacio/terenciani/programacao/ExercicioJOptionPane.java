/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class ExercicioJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] vetorCidades = new Object[5];
        String cidadeDigitada;
        for(int i=0;i<5;i++){
            cidadeDigitada=JOptionPane.showInputDialog("Digite uma Cidade");
            if(cidadeDigitada==null){
                JOptionPane.showMessageDialog(null,"Você Cancelou!");
                System.exit(0);             
            }else if(cidadeDigitada.equals("")){
                JOptionPane.showMessageDialog(null,"Digite ou Cancele!",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                i--;       
            }else{
                vetorCidades[i]=cidadeDigitada;
            }
                
        }
        Object posicao = JOptionPane.showInputDialog(null, "Selecione uma"
                    + " cidade ", "Opções de cidade" , 
                    JOptionPane.INFORMATION_MESSAGE,
                    null,vetorCidades, vetorCidades[0]);
            
        JOptionPane.showMessageDialog(null, "Você selecionou " + posicao);
    }
    
}
