package state.drivecar;

public class Drive0Km  implements DriveState {
    private Car car;

    public Drive0Km(Car car) {
        this.car = car;
    }

    @Override
    public void setWindows(int height) {
        car.getWindows().forEach(w -> w.setHeight(height));
    }

    @Override
    public void pickupPerson(Person person) {
        this.car.getPeople().add(person);
    }

    @Override
    public void setSpeed(int speed) {

    }
}
