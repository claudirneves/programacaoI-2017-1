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
public class Aluno {
    private int RA;
    private String nome;
    private String endereco;
    private String curso;
    private int idade;
    private String dataNascimento;
    
    
    public int responderRA(){
        return RA;
    }
    void nomear(String nomeParametro){
        nome =  nomeParametro;
    }
    void gerarRA(int RaParamentro){
        RA = RaParamentro;
    }
}
