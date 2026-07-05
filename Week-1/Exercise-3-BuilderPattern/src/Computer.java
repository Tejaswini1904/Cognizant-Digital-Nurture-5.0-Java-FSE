public class Computer {

    private String cpu;
    private String ram;
    private String storage;
    private boolean graphicsCard;
    private boolean wifi;

    // Private constructor
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifi = builder.wifi;
    }

    public void displayConfiguration() {
        System.out.println("Computer Configuration");
        System.out.println("----------------------");
        System.out.println("CPU          : " + cpu);
        System.out.println("RAM          : " + ram);
        System.out.println("Storage      : " + storage);
        System.out.println("Graphics Card: " + (graphicsCard ? "Yes" : "No"));
        System.out.println("WiFi         : " + (wifi ? "Yes" : "No"));
    }

    // Static Builder Class
    public static class ComputerBuilder {

        private String cpu;
        private String ram;
        private String storage;
        private boolean graphicsCard;
        private boolean wifi;

        public ComputerBuilder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setWifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
