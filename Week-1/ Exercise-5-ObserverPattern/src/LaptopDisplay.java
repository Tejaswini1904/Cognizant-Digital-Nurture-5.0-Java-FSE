public class LaptopDisplay implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("Laptop Display: Temperature updated to " + temperature + "°C");
    }
}
