package state.drivecar;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private DriveState state = new Drive0Km(this);

    private final List<Person> people;

    private final List<Window> windows;

    private int speed;


    public Car() {
        this.people = new ArrayList<>();

        this.windows  = new ArrayList<>();
        this.windows.add(new Window(Window.MAX_HEIGHT));
        this.windows.add(new Window(Window.MAX_HEIGHT));
        this.windows.add(new Window(Window.MAX_HEIGHT));
        this.windows.add(new Window(Window.MAX_HEIGHT));

        this.speed = 0;
    }

    public void pickupPerson(Person person) {
        this.state.pickupPerson(person);
    }

    public void setSpeed(int speed) {
        this.state.setSpeed(speed);
    }

    public void setWindows(int height) {
        this.state.setWindows(height);
    }

    @Override
    public String toString() {
        return "Car{" +
                "state=" + state +
                ", people=" + people +
                ", windows=" + windows +
                ", speed=" + speed +
                '}';
    }

    public List<Person> getPeople() {
        return people;
    }

    public List<Window> getWindows() {
        return windows;
    }

    public void setState(DriveState state) {
        this.state = state;
    }
}
