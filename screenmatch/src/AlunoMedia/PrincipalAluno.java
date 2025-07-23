package AlunoMedia;

import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner reader = new Scanner(System.in);

        aluno.setName(reader.next());
        int N = reader.nextInt();
        aluno.notas = new double[N];

        aluno.soma = 0;
        for (int i = 0; i < aluno.notas.length; i++) {
            aluno.notas[i] = reader.nextDouble();
            aluno.soma += aluno.notas[i];
        }
        aluno.ExibirAluno();
    }
}