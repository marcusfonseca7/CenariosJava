import java.util.ArrayList;
import java.util.Scanner;

public class Escola {
    Scanner sc = new Scanner(System.in);

    ArrayList<Aluno> listaAluno = new ArrayList<>();

    public void cadastrarAlunos() {
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.println("Qual série está? ");
        int serie = sc.nextInt();
        sc.nextLine(); //limpeza

        double[] notas = new double[4];
        double somaNotas = 0;
        for (int i=0; i < notas.length; i++) {
            System.out.println("Digite a nota do " + (i+1) + " bimestre: ");
            notas[i] = sc.nextInt();
            somaNotas += notas[i];
        }
        sc.nextLine(); //limpeza

        double media = somaNotas / notas.length;

        Aluno aluno = new Aluno(nomeAluno, serie, notas, media);
        listaAluno.add(aluno);
        System.out.println("Aluno e notas cadastrados!!");
    }

    public void exibirAlunos() {
        for (Aluno aluno : listaAluno){
            System.out.println(aluno);
        }
    }

    public void verMedias() {
        for (Aluno aluno : listaAluno){
            System.out.println("Nome: " + aluno.getNome() + " | Média: " + aluno.getMedia());
        }
    }

    public void conferirAprovacoes() {
        for (Aluno aluno : listaAluno){
            if (aluno.getMedia() > 6) {
                System.out.println("Nome: " + aluno.getNome() + " | Aprovado");
            } else {
                System.out.println("Nome: " + aluno.getNome() + " | Reprovado");
            }
        }
    }
}
