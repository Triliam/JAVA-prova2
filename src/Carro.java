import java.util.Objects;

public class Carro {

    private String modelo;
    private String ano;
    private String cor;

    public Carro(String modelo, String ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro carro)) return false;
        return getModelo().equals(carro.getModelo()) && getAno().equals(carro.getAno()) && getCor().equals(carro.getCor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModelo(), getAno(), getCor());
    }
}
