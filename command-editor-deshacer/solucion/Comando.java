// Paso 1: una accion se vuelve un objeto que sabe hacerse y deshacerse
public interface Comando {
    void ejecutar();
    void deshacer();
}
