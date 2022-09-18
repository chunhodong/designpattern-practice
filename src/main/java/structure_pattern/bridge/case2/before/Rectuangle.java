package structure_pattern.bridge.case2.before;

public class Rectuangle implements Shape{
    @Override
    public void make() {
        System.out.println("rt make");
    }

    @Override
    public void run() {
        System.out.println("rt run");

    }
}
