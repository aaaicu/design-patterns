package factorymethod.airplane;

import factorymethod.airplane.airplane.Airplane;
import factorymethod.airplane.airplane.RenewalAirplane;

public class RenewalAirplaneFactory implements AirplaneFactory {

    @Override
    public Airplane orderAirplane() {
        return new RenewalAirplane();
    }
}
