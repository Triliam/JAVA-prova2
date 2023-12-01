public class Car implements Recarregavel{

    @Override
    public String recarregarBateria() {
        return Recarregavel.super.recarregarBateria();
    }
}
