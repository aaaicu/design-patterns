package factorymethod.watch;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DigitalWatchFactoryTest {

    @Test
    void move() {
        WatchFactory watchFactory = new DigitalWatchFactory();
        Assertions.assertThat(watchFactory.produce().move()).isEqualTo("...");
    }
}