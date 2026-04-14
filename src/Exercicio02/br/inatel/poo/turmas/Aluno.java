package Exercicio02.br.inatel.poo.turmas;

public class Aluno {
    public String nome;
    public String matricula;
    public double[] notas;

    public double calculaMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + calculaMedia());
    }
}