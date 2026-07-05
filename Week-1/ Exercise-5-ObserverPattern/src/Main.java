public class Main {

    public static void main(String[] args) {

        Subject weatherStation = new Subject();

        Observer mobile = new MobileDisplay();
        Observer laptop = new LaptopDisplay();

        weatherStation.registerObserver(mobile);
        weatherStation.registerObserver(laptop);

        System.out.println("Temperature changed to 28.5°C");
        weatherStation.setTemperature(28.5f);

        System.out.println();

        System.out.println("Temperature changed to 31.0°C");
        weatherStation.setTemperature(31.0f);
    }
}
