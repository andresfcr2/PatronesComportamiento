// Paso 2: cada accion es una clase que guarda lo necesario para revertirse
public class BorrarComando implements Comando {
    private Documento doc;
    private int cantidad;
    private String borrado = ""; // memoria del comando

    public BorrarComando(Documento doc, int cantidad) {
        this.doc = doc;
        this.cantidad = cantidad;
    }

    @Override
    public void ejecutar() {
        borrado = doc.borrar(cantidad);
    }

    @Override
    public void deshacer() {
        doc.insertar(borrado);
    }
}
