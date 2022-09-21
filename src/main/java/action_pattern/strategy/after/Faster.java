package action_pattern.strategy.after;

public class Faster implements Strategy{
    @Override
    public void blueLight() {
        System.out.println("fast blue light");
    }

    @Override
    public void redLight() {
        System.out.println("fast red light");


    }
}
