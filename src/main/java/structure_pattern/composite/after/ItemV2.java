package structure_pattern.composite.after;

public class ItemV2 implements ParentComponent{
    private String name;

    private int price;

    public ItemV2(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}
