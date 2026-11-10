// Paso 5: la subclase solo dice COMO se ve cada paso
public class ReporteCSV extends Reporte {
    @Override
    protected String encabezado() {
        return "nombre,nota,estado\n";
    }

    @Override
    protected String fila(String nombre, double nota, String estado) {
        return nombre + "," + nota + "," + estado + "\n";
    }

    @Override
    protected String pie(double promedio) {
        return "";
    }

    // Paso 4: el CSV usa el gancho para omitir el pie
    @Override
    protected boolean incluirPie() {
        return false;
    }
}
