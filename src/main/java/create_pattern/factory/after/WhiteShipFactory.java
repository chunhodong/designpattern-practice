package create_pattern.factory.after;

import create_pattern.factory.before.Ship;

public class WhiteShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
