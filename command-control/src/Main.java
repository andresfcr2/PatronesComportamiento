package patroncommand;

// CLIENT (cliente): crea el receptor, las órdenes y las asigna al invocador.
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        GameController controller = new GameController();

        controller.setCommand("A", new JumpCommand(player));
        controller.setCommand("B", new RunCommand(player));
        controller.setCommand("X", new AttackCommand(player));

        controller.pressButton("A");
        controller.pressButton("B");
        controller.pressButton("X");
        controller.pressButton("Y"); // Sin orden asignada: no pasa nada
    }
}
