package structure_pattern.composite.after;

import structure_pattern.composite.before.Bag;
import structure_pattern.composite.before.Item;

public class ClientV2 {

    public static void main(String[] args) {
        ParentComponent doranBlade = new ItemV2("도란검", 450);
        ParentComponent healPotion = new ItemV2("체력 물약", 50);

        BagV2 bag = new BagV2();
        bag.add(doranBlade);
        bag.add(healPotion);


        BagV2 bag1 = new BagV2();


        ParentComponent doranBlade1 = new ItemV2("도란검", 100);
        ParentComponent healPotion1 = new ItemV2("체력 물약", 30);

        bag1.add(doranBlade1);
        bag1.add(healPotion1);

        bag1.add(bag);

        int price = bag1.getPrice();
        System.out.println("price : "+price);

    }



}
