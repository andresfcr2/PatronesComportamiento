public class Documento {
    private String contenido = "";

    public void insertar(String texto) {
        contenido += texto;
    }

    // Borra los ultimos n caracteres y retorna lo que borro
    public String borrar(int n) {
        int desde = Math.max(0, contenido.length() - n);
        String borrado = contenido.substring(desde);
        contenido = contenido.substring(0, desde);
        return borrado;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
