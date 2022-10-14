package state.drivecar;

public class Drive80Km implements DriveState {

    private Car car;

    public Drive80Km(Car car) {
        this.car = car;
    }

    @Override
    public void setWindows(int height) {
        if (height > Window.MAX_HEIGHT_LIMIT) {
            car.getWindows().forEach(window -> window.setHeight(height));
        } else {
            checkWindowHeight();
        }
    }

    private void checkWindowHeight() {
        car.getWindows().forEach(w -> {
            System.out.println("높이를 제한합니다.");
            w.setHeight(Window.MAX_HEIGHT_LIMIT);
        });
    }

    @Override
    public void pickupPerson(Person person) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void setSpeed(int speed) {

    }
}
