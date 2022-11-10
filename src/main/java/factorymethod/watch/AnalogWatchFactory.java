package factorymethod.watch;

import factorymethod.watch.watch.AnalogWatch;
import factorymethod.watch.watch.Watch;

public class AnalogWatchFactory implements WatchFactory {
    @Override
    public Watch produce() {
        return new AnalogWatch();
    }
}
