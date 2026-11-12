public interface Observable {
    public void suscribir(Suscriptor s);
    public void desuscribir(Suscriptor s);
    public void notificar(String mensaje);
}
