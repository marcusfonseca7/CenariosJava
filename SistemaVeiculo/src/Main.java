import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Garagem garagem = new Garagem();
        int opcaoMenu;

        do {
        System.out.println("╔════════════════════════════╗\n" +
                           "║          VEICULOS          ║\n" +
                           "╠════════════════════════════╣\n" +
                           "║   1- Adicionar Veículo     ║\n" +
                           "║   2- Listar Veículo        ║\n" +
                           "║   3- Deletar Veículo       ║\n" +
                           "║   4- Sair                  ║\n" +
                           "╚════════════════════════════╝");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {

                case 1:
                    garagem.adicionarVeiculo();
                    break;

                case 2:
                    garagem.lerVeiculos();
                    break;

                case 3:
                    garagem.deletarVeiculo();
                    break;

                case 4:
                    break;
            }
        } while (opcaoMenu != 4);

    }
}