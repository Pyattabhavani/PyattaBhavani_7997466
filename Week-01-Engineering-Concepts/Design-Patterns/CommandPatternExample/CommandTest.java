public class CommandTest {

    public static void main(String[] args) {

        Light light = new Light();

        Command command = new LightOnCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(command);

        remote.pressButton();
    }
}