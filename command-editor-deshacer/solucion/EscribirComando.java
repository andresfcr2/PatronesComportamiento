// Paso 2: cada accion es una clase que guarda lo necesario para revertirse
public class EscribirComando implements Comando {
    private Documento doc;
    private String texto;

    public EscribirComando(Documento doc, String texto) {
        this.doc = doc;
        this.texto = texto;
    }

    @Override
    public void ejecutar() {
        doc.insertar(texto);
    }

    @Override
    public void deshacer() {
        doc.borrar(texto.length());
    }
}
