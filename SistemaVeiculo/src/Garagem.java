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

        switch (opcaoDeletar) {
            case 1:
                int contador = 0;
                System.out.println("\nCarros:");
                for (Veiculo veiculo : listaCarro) {
                        System.out.println((contador + 1) + " - " + veiculo);
                        contador++;
                }
                System.out.println("Qual deseja deletar?");
                int deletar = sc.nextInt();
                listaCarro.remove(deletar - 1);
                System.out.println("Carro removido com sucesso!");
                break;

            case 2:
                contador = 0;
                System.out.println("\nMotos:");
                for (Veiculo veiculo : listaMoto) {
                    System.out.println((contador + 1) + " - " + veiculo);
                    contador++;
                }
                System.out.println("Qual deseja deletar?");
                deletar = sc.nextInt();
                listaMoto.remove(deletar - 1);
                System.out.println("Moto removido com sucesso!");
                break;

            case 3:
                contador = 0;
                System.out.println("\nCaminhões:");
                for (Veiculo veiculo : listaCaminhao) {
                    System.out.println((contador + 1) + " - " + veiculo);
                    contador++;
                }
                System.out.println("Qual deseja deletar?");
                deletar = sc.nextInt();
                listaCaminhao.remove(deletar - 1);
                System.out.println("Caminhão removido com sucesso!");
                break;
        }


    }
}
