package br.edu.fatecfranca.ex2;

public class teste{
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(123, 465, "fulano", 0);

        obj1.depositar(1000);
        obj1.depositar(5000);
        obj1.sacar(200);
        obj1.mostra();
    }
    
}
