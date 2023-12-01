public interface Recarregavel {

    default String recarregarBateria() {
        return "Regarregar bateria!";
    }

    //a interface fala o que deve fazer e não necessariamente o como fazer
//    String recarregarBateria();
}
