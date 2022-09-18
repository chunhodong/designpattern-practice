package structure_pattern.composite.after;

import java.util.ArrayList;
import java.util.List;

public class BagV2 implements ParentComponent{

    private List<ParentComponent> components = new ArrayList<>();

    public void add(ParentComponent item) {
        components.add(item);
    }

    public List<ParentComponent> getItems() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(value -> value.getPrice()).sum();
    }


}
