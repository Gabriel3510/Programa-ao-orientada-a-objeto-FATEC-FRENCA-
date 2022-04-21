package Avaliacao;
public class Apto extends Imovel {
    private int nro;

    public Apto() {
    }  
    public void setNro(int nro) {
    this.nro = nro;
    }

    public Apto(String endereco, int nro) {
    super(endereco);
    setNro(nro);
    }

    public int getNro() {
    return nro;
    }

    @Override
    public String toString() {
        return "Apto{" + "nro=" + nro + ", endereco='" + endereco + '\'' + '}';
    }
}
