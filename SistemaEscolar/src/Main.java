import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        } while (!op.equals("X"));


    }
}