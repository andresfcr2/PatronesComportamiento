public class Panaderia {
    private boolean hayPan = false;

    public void sacarPan() {
        hayPan = true;
        System.out.println(">> Salio el pan caliente");
    }

    public boolean hayPan() {
        return hayPan;
    }
}
