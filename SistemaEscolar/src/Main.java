import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Scanner sc = new Scanner(System.in);

        String op;
        do {
            System.out.print("""
                    ┌──────────────────────────────────┐
                    │  ■ ■ ■  PAINEL PRINCIPAL  ■ ■ ■  │
                    ├──────────────────────────────────┤
                    │                                  │
                    │   [A]  Cadastrar Alunos          │
                    │   [B]  Ver Alunos Cadastrados    │
                    │   [C]  Verificar Médias          │
                    │   [D]  Conferir Aprovação        │
                    │   [X]  Sair                      │
                    │                                  │
                    └──────────────────────────────────┘
                     Digite a letra correspondente > \s
                    """);
            op = sc.nextLine();

            switch (op) {
                case "A":
                    escola.cadastrarAlunos();
                    break;

                case "B":
                    escola.exibirAlunos();
                    break;

                case "C":
                    escola.verMedias();
                    break;

                case "D":
                    escola.conferirAprovacoes();
                    break;

                case "E":
                    break;

            }


        } while (!op.equals("X"));


    }
}