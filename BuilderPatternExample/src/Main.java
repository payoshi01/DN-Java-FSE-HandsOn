package BuilderPatternExample.src;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam("16 GB")
                .setStorage("1 TB SSD")
                .build();

        computer.display();
    }
}
