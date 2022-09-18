package structure_pattern.bridge.case2.before;

public class RedCircle implements Shape {
    @Override
    public void make() {
        System.out.println("red make");
    }

    @Override
    public void run() {
        System.out.println("red run");

    }

    public String getColorName(){
        return "red";
    }
}
