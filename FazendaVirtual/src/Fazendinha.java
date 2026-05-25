import java.util.Scanner;

public class Fazendinha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("╔════════════════════════════╗\n" +
                               "║         FAZENDINHA         ║\n" +
                               "╠════════════════════════════╣\n" +
                               "║   1- Cachorro              ║\n" +
                               "║   2- Gato                  ║\n" +
                               "║   3- Vaca                  ║\n" +
                               "║   4- Sair                  ║\n" +
                               "╚════════════════════════════╝");

            System.out.println("Qual deseja ver fazendo barulho?");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Cachorro cachorro = new Cachorro();
                    cachorro.som();
                    break;
                case 2:
                    Gato gato = new Gato();
                    gato.som();
                    break;

                case 3:
                    Vaca vaca = new Vaca();
                    vaca.som();
                    break;

                case 4:
                    break;
            }
        } while (opcao != 4);
    }
}