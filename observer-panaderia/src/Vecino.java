public class Vecino {
    private String nombre;

    public Vecino(String nombre) {
        this.nombre = nombre;
    }

    // SINTOMA: el vecino tiene que ir a preguntar una y otra vez
    public void preguntar(Panaderia panaderia) {
        if (panaderia.hayPan()) {
            System.out.println(nombre + " pregunta: hay pan? -> si, voy por el pan");
        } else {
            System.out.println(nombre + " pregunta: hay pan? -> todavia no");
        }
    }
}
