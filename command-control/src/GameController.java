package patroncommand;

import java.util.HashMap;
import java.util.Map;

// INVOKER (invocador): guarda órdenes y las dispara.
// No conoce a Player ni sabe qué hace cada botón.
public class GameController {
    private final Map<String, Command> commands = new HashMap<>();

    public void setCommand(String button, Command command) {
        commands.put(button, command);
    }

    public void pressButton(String button) {
        Command command = commands.get(button);

        if (command != null) {
            command.execute();
        }
    }
}
