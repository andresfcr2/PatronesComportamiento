public class Main {
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();
        Vecino ana = new Vecino("Ana");
        Vecino luis = new Vecino("Luis");
        Vecino marta = new Vecino("Marta");

        for (int hora = 5; hora <= 7; hora++) {
            System.out.println("-- " + hora + ":00 --");
            if (hora == 7) {
                panaderia.sacarPan();
            }
            // Cada hora, todos van a preguntar
            ana.preguntar(panaderia);
            luis.preguntar(panaderia);
            marta.preguntar(panaderia);
        }
    }
}
