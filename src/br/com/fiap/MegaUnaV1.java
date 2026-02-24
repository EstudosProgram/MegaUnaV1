package br.com.fiap;

import java.util.Scanner;

//Estilo programação procedural - sem funções
//Mais performace, utilizados mais em sistemas embarcados

public class MegaUnaV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEscolhido;
        int numSorteado = (int) (Math.random() * 100 + 1);
        int tentativas = 5;
        String resposta = "SIM";
        String jogador;

        System.out.println("Bem-vinda(o) ao Mega Una!");

        System.out.println("Qual é seu nome?");
        jogador = sc.next();
        sc.nextLine();

        System.out.println("Olá, " + jogador + ", neste jogo, um número será sorteado. Você é capaz de descobrir?");

        do {
            tentativas--;
            System.out.println("Digite um número entre 1 e 100!");
            numEscolhido = sc.nextInt();

            if(numEscolhido == numSorteado) {
                System.out.println("Parabéns, " + jogador + "! Você acertou o número sorteado.");
                break;
            } else {
                System.out.println("Que pena, " + jogador + "! Não foi dessa vez. Mais sorte na próxima :)");
            }

            if(tentativas > 0) {
                System.out.println("Gostaria de tentar novamente? (sim / não)");
                resposta = sc.next();
            }
        } while(resposta.equalsIgnoreCase("sim") && tentativas > 0);

        System.out.println("Obrigada por jogar! Volte sempre!");
    }
}