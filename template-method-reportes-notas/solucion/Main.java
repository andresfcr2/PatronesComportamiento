import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> curso = new ArrayList<>();
        curso.add(new Estudiante("Ana Ruiz", 4.5));
        curso.add(new Estudiante("Carlos Perez", 3.0));
        curso.add(new Estudiante("Diana Gomez", 2.4));
        curso.add(new Estudiante("Felipe Rojas", 3.7));

        // Paso 6: todos los reportes se tratan como Reporte
        ArrayList<Reporte> reportes = new ArrayList<>();
        reportes.add(new ReporteTexto());
        reportes.add(new ReporteCSV());
        reportes.add(new ReporteHTML());

        for (Reporte r : reportes) {
            System.out.println(r.generar(curso));
        }
    }
}
