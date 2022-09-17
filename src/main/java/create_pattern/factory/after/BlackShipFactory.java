package create_pattern.factory.after;

import create_pattern.factory.before.Ship;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
