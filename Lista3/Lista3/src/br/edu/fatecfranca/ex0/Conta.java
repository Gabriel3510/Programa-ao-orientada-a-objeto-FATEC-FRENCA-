package br.edu.fatecfranca.ex0;


public class Conta {
    private String nroConta, nroAgencia, nome;
    private float saldo;

    
    public Conta(String string, String string2, String string3, int i) {
    }
    public String getNroConta() {
        return nroConta;
    }
    public void setNroConta(String nroConta) {
        this.nroConta = nroConta;
    }
    public String getNroAgencia() {
        return nroAgencia;
    }
    public void setNroAgencia(String nroAgencia) {
        this.nroAgencia = nroAgencia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void mostra(String string) {
        System.out.println(string + this.nroConta + "Agencia: " + this.nroAgencia + "Nome: " + this.nome + "Saldo: " + this.saldo);

    }
}
