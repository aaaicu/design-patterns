package state.drivecar;

public class Drive30Km implements DriveState {

    private final Car car;

    public Drive30Km(Car car) {
        this.car = car;
    }

    @Override
    public void setWindows(int height) {
        car.getWindows().forEach(w -> w.setHeight(height));
    }

    @Override
    public void pickupPerson(Person person) {
        throw new UnsupportedOperationException();
    }
}
