package br.com.fiap;

import java.util.Scanner;

public class MegaUnaV1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte numEscolhido;
        byte numSorteado = 45;
        int tentativas = 5;
        String resposta = "sim";

        System.out.println("Bem-vindo(a) ao Mega Una!");

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite um número entre 1 e 100:");
            numEscolhido = sc.nextByte();

            if (numEscolhido == numSorteado) {
                System.out.println("Ganhou, parabéns!");
            } else {
                tentativas -= 1;
                System.out.println("Que pena! Tente de novo, você tem apenas " + tentativas + " tentativa(s)");
                if (tentativas == 0) {
                    System.out.println("Você gastou todas as suas tentativas. A resposta era: 45");
                    break;
                }
            }

            System.out.println("Gostaria de tentar novamente? (sim/não)");
            resposta = sc.next();
        }

        System.out.println("Volte sempre!");
    }
}

