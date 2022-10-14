package state.drivecar;

public class Drive60Km implements DriveState {

    private Car car;

    public Drive60Km(Car car) {
        this.car = car;
    }

    @Override
    public void setWindows(int height) {

    }

    @Override
    public void pickupPerson(Person person) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void setSpeed(int speed) {

    }
}
