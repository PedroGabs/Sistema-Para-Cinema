import Instituicao.*;
import Controller.*;

public class Main {
    public static void main(String[] args) {
        Sessao[] sessoes = criarSessoes();

        MenuControler menu = new MenuControler(sessoes);

        int opcao;
        do {
            menu.mostrarMenu();
            opcao = MenuControler.lerOpcao();
            menu.processarOpcao(opcao);
        } while (opcao != 2);

        System.out.println("Encerrando serviço...");
        menu.scr.close();
    }

    //OBJ's

    public static Sessao[] criarSessoes() {
        Sessao[] sessoes = new Sessao[8];

        Filme filme1 = new Filme("Backrooms", 6300, "Suspense");
        Filme filme2 = new Filme("Homem Aranha - Um Novo Dia", 8400, "Ação");
        Filme filme3 = new Filme("Vingadores Doomsday", 13500, "ação");
        Filme filme4 = new Filme("Gran Turismo: De Jogador a Corredor", 8100, "documentario");
        Filme filme5 = new Filme("Velozes e Furiosos 2001", 6420, "ação");
        Filme filme6 = new Filme("Stallone Cobra", 5340, "Ação");
        Filme filme7 = new Filme("O Homem Que Copiava", 7440, "Romance");
        Filme filme8 = new Filme("Kill Bill: Volume 1", 6660, "Ação");

        Sala sala1 = new Sala("01",8,12);
        Sala sala2 = new Sala("02", 12, 24);
        Sala sala3 = new Sala("03", 6,12);
        Sala sala4 = new Sala("04", 10,18);
        Sala sala5 = new Sala("01",8,12);
        Sala sala6 = new Sala("02", 12, 24);
        Sala sala7 = new Sala("03", 6,12);
        Sala sala8 = new Sala("04", 10,18);

        Sessao s1 = new Sessao(filme1, sala1, "15:35");
        Sessao s2 = new Sessao(filme2, sala2, "15:20");
        Sessao s3 = new Sessao(filme3, sala3, "14:20");
        Sessao s4 = new Sessao(filme4, sala4, "15:25");
        Sessao s5 = new Sessao(filme5, sala5, "18:50");
        Sessao s6 = new Sessao(filme6, sala6, "19:20");
        Sessao s7 = new Sessao(filme7, sala7, "18:50");
        Sessao s8 = new Sessao(filme8, sala8, "19:20");

        sessoes[0] = s1;
        sessoes[1] = s2;
        sessoes[2] = s3;
        sessoes[3] = s4;
        sessoes[4] = s5;
        sessoes[5] = s6;
        sessoes[6] = s7;
        sessoes[7] = s8;

        return sessoes;
    }


}