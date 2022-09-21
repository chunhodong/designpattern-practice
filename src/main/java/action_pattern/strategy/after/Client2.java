package action_pattern.strategy.after;


public class Client2 {

    public static void main(String[] args) {
        BlueLightRedLight2 blueLightRedLight = new BlueLightRedLight2();
        blueLightRedLight.blueLight(new Faster());
        blueLightRedLight.redLight(new Strategy() {
            @Override
            public void blueLight() {

            }

            @Override
            public void redLight() {

            }
        });
    }
}
