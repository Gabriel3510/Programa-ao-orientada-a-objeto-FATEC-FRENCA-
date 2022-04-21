package br.edu.fatecfranca.ex3;

public class Cliente {
    //declarações das variaveis
    private String nroConta, nroAgencia, nome;
    private float saldo;
    //construtores
    public Cliente(){

    }
    public Cliente (String nroConta, String nroAgencia, String nome, float saldo);{
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    public void setNroConta(String nroConta) {
        if ((nroConta.length() == 8) && 
        (nroConta.charAt(4) == '-')){
            this.nroConta = nroConta;
        }
        else { 
            System.out.print("Nro de conta invalido");
            this.nroConta = "invalido";
        }
    }
    private void setNome(String nome2) {
    }
    public void setNroAgencia(String nroAgencia) {
        if ((nroAgencia.length() == 8) && 
        (nroAgencia.charAt(4) == '-')){
            this.nroAgencia = nroAgencia;
        }
        else { 
            System.out.print("Nro de agencia invalido");
            this.nroAgencia = "invalido";
        }
    }

    public void setSaldo(float saldo) {
        if (saldo >=0) {
            this.saldo = saldo;
        }
        else { 
            System.out.print("Saldo invalido");
            this.saldo = saldo;
        }

    public void setNome(String nome) {
        if (nome.length() <= 30 ){
            this.nome = nome;
        }else { 
            System.out.println("Nome invalido");
            this.nome = "invalido";
        }
    }

    //fazendo o saque
    public void sacar(float x) {
        this.setSaldo(this.saldo - x);
    }
    //deposito
    public void depositar(float x){
        this.setSaldo(this.saldo + x);
    }

    //retorno
    public String getNroConta(){
        return this.nroConta;
    }
    public String getNroAgencia(){
        return this.nroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    //mostra
    public void mostra(){
        System.out.print("conta: " + this.nroConta + "Agencia: " + this.nroAgencia + "Nome: " + this.nome + "Saldo: " + saldo);
    }
}
