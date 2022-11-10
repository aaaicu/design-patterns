package factorymethod.watch;

import factorymethod.watch.watch.DigitalWatch;
import factorymethod.watch.watch.Watch;

public class DigitalWatchFactory implements WatchFactory {
    @Override
    public Watch produce() {
        return new DigitalWatch();
    }
}
