package Avaliacao;
public abstract class Imovel {
    protected String end;

    public Imovel() {
    }

    public Imovel(String end) {
        setEnd(end);
    }

    public String getEnd() {
        return end;
    }

    public void setEndereco(String end) {
        this.endereco = end;
    }

    public String toString() {
        return "Imovel{" +
                "endereco='" + end + '\'' +
                '}';
    }
}
