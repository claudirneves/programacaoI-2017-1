/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.terenciani.programacao.Aula8;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double primeiroOperando = 0, segundoOperando, resultado = 0;
        String primeiro = "0", segundo;
        String selectOperacao;
        int escolha = 0;
        Object[] operacoes = {"*", "/", "+", "-"};

        primeiro:
        do {

            primeiro = JOptionPane.showInputDialog(null, "Digite o primeiro operando");
            if (primeiro == null) {
                break primeiro;
            }
            primeiroOperando = Double.parseDouble(primeiro);

            Object retorno = JOptionPane.showInputDialog(null,
                    "Escolha um operador", "Operadores", JOptionPane.INFORMATION_MESSAGE,
                    null, operacoes, operacoes[0]);
            selectOperacao = String.valueOf(retorno);

            terceiro:
            do {
                segundo = JOptionPane.showInputDialog(null, "Digite o segundo operando");
                if (segundo == null) {
                    break primeiro;
                }
                segundoOperando = Double.parseDouble(segundo);
                if (selectOperacao.equals("/") && segundoOperando == 0) {
                    JOptionPane.showMessageDialog(null, "Não existe divisão por zero");
                } else {
                    break terceiro;
                }

            } while (true);

            switch (selectOperacao) {
                case "*":
                    resultado = primeiroOperando * segundoOperando;
                    break;
                case "/":
                    resultado = primeiroOperando / segundoOperando;
                    break;
                case "+":
                    resultado = primeiroOperando + segundoOperando;
                    break;
                case "-":
                    resultado = primeiroOperando - segundoOperando;
                    break;
            }

            JOptionPane.showMessageDialog(null, "Resultado é: " + resultado);
            escolha = JOptionPane.showConfirmDialog(null, "Deseja exercutar outra operação?",
                    "Pergunta", JOptionPane.YES_NO_OPTION);

        } while (escolha == 0);
        JOptionPane.showMessageDialog(null, "Obrigado por utilizar os serviços Claudir de Contabilidade");

    }
}
