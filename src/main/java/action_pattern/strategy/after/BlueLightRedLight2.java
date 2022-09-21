package action_pattern.strategy.after;

/**
 * 알고리즘이 추가되거나 변경된다면 BlueLightRedLight클래스를 매번수정
 */
public class BlueLightRedLight2 {


    public void blueLight(Strategy strategy) {
        strategy.blueLight();
    }

    public void redLight(Strategy strategy) {
        strategy.redLight();
    }
}
