package action_pattern.command.after;

import action_pattern.command.before.Light;

/**
 * Button이 Light를 직접참조하고있기떄문에, 변경에 취약함
 */
public class ButtonV1 {

    private Command command;

    public ButtonV1(Command command) {
        this.command = command;
    }

    public void press() {
       command.execute();
    }

    public static void main(String[] args) {
        ButtonV1 button = new ButtonV1(new Command() {
            @Override
            public void execute() {
                new Light().on();
            }
        });
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
