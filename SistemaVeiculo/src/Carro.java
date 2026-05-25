public class Carro extends Veiculo{

    public Carro(String modelo, String velocidadeMaxima) {
        super(modelo, velocidadeMaxima);
    }

    @Override
    public void buzina() {
        System.out.println("fom-fom (agradecimento)");
    }
}
