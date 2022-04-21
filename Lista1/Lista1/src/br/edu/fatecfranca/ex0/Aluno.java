package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class Aluno {
    // declaração das variáveis
    int numeroAluno;
    String nome;
    int idade;
    float p1, p2;
    float total;
    // métodos construtores
    Aluno(){
        
    }
    Aluno(int numeroAluno, String nome, int idade, float p1, float p2, float total ){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
        this.total = total;
    }
    // métodos
    void notafinal(){
        total= (p1 + p2) / 2;
    }
    void passou(){
       if (total >= 6){
           System.out.print("Passou");
       }else{
        System.out.print("Voce falhou");
       }
    }
    void mostrar(){
        JOptionPane.showMessageDialog(null,"Nome" + this.nome + 
                " Numero do aluno " + this.numeroAluno + " Media " + this.total);
    }
}