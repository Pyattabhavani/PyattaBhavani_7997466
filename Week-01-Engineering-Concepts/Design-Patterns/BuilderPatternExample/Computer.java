public class Computer {

    private String cpu;
    private String ram;
    private String storage;

    public Computer(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public void showDetails() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
    }
}