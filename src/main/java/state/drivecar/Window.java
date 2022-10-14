package state.drivecar;

public class Window {
    public static final int MAX_HEIGHT = 100;
    public static final int MIN_HEIGHT = 0;
    public static final int MAX_HEIGHT_LIMIT = 80;

    private int height;

    public Window(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Window{" +
                "height=" + height +
                '}';
    }
}
