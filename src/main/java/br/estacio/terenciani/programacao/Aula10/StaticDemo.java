/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.Aula10;

/**
 *
 * @author aluno
 */
public class StaticDemo {
    static int count = 0;
    private String nome;
    
    public void incrementa(){
        count++;
    }
    
    public void setNome(String nomeParametro){
        nome = nomeParametro;
    }
    
    public String getNome(){
        return nome;
    }
    
    public static void main(String[] args) {
        StaticDemo objeto1 = new StaticDemo();
        StaticDemo objeto2 = new StaticDemo();
        
        objeto1.setNome("Claudir");
        objeto1.incrementa();
        
        objeto2.setNome("Neves");
        objeto2.incrementa();
        
        System.out.println("Count 1: " + objeto1.count);
        System.out.println("Nome 1: "+ objeto1.getNome());
        
        System.out.println("Count 2: "+ objeto2.count);
        System.out.println("Nome 2: "+ objeto2.getNome());
        
        
        
    }
    
}
