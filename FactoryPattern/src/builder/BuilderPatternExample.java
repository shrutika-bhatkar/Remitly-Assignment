package builder;


//Product class
class Computer {
 private String cpu;
 private String ram;
 private String storage;
 private String gpu;

 public Computer(String cpu, String ram, String storage, String gpu) {
     this.cpu = cpu;
     this.ram = ram;
     this.storage = storage;
     this.gpu = gpu;
 }

 @Override
 public String toString() {
     return "Computer{" +
             "cpu='" + cpu + '\'' +
             ", ram='" + ram + '\'' +
             ", storage='" + storage + '\'' +
             ", gpu='" + gpu + '\'' +
             '}';
 }
}

//Builder interface
interface ComputerBuilder {
 ComputerBuilder setCpu(String cpu);
 ComputerBuilder setRam(String ram);
 ComputerBuilder setStorage(String storage);
 ComputerBuilder setGpu(String gpu);
 Computer build();
}

//Concrete builder
class DesktopBuilder implements ComputerBuilder {
 private String cpu;
 private String ram;
 private String storage;
 private String gpu;

 @Override
 public ComputerBuilder setCpu(String cpu) {
     this.cpu = cpu;
     return this;
 }

 @Override
 public ComputerBuilder setRam(String ram) {
     this.ram = ram;
     return this;
 }

 @Override
 public ComputerBuilder setStorage(String storage) {
     this.storage = storage;
     return this;
 }

 @Override
 public ComputerBuilder setGpu(String gpu) {
     this.gpu = gpu;
     return this;
 }

 @Override
 public Computer build() {
     return new Computer(cpu, ram, storage, gpu);
 }
}

//Director class (optional)
class ComputerDirector {
 public Computer buildDesktop(ComputerBuilder builder) {
     return builder
             .setCpu("Intel i7")
             .setRam("16GB")
             .setStorage("512GB SSD")
             .setGpu("NVIDIA GTX 1660")
             .build();
 }
}

//Client Code
public class BuilderPatternExample {

	
	public static void main(String[] args) {
        // Creating a desktop computer using the builder
        ComputerBuilder desktopBuilder = new DesktopBuilder();
        ComputerDirector director = new ComputerDirector();
        Computer desktop = director.buildDesktop(desktopBuilder);

        // Printing the details of the created computer
        System.out.println(desktop);
    }
	
	
	
}
