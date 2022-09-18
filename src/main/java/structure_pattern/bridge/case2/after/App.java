package structure_pattern.bridge.case2.after;

import structure_pattern.bridge.case2.before.BlueCircle;
import structure_pattern.bridge.case2.before.RedCircle;
import structure_pattern.bridge.case2.before.Shape;

/**
 * 색깔이 늘어날수록 반복적인코드가 증가
 * 클라이언트코드가 바껴야함
 */
public class App {

    public static void main(String[] args) {
        Shape blueCircle = new Circle(new Blue(),"circle");
        Shape redCircle = new Circle(new Red(),"circle");




    }
}
