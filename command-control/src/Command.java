package patroncommand;

// COMMAND: interfaz común para todas las órdenes.
// Quien la invoque no necesita saber QUÉ hace la orden, solo que se puede ejecutar.
public interface Command {
    void execute();
}
