package state.drivecar;

public interface DriveState {

    void setWindows(int height);

    void pickupPerson(Person person);

    void setSpeed(int speed);
}
