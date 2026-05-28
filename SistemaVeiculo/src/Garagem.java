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

        System.out.println("Digite o a velocidade máxima: ");
        String velocidadeMaxima = sc.nextLine();

        System.out.println("Em qual categoria deseja adicionar? | - Carro | - Moto | - Caminhão | (Digite o nome exato!)");
        String opcaoVeiculo = sc.nextLine();

        if (opcaoVeiculo.equals("Carro")) {
            Carro carro = new Carro(modelo, velocidadeMaxima);
            listaCarro.add(carro);
            System.out.println("Carro Cadastrado");
        } else if (opcaoVeiculo.equals("Moto")){
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
                System.out.println(veiculo);
        }

        System.out.println("\nMotos:");
        for (Veiculo veiculo : listaMoto) {
                System.out.println(veiculo);
        }

        System.out.println("\nCaminhão:");
        for (Veiculo veiculo : listaCaminhao) {
                System.out.println(veiculo);
        }
    }


    public void deletarVeiculo() {

        System.out.println("Em qual categoria deseja deletar um veículo? | 1 - Carro | 2 - Moto | 3 - Caminhão |");
        int opcaoDeletar = sc.nextInt();
        sc.nextLine(); //limpeza

        ArrayList listaSelecionada = new ArrayList<>();

        if (opcaoDeletar == 1) {
            listaSelecionada = listaCarro;
        } else if (opcaoDeletar == 2) {
            listaSelecionada = listaMoto;
        } else if (opcaoDeletar == 3) {
            listaSelecionada = listaCaminhao;
        }

                int contador = 0;
                System.out.println("\nVeículos da Categoria:");
                for (Object veiculo : listaSelecionada) {
                        System.out.println((contador + 1) + " - " + veiculo);
                        contador++;
                }
                System.out.println("Qual deseja deletar?");
                int deletar = sc.nextInt();
                listaSelecionada.remove(deletar - 1);
                System.out.println("Veículo removido com sucesso!");

    }
}
