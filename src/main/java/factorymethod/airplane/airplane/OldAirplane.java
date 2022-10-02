package factorymethod.airplane.airplane;

public class OldAirplane implements Airplane {
    @Override
    public void flight() {
        System.out.println("옛 방식대로 만들어진 비행기");
    }
}
