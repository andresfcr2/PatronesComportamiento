// Paso 2: cada accion es una clase que guarda lo necesario para revertirse
public class MayusculasComando implements Comando {
    private Documento doc;
    private String anterior = ""; // memoria del comando

    public MayusculasComando(Documento doc) {
        this.doc = doc;
    }

    @Override
    public void ejecutar() {
        anterior = doc.getContenido();
        doc.setContenido(anterior.toUpperCase());
    }

    @Override
    public void deshacer() {
        doc.setContenido(anterior);
    }
}
