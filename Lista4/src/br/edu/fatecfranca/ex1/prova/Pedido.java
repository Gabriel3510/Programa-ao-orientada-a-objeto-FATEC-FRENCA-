package Avaliacao;
import java.util.Date;


public class Pedido {
    private Cliente cliente;
    private int codigo;  
    private Unidade unidade;
    private Date data;
    
  

    public Pedido() {
    }
    
    public Pedido(int codigo, Date data, Cliente cliente, Unidade unidade) {
        this.setCodigo(codigo);
        this.setCliente(cliente);
        this.setUnidade(unidade);
        this.setData(data);
        
    }
    
    public Pedido(int codigo, Date data, String rg, String nome, String cidade, String estado) {
        this.setCodigo(codigo);
        this.setData(data);
        this.cliente = new Cliente(rg, nome); 
        this.unidade = new Unidade(cidade, estado); 
    }  
    public void setUnidade(String cidade, String estado) {
        this.unidade = new Unidade(cidade, estado);
    }
    public Cliente getCliente() {
        return cliente;
    }

    public int getCodigo() {
        return codigo;
    }
    public Unidade getUnidade() {
        return unidade;
    }
  
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
      public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
   
   
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
 
    public void setCliente(String nome, String rg) {
        this.cliente = new Cliente(nome, rg);
    }

  
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return "Código " + this.codigo + " Data: " + this.data + 
        " Cliente: " + this.cliente + " Unidade: " + this.unidade;
    }
}