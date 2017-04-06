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
public class TimeFutebol {
    
    private String nome;
    private String presidente;
    private int quantJogadores;
    private String estadio;
    private String titulos;
    private String tecnico;
    
    public String Nome(){
        return nome;
    }
    public String Presidente(){
        return presidente;
    }
    public int QuantJogadores(){
        return quantJogadores;
    }
    void dizNome(String nomeParametro){
        nome = nomeParametro;
    }
    void dizQuantJogadores(int quantJogadoresParametro){
        quantJogadores = quantJogadoresParametro;
    }
    void dizPresidente(String presidenteParametro){
        presidente = presidenteParametro; 
    }
    
    
}
