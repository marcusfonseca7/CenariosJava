public class Aluno {
    private String nome;
    private int serie;
    private double[] notas = new double[4];
    private double media;

    public Aluno(String nome, int serie, double[] notas, double media) {
        this.nome = nome;
        this.serie = serie;
        this.notas = notas;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int getSerie() {
        return serie;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

}
