public class Main {
    public static void main(String[] args) {
        Documento doc = new Documento();
        Editor editor = new Editor();

        // Paso 6: Main crea los comandos y se los entrega al editor
        editor.ejecutar(new EscribirComando(doc, "Hola"));
        editor.ejecutar(new EscribirComando(doc, " mundo"));
        mostrar(doc);
        editor.ejecutar(new BorrarComando(doc, 6));
        mostrar(doc);
        editor.ejecutar(new MayusculasComando(doc));
        mostrar(doc);

        System.out.println("-- Ctrl+Z x3 --");
        editor.deshacer();
        mostrar(doc);
        editor.deshacer();
        mostrar(doc);
        editor.deshacer();
        mostrar(doc);
    }

    static void mostrar(Documento doc) {
        System.out.println("\"" + doc.getContenido() + "\"");
    }
}
