package structure_pattern.bridge.case1.before;

public class KDA아리 implements Champion{
    @Override
    public void move() {
        System.out.println("KDA아리 move");

    }

    @Override
    public void skillQ() {
        System.out.println("KDA아리 SkillQ");

    }

    @Override
    public void skillW() {
        System.out.println("KDA아리 SkillW");

    }

    @Override
    public void skillE() {
        System.out.println("KDA아리 SkillE");

    }

    @Override
    public void skillR() {
        System.out.println("KDA아리 SkillR");

    }
}
