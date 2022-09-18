package structure_pattern.bridge.case1.after;

public class DefaultCampion implements ChampionV1{
    private Skin skin;
    private String name;
    public DefaultCampion(Skin skin,String name){
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(skin.getName()+"["+name+"]"+"move");

    }

    @Override
    public void skillQ() {
        System.out.println(skin.getName()+"["+name+"]"+"Q");

    }

    @Override
    public void skillW() {
        System.out.println(skin.getName()+"["+name+"]"+"W");

    }

    @Override
    public void skillE() {
        System.out.println(skin.getName()+"["+name+"]"+"E");

    }

    @Override
    public void skillR() {
        System.out.println(skin.getName()+"["+name+"]"+"R");

    }
}
