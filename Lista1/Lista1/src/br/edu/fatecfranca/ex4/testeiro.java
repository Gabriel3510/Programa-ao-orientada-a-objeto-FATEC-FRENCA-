package br.edu.fatecfranca.ex4;

public class testeiro {
    
    public static void main(String[]args) {
        rio obj1 = new rio("Tiete", 2, true);
        obj1.chover(1);
        obj1.limpar();
        obj1.ensolarar(0.5f);
        obj1.mostra();
    }
}