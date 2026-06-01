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
            System.out.println("Digite a " + (i+1) + "nota: ");
            notas[i] = sc.nextInt();
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;

        Aluno aluno = new Aluno(nomeAluno, serie, notas, media);
        listaAluno.add(aluno);
        System.out.println("Aluno e notas cadastrados!!");
    }

    public void verMedias() {

    }

    public void conferirAprovacoes() {

    }
}
