// Paso 5: la subclase solo dice COMO se ve cada paso
public class ReporteTexto extends Reporte {
    @Override
    protected String encabezado() {
        return "=== NOTAS PROGRAMACION I ===\n";
    }

    @Override
    protected String fila(String nombre, double nota, String estado) {
        return nombre + " ..... " + nota + "  " + estado + "\n";
    }

    @Override
    protected String pie(double promedio) {
        return "Promedio del curso: " + promedio + "\n";
    }
}
