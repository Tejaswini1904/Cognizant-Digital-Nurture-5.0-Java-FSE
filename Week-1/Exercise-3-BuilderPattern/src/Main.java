public class Main {

    public static void main(String[] args) {

        Computer gamingPC = new ComputerBuilder()
                .setCPU("Intel Core i9")
                .setRAM("32 GB")
                .setStorage("1 TB SSD")
                .setGraphicsCard(true)
                .setWifi(true)
                .build();

        Computer officePC = new ComputerBuilder()
                .setCPU("Intel Core i5")
                .setRAM("16 GB")
                .setStorage("512 GB SSD")
                .setGraphicsCard(false)
                .setWifi(true)
                .build();

        gamingPC.displayConfiguration();

        System.out.println();

        officePC.displayConfiguration();
    }
}
