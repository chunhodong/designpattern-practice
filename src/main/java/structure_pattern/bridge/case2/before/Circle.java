package structure_pattern.bridge.case2.before;

public class Circle implements Shape{
    @Override
    public void make() {
        System.out.println("circle make");
    }

    @Override
    public void run() {
        System.out.println("cicle run");

    }
}
