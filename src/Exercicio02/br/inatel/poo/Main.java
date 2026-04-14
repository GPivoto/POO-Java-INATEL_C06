package Exercicio02.br.inatel.poo;

import Exercicio02.br.inatel.poo.turmas.Aluno;
import Exercicio02.br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno a1 = new Aluno();
        a1.nome = "Gabriel";
        a1.matricula = "123";
        a1.notas = new double[]{8.5, 9.0};

        Aluno a2 = new Aluno();
        a2.nome = "Ana";
        a2.matricula = "456";
        a2.notas = new double[]{10.0, 9.5};

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        System.out.println("=== Listagem de Alunos ===");
        turma.listarAlunos();

        Aluno melhor = turma.buscarMelhorAluno();
        System.out.println("\nMelhor aluno: " + melhor.nome);
    }
}