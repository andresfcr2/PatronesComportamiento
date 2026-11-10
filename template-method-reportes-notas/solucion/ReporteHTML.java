// Paso 5: la subclase solo dice COMO se ve cada paso
public class ReporteHTML extends Reporte {
    @Override
    protected String encabezado() {
        return "<table>\n<tr><th>Nombre</th><th>Nota</th><th>Estado</th></tr>\n";
    }

    @Override
    protected String fila(String nombre, double nota, String estado) {
        return "<tr><td>" + nombre + "</td><td>" + nota + "</td><td>" + estado + "</td></tr>\n";
    }

    @Override
    protected String pie(double promedio) {
        return "<tr><td>Promedio</td><td>" + promedio + "</td><td></td></tr>\n</table>\n";
    }
}
