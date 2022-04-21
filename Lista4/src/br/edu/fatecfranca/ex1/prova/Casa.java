package Avaliacao;
public class Casa extends Imovel {
    private float quintal;

    Casa() {
    }

    public Casa(String endereco, float quintal) {
        super(endereco);
        setQuintal(quintal);
    } 
    public void setQuintal(float quintal) {
        this.quintal = quintal;
    }

    public float getQuintal() {
        return quintal;
    }

    @Override
    public String toString() {
        return "Casa{" + "quintal=" + quintal + ", endereco='" + endereco + '\'' + '}';
    }
}
