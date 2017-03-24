/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao;

/**
 *
 * @author aluno
 */
public class VariavelTipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 4;
        int resultado;
       // imprime();
        resultado = multiplica(x,y);
        System.out.printf("O resultado é: \n%d" ,resultado);
        
        //imprime();
    
    }
    public static int multiplica(int x, int y){
        return x * y;
    }
    public static void imprime (){
        System.out.println("-----");
        System.out.println("Teste");
        System.out.println("-----");
    }
}
