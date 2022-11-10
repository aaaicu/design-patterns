package factorymethod.watch.watch;

public class AnalogWatch implements Watch {
    @Override
    public String move() {
        return "tick tack";
    }

}
