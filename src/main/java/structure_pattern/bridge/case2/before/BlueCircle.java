package structure_pattern.bridge.case2.before;

public class BlueCircle implements Shape {
    @Override
    public void make() {
        System.out.println("blue make");
    }

    @Override
    public void run() {
        System.out.println("blue run");
    }

    public String getColorName(){
        return "blue";
    }
}
