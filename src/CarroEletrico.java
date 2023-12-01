public class CarroEletrico extends Carro implements Recarregavel{

    private double custoEnergia;

    public CarroEletrico(String modelo, String ano, String cor, double custoEnergia) {
        super(modelo, ano, cor);
        this.custoEnergia = custoEnergia;
    }

    public double getCustoEnergia() {
        return custoEnergia;
    }

    public void setCustoEnergia(double custoEnergia) {
        this.custoEnergia = custoEnergia;
    }

    @Override
    public String toString() {
        String poli = recarregarBateria();
        String s = super.toString();
        return  s + " CarroEletrico{" +
                "custoEnergia=" + custoEnergia +
                '}' + poli;
    }

    @Override
    public String recarregarBateria() {
        return " Regarregando bateria carro elétrico!";
    }
}
