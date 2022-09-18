package structure_pattern.bridge.case2.after;

import structure_pattern.bridge.case2.before.Shape;

public class DefaultShape implements Shape {
    private Color color;

    private String name;
    public DefaultShape(Color color,String name){
        this.color = color;
        this.name = name;
    }
    @Override
    public void make() {
        System.out.println(color.getName()+"make");
    }

    @Override
    public void run() {
        System.out.println(color.getName()+"run");

    }

}
