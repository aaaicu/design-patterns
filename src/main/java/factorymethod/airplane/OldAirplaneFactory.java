package factorymethod.airplane;

import factorymethod.airplane.airplane.Airplane;
import factorymethod.airplane.airplane.OldAirplane;

public class OldAirplaneFactory implements AirplaneFactory {
    @Override
    public Airplane orderAirplane() {
        return new OldAirplane();
    }
}
