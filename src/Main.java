import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Carro carro = new Carro("fusca", "1980", "branco");
       Carro carro1 = new Carro("gol", "1990", "cinza");
       Carro carro2 = new Carro("gol", "1990", "cinza");

       CarroEletrico carroEletrico = new CarroEletrico("eletric", "2000", "purpura", 20.00);
       CarroEletrico carroEletrico1 = new CarroEletrico("KA", "1999", "vermelho", 30.00);

        ArrayList<Carro> listaCar = new ArrayList<>();
        LinkedList<CarroEletrico> listCarEl = new LinkedList<>();

        listaCar.add(carro);
        listaCar.add(carro1);
        listaCar.add(carro2);

        listCarEl.add(carroEletrico);
        listCarEl.add(carroEletrico1);

        for (Carro carros : listaCar) {
            System.out.println(carros.toString());
        }
        for (CarroEletrico carEletricos : listCarEl) {
            System.out.println(carEletricos.toString());
        }

        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.hashCode());
        System.out.println(carro2.hashCode());

        Car car = new Car();
        System.out.println(car.recarregarBateria());
    }
}

//A escolha entre ArrayList e LinkedList depende das operações que você planeja realizar com mais frequência na sua lista.
// Se precisar de acesso aleatório frequente e poucas inserções/remoções no meio da lista: ArrayList.
// Para muitas inserções/remoções no meio da lista e acesso sequencial: LinkedList.
// Também é útil medir o desempenho com dados e operações específicas para tomar a melhor decisão.