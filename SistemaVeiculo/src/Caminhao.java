public class Caminhao extends Veiculo{

    public Caminhao(String modelo, String velocidadeMaxima) {
        super(modelo, velocidadeMaxima);
    }

    @Override
    public void buzina() {
        System.out.println("FOOOOOOOMMMMMMM");
    }
}
