public abstract class Veiculo {
    private String modelo;
    private String velocidadeMaxima;

    public Veiculo(String modelo, String velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public String getVelocidadeMaxima() {
        return velocidadeMaxima;
    }


    public void buzina() {
        System.out.println("bi-biiii");
    }

    public String toString() {
        return "Modelo: " + modelo + " | Velocidade Maxima: " + velocidadeMaxima + " |";
    }
}
