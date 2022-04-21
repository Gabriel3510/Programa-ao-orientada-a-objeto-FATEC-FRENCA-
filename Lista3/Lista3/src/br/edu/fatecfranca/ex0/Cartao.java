package br.edu.fatecfranca.ex0;

import java.sql.Date;

public class Cartao {
    private int numero, cvv;
    private Date validade;
    private String bandeira;
    private Conta conta; //associaçao

    public Cartao(int numero, int cvv, Date validade, String bandeira, Conta conta) {
        this.setNumero(numero);
        this.setCvv(cvv);
        this.setValidade(validade);
        this.setBandeira(bandeira);
        this.setConta(conta);
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void mostra(){
        System.out.println("Numero" + this.numero + "cvv" + this.cvv + "validade" + this.validade + "bandeira" + this.bandeira);
            this.conta.mostra(bandeira);
    }
    
}