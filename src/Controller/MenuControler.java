package Controller;

import Instituicao.Sala;
import Instituicao.Sessao;

import java.util.Scanner;

public class MenuControler {
    private Sessao[] sessoes;

    public static Scanner scr = new Scanner(System.in);

    public MenuControler(Sessao[] sessoes) {
        this.sessoes = sessoes;
    }

    public void mostrarMenu() {
        System.out.println("""
                
                           88                                                      \s
                           ""                                                      \s
                
                 ,adPPYba, 88 8b,dPPYba,   ,adPPYba, 88,dPYba,,adPYba,  ,adPPYYba, \s
                a8"     "" 88 88P'   `"8a a8P_____88 88P'   "88"    "8a ""     `Y8 \s
                8b         88 88       88 8PP""\"""\"" 88      88      88 ,adPPPPP88 \s
                "8a,   ,aa 88 88       88 "8b,   ,aa 88      88      88 88,    ,88 \s
                 `"Ybbd8"' 88 88       88  `"Ybbd8"' 88      88      88 `"8bbdP"Y8 \s
                
                """);
        System.out.println();
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║                                                           ║");
        System.out.println("║                BEM VINDO AO VOIDS CINEMA !                ║");
        System.out.println("║                                                           ║");
        System.out.println("╠═══════════════════════════════════════════════════════════╣");
        System.out.println("║                                                           ║");
        System.out.println("║ [1] - Iniciar serviço                                     ║");
        System.out.println("║ [2] - Encerrar                                            ║");
        System.out.println("║                                                           ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
    }

    public static int lerOpcao() {
        try {
            return Integer.parseInt(scr.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void processarOpcao(int opcao) {

        switch (opcao) {
            case 1:
                mostrarSessoes();
                break;
            case 2:
                break;
            default:
                System.out.println("Opção inválida!");

        }
    }

    public void mostrarSessoes() {
        System.out.println("╔═════════════════════════════════════════════════════════════╗");
        System.out.println("║ [0] - Voltar                                                ║");
        System.out.println("║                                                             ║");
        for (int i = 0; i < sessoes.length; i++) {
            if (sessoes[i] != null) {
                System.out.println("║ " + "[" +  (i + 1) + "]" + " - " + sessoes[i].getFilme().getTitulo() + " (" + sessoes[i].getSala() + " - " + sessoes[i].getHorario() + ")");
            } else {
                System.out.println("Não há sessões disponíveis!");
            }
        }
        System.out.println("║                                                             ║");
        System.out.println("║Qual sessão você deseja ir?                                  ║");
        System.out.println("╚═════════════════════════════════════════════════════════════╝");

        int opcao = Integer.parseInt(scr.nextLine());
        if (opcao >= 1 && opcao <= sessoes.length) {
            Sala salaEscolhida = sessoes[opcao - 1].getSala();
            salaEscolhida.exibirSala();
            menuSala(salaEscolhida);
        } else if (opcao == 0) return;
        else {
            System.out.println("Sessão desconhecida, tente novamente!");
        }
    }

    public void menuSala(Sala sala) {

        while (true) {
            System.out.println("\n╔═══════════════════════════════════════╗");
            System.out.println("║ [1] - Reservar Assentos               ║");
            System.out.println("║ [2] - Cancelar Reservas               ║");
            System.out.println("║ [3] - Voltar                          ║");
            System.out.println("╚═══════════════════════════════════════╝");


            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    System.out.println("Digite os assentos:");
                    String entrada = scr.nextLine();

                    String[] assentos = entrada.split(" ");
                    for (String a : assentos) {
                        sala.reservarAssento(a);
                    }
                    sala.exibirSala();
                    break;

                case 2:
                    System.out.println("Digite os assentos para cancelar:");
                    entrada = scr.nextLine();

                    String[] cancelar = entrada.split(" ");
                    for (String a : cancelar) {
                        sala.cancelarAssento(a);
                    }
                    sala.exibirSala();
                    break;

                case 3:
                    mostrarSessoes();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
