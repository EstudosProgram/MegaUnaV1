package br.com.fiap.v3;

import java.util.Scanner;

// Estilo programação funcional - utilizando funções
// Mais fácil de corrigir os bugs e para trabalhar em equipe

public class MegaUnaV3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jogo j1 = new Jogo();
        apresentarSaudacao();
        String gamer = caletarNome(scan);
        apresentarDesafio(gamer);
        jogar(gamer, scan, j1.getTentativas(), j1.getNumSorteado());
        finalizarJogo();
    }

    public static void apresentarSaudacao() {
        System.out.println("Bem-vinda(o) ao Mega Una!");
    }

    public static String caletarNome(Scanner sc) {
        System.out.println("Qual é seu nome?");
        String jogador = sc.next();
        sc.nextLine();
        return jogador;
    }

    public static void apresentarDesafio(String jogador) {
        System.out.println("Olá, " + jogador + ", neste jogo, um número será sorteado. Você é capaz de descobrir?");
    }

    public static void finalizarJogo() {
        System.out.println("Obrigada por jogar! Volte sempre!");
    }

    public static void jogar(String jogador, Scanner sc, int tentativas, int numSorteado) {
        int numEscolhido;
        String resposta = "sim";

        do {
            tentativas--;
            System.out.println("Digite um número entre 1 e 100!");
            numEscolhido = sc.nextInt();

            if(numEscolhido == numSorteado) {
                System.out.println("Parabéns, " + jogador +"! Você acertou o número sorteado.");
                break;
            } else {
                System.out.println("Que pena, " + jogador + "! Não foi dessa vez. Mais sorte na próxima :)");
            }

            if(tentativas > 0) {
                System.out.println("Gostaria de tentar novamente? (sim / não)");
                resposta = sc.next();
            }
        } while(resposta.equalsIgnoreCase("sim") && tentativas > 0);
    }
}
