package com.cg.java8.DesignPatterns;

//Product
class Computer {
	
	private String cpu;
	private String ram;
	private String storage;
	
    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setRAM(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
	
	public void displayInfo() {
		System.out.println("Computer Configuration:\n" +
                "CPU: " + cpu + "\n" +
                "RAM: " + ram + "\n" +
                "Storage: " + storage + "\n");
		
	}

}

//Builder interface
interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}

//ConcreteBuilder
class GamingComputerBuilder implements Builder {

    private Computer computer = new Computer();

    public void buildCPU() {
        computer.setCPU("Gaming CPU");
    }

    public void buildRAM() {
        computer.setRAM("16GB DDR4");
    }

    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    public Computer getResult() {
        return computer;
    }
	
}


class ComputerDirector {

	public void construct(GamingComputerBuilder gamingBuilder) {
		gamingBuilder.buildCPU();
		gamingBuilder.buildRAM();
		gamingBuilder.buildStorage();
	}

}


public class C_BuilderMethod_DesignPattern2 {

	public static void main(String[] args) {
		GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
		ComputerDirector director = new ComputerDirector();

		director.construct(gamingBuilder);
		Computer gamingComputer = gamingBuilder.getResult();

		gamingComputer.displayInfo();

	}

}
