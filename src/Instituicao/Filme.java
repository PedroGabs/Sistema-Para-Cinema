package Instituicao;

public class Filme {
    private String titulo;
    private int duracaoSegundos;
    private String genero;

    public Filme(String titulo, int duracaoSegundos, String genero) {
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero == null) {
            throw new IllegalArgumentException("Gênero inválido!");
        }

        String g = genero.trim().toLowerCase();

        switch (g) {
            case "Ação":
            case "Terror":
            case "Romance":
            case "Humor":
            case "Suspense":
            case "Documentário":
                this.genero = g.substring(0,1).toUpperCase() + g.substring(1);
                break;
            default:
                throw new IllegalArgumentException("Gênero inválido!");
        }
    }

    public String getDuracaoFormatada() {
        int horas = duracaoSegundos / 3600;
        int minutos = (duracaoSegundos % 3600) / 60;
        int segundos = duracaoSegundos % 60;

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
