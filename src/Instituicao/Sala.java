package Instituicao;

public class Sala {
    private String identificacao;
    private char[][] assentos;
    private int linhas;
    private int colunas;

    public Sala(String identificacao, int linhas, int colunas) {
        this.identificacao = identificacao;
        this.linhas = linhas;
        this.colunas = colunas;
        this.assentos = new char[linhas][colunas];
        inicializarAssentos();
    }

    private void inicializarAssentos(){
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                assentos[i][j] = 'O';
            }
        }
    }

    public void exibirSala() {
        System.out.print("\n   ");
        for (int j = 0; j < colunas; j++) {
            System.out.printf("%-3d", j + 1);
        }
        System.out.println();

        for (int i = 0; i < linhas; i++) {
            char letra = (char) ('A' + i);
            System.out.print(letra + "  ");

            for (int j = 0; j < colunas; j++) {
                System.out.printf("%-3c", assentos[i][j]);
            }
            System.out.println();
        }
    }

    public void reservarAssento(String entrada){
        if (entrada.length() < 2){
            System.out.println("Entrada inválida!");
            return;
        }

        char letra = entrada.charAt(0);

        if (!Character.isLetter(letra)){
            System.out.println("Formato inválido!");
            return;
        }

        int numero;

        try {
            numero = Integer.parseInt(entrada.substring(1));
        } catch (Exception e) {
            System.out.println("Número inválido!");
            return;
        }

        int linha = Character.toUpperCase(letra) - 'A';
        int coluna = numero - 1;

        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            System.out.println("Assento fora da sala!");
        } else if (assentos[linha][coluna] == 'O') {
            assentos[linha][coluna] = 'X';
            System.out.println("\n" + entrada + " reservado!");
        } else {
            System.out.println(entrada + " já está ocupado!");
        }
    }

    public void cancelarAssento(String entrada){
        char letra = entrada.charAt(0);

        int numero;
        try {
            numero = Integer.parseInt(entrada.substring(1));
        } catch (Exception e) {
            System.out.println("Número inválido!");
            return;
        }

        int linha = Character.toUpperCase(letra) - 'A';
        int coluna = numero - 1;

        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            System.out.println("Assento fora da sala!");
            return;
        }

        if (assentos[linha][coluna] == 'O') {
            System.out.println(entrada + " já está livre!");
            return;
        }

        assentos[linha][coluna] = 'O';
        System.out.println(entrada + " cancelado!");
    }

    @Override
    public String toString() {
        return "Sala " + identificacao;
    }
}