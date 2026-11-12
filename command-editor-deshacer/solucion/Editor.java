import java.util.ArrayList;

public class Editor {
    // Paso 3: el editor guarda un historial de comandos
    private ArrayList<Comando> historial = new ArrayList<>();

    // Paso 4: el editor no sabe QUE hace el comando, solo lo ejecuta y lo anota
    public void ejecutar(Comando comando) {
        comando.ejecutar();
        historial.add(comando);
    }

    // Paso 5: deshacer = sacar el ultimo del historial y pedirle que se revierta
    public void deshacer() {
        if (historial.isEmpty()) {
            System.out.println("  (nada que deshacer)");
            return;
        }
        Comando ultimo = historial.remove(historial.size() - 1);
        ultimo.deshacer();
    }
}
