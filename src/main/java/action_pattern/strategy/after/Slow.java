package action_pattern.strategy.after;

public class Slow implements Strategy{
    @Override
    public void blueLight() {
        System.out.println("slow blue light");
    }

    @Override
    public void redLight() {
        System.out.println("slow red light");


    }
}
