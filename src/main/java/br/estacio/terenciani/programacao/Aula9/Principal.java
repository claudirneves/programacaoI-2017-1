/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.Aula9;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Aluno aluno = new Aluno();
        aluno.nomear("Teste");
        aluno.gerarRA(123456);
        
        System.out.println("Qual o seu RA?");
        System.out.println(aluno.responderRA());*/
        
        TimeFutebol time = new TimeFutebol();
        time.dizNome("Seleção");
        time.dizPresidente("Ladrão");
        time.dizQuantJogadores(25);
        
        System.out.println("Qual o nome do Time?");
        System.out.println(time.Nome());
        
        
        
        
    }
    
}
