package create_pattern.factory.after;

import create_pattern.factory.before.Ship;
import create_pattern.factory.before.ShipFactory;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }

}
