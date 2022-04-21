package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;


public class Testaaluno {


    public static void main(String[] args) {
        
        System.out.println("Sistema de notas:");
        
        // cria um objeto da classe aluno
        Aluno obj1 = new Aluno();
        obj1.nome = JOptionPane.showInputDialog("Informe o nome do aluno.");
        obj1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe O numero do aluno."));
        obj1.p1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da P1."));
        obj1.p2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da P2."));
       
        obj1.notafinal();
        obj1.passou();
        obj1.mostrar();
    }
    
}