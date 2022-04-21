package br.edu.fatecfranca.ex2;

public final class Aluno {
    private int nroAluno, idade;
    private float p1, p2;
    private String nome;

    public Aluno(){}
    public Aluno(int nroAluno, int idade, float p1, float p2, String nome){
        this.setnroAluno(nroAluno);
    }
    public void setnroAluno(int nroAluno){
        if (String.valueOf(nroAluno).length()==6){
            this.nroAluno = nroAluno;
        }else{
            System.out.println("Numero do aluno invalido");
            this.nroAluno = 0;
        }
    }
}
