package br.edu.fatecfranca.ex3;

public class Testecliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente("123456-7", "123-59", "Fulano", 0);  
        obj1.depositar(2000);
        obj1.sacar(400);
        obj1.sacar (500);
        obj1.mostrar();
    }
}