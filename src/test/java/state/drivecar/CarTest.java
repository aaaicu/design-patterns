package state.drivecar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CarTest {
    @Test
    @DisplayName("상태 별로 사람을 태울 수 있는지 확인한다.")
    void carTest() {
        Car car = new Car();
        Person person = new Person();
        car.pickupPerson(person);
        car.pickupPerson(person);

        car.setState(new Drive0Km(car));
        Assertions.assertThatCode(() -> car.pickupPerson(person)).doesNotThrowAnyException();

        Assertions.assertThatThrownBy(() -> {
            car.setState(new Drive30Km(car));
            car.pickupPerson(person);
        }).isExactlyInstanceOf(UnsupportedOperationException.class);

        Assertions.assertThatThrownBy(() -> {
            car.setState(new Drive80Km(car));
            car.pickupPerson(person);
        }).isExactlyInstanceOf(UnsupportedOperationException.class);

        System.out.println(car);
    }
    @Test
    @DisplayName("상태 별로 사람을 태울 수 있는지 확인한다.")
    void carWindowsSetTest() {
        Car car = new Car();
        Person person = new Person();
        car.pickupPerson(person);
        car.pickupPerson(person);
        car.setWindows(10);

        car.setState(new Drive0Km(car));
        Assertions.assertThatCode(() -> {
        }).doesNotThrowAnyException();

        car.setState(new Drive80Km(car));
        car.setWindows(90);
        System.out.println(car);

        car.setState(new Drive80Km(car));
        car.setWindows(70);
        System.out.println(car);
    }

}