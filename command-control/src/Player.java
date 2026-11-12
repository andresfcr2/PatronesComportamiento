package patroncommand;

// RECEIVER (receptor): el objeto que sabe hacer el trabajo real.
public class Player {

    public void jump() {
        System.out.println("The player jumps");
    }

    public void run() {
        System.out.println("The player runs");
    }

    public void attack() {
        System.out.println("The player attacks");
    }
}
