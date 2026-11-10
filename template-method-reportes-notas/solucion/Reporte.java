import java.util.ArrayList;

public abstract class Reporte {

    // Paso 1: el metodo plantilla fija el orden del algoritmo.
    // Es final: ninguna subclase puede cambiar ese orden.
    public final String generar(ArrayList<Estudiante> estudiantes) {
        String salida = encabezado();
        double suma = 0;
        for (Estudiante e : estudiantes) {
            salida += fila(e.getNombre(), e.getNota(), estado(e.getNota()));
            suma += e.getNota();
        }
        if (incluirPie()) {
            salida += pie(Math.round(suma / estudiantes.size() * 10) / 10.0);
        }
        return salida;
    }

    // Paso 2: la regla de negocio vive en UN solo lugar
    private String estado(double nota) {
        return nota >= 3.0 ? "APROBADO" : "REPROBADO";
    }

    // Paso 3: los pasos que cambian segun el formato
    protected abstract String encabezado();
    protected abstract String fila(String nombre, double nota, String estado);
    protected abstract String pie(double promedio);

    // Paso 4: gancho (hook) con comportamiento por defecto
    protected boolean incluirPie() {
        return true;
    }
}
