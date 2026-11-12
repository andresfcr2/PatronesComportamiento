
import java.util.ArrayList;

public class CanalYoutube implements Observable {
    String nombreCanal;
    private ArrayList<Suscriptor> suscriptores = new ArrayList<Suscriptor>();

    public CanalYoutube(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    @Override
    public void suscribir(Suscriptor s) {
        System.out.println("Se ha suscrito un nuevo usuario: " + s.nombre);
        suscriptores.add(s);
    }

    @Override
    public void desuscribir(Suscriptor s) {
        System.out.println("Se ha desuscrito un nuevo usuario: " + s.nombre);
        suscriptores.removeIf(susc -> susc.nombre.equals(s.nombre));
    }

    @Override
    public void notificar(String notificacion) {
        for (Suscriptor s : suscriptores) {
            s.actualizar(notificacion);
        }
    }

    public void publicarVideo(String titulo) {
        System.out.println(" >>>>>>>> Se ha publicado un nuevo video");
        notificar("Se ha publicado un nuevo video: " + titulo);
    }


}
