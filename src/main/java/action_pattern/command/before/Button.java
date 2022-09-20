package action_pattern.command.before;

/**
 * Button이 Light를 직접참조하고있기떄문에, 변경에 취약함
 */
public class Button {

    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.off();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
