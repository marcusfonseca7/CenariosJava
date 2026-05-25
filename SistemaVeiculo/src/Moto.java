public class Moto extends Veiculo{

    public Moto(String modelo, String velocidadeMaxima) {
        super(modelo, velocidadeMaxima);
    }

    @Override
    public void buzina() {
        System.out.println("bi-bi-bi-bi-bi (passando no corredor)");
    }
}
