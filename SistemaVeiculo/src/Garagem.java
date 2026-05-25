import java.util.ArrayList;
import java.util.Scanner;

public class Garagem {

    Scanner sc = new Scanner(System.in);
    ArrayList<Moto> listaMoto = new ArrayList<>();
    ArrayList<Carro> listaCarro = new ArrayList<>();
    ArrayList<Caminhao> listaCaminhao = new ArrayList<>();


    public void adicionarVeiculo() {

        System.out.println("Digite o modelo do Veículo: ");
        String modelo = sc.nextLine();

        System.out.println("Digite sua velocidade máxima: ");
        String velocidadeMaxima = sc.nextLine();
        sc.nextLine(); //limpeza

        System.out.println("Em qual categoria deseja adicionar? | 1 - Carro | 2 - Moto | 3 - Caminhão | (Digite o nome exato!)");
        String opcaoVeiculo = sc.nextLine();

        if (opcaoVeiculo.equals("Carro")) {
            Carro carro = new Carro(modelo, velocidadeMaxima);
            listaCarro.add(carro);
            System.out.println("Carro Cadastrado");
        } else if (getClass().getSimpleName().equals("Moto")){
            Moto moto = new Moto(modelo, velocidadeMaxima);
            listaMoto.add(moto);
            System.out.println("Moto Cadastrada");
        } else {
            Caminhao caminhao = new Caminhao(modelo, velocidadeMaxima);
            listaCaminhao.add(caminhao);
            System.out.println("Caminhão Cadastrado");
        }

    }

    public void lerVeiculos(){
        System.out.println("Os veículos da garagem são:");

        System.out.println("\nCarros:");
        for (Veiculo veiculo : listaCarro) {
            if (veiculo.getClass().getSimpleName().equals("Carro")) {
                System.out.println(veiculo);
            }
        }

        System.out.println("\nMotos:");
        for (Veiculo veiculo : listaMoto) {
            if (veiculo.getClass().getSimpleName().equals("Moto")) {
                System.out.println(veiculo);
            }
        }

        System.out.println("\nCaminhão:");
        for (Veiculo veiculo : listaCaminhao) {
            if (veiculo.getClass().getSimpleName().equals("Caminhão")) {
                System.out.println(veiculo);
            }
        }
    }


    public void deletarVeiculo(){}
}
