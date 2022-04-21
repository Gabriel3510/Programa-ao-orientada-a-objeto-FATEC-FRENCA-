package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class Cliente {
    int numeroconta, numeroagencia;
    String nome;
    float saldo;

    Cliente () {

    }
    Cliente(int numeroconta, int numeroagencia, String nome, float saldo){
        this.numeroconta = numeroconta;
        this.numeroagencia = numeroagencia;
        this.nome = nome;
        this.saldo = saldo;
  }

    void sacar(float x){
        this.saldo -= x;
    }
    void depositar(float x){
        this.saldo += x;
    }
    void mostra (){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "Saldo: " + this.saldo);
    }
}
