package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class rio {
    String nome;
    float nivel;
    boolean poluido;

    rio(){

    }
    rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    void ensolarar(float x) {
        this.nivel -= x;
    }
    void chover(float x) {
        this.nivel += x;
    }
    void limpar(){
        this.poluido = false;
    }
    void sujar(){
        this.poluido = true;
    }
    void mostra(){
    JOptionPane.showMessageDialog(null ,
        "Nome: " + this.nome +
        "Nivel: " + this.nivel +
        "poluido: " + (this.poluido ? "Sim": "Não" ));
    }
}