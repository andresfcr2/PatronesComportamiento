package patroncommand;

// CONCRETE COMMAND: encapsula la acción "atacar" sobre un Player.
public class AttackCommand implements Command {
    private final Player player;

    public AttackCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.attack();
    }
}
