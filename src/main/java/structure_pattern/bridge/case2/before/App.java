package structure_pattern.bridge.case2.before;

/**
 * 색깔이 늘어날수록 반복적인코드가 증가
 * 클라이언트코드가 바껴야함
 */
public class App {

    public static void main(String[] args) {
        Shape blueCircle = new BlueCircle();
        blueCircle.make();
        blueCircle.run();
        Shape redCircle = new RedCircle();
        
        

    }
}
