public class BuilderTest {

    public static void main(String[] args) {

        Computer computer = new ComputerBuilder()
                .setCpu("Intel i7")
                .setRam("16 GB")
                .setStorage("512 GB SSD")
                .build();

        computer.showDetails();
    }
}