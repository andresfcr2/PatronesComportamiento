public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("          Creamos los suscriptores");
        System.out.println("========================================");

        Suscriptor susc1 = new Suscriptor("Juan");
        Suscriptor susc2 = new Suscriptor("Pepe");
        Suscriptor susc3 = new Suscriptor("Ana");
        Suscriptor susc4 = new Suscriptor("Luisa");

        System.out.println("========================================");
        System.out.println("          Creamos el canal");
        System.out.println("========================================");

        CanalYoutube canal1 = new CanalYoutube("Majes");

        System.out.println("========================================");
        System.out.println("          Suscribimos a los usuarios");
        System.out.println("========================================");
        
        canal1.suscribir(susc1);
        canal1.suscribir(susc2);
        canal1.suscribir(susc3);
        canal1.suscribir(susc4);
        
        System.out.println("========================================");
        System.out.println("          Publicamos un video");
        System.out.println("========================================");
        
        canal1.publicarVideo("Motos de alto CC");
        
        System.out.println("========================================");
        System.out.println("          Desuscribir a alguien de la lista");
        System.out.println("========================================");
        
        canal1.desuscribir(susc4);
        canal1.desuscribir(susc2);
        
        System.out.println("========================================");
        System.out.println("          Publicamos otro video");
        System.out.println("========================================");
        
        canal1.publicarVideo("Motos de off road");

    

    }
}
