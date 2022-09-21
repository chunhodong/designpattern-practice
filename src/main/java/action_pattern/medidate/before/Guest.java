package action_pattern.medidate.before;

/**
 * Guest객체가 작업을 처리하기 위해 모든각체를 직접참조
 */
public class Guest {

    private Restaurant restaurant = new Restaurant();

    private CleaningService cleaningService = new CleaningService();

    public void dinner() {
        restaurant.dinner(this);
    }

    public void getTower(int numberOfTower) {
        cleaningService.getTower(this, numberOfTower);
    }

}
