

class CPU
{
	float price;
	
	CPU(float price)
	{
		this.price = price;
	}
	
	void display()
	{
		System.out.println("\nPrice of the CPU : " + price);
	}
	
	class Processor
	{
		int core_count;
		String manufact;
		
		Processor(int core, String mf)
		{
			core_count = core;
			manufact = mf;
		}
		
		void display()
		{
			System.out.println("\nNo. of cores : " + core_count + "\nManufacturer of the processor : " + manufact);
		} 
		
	}
	
	static class RAM
	{
		int memory_size;
		String manufact;
		
		RAM(int size, String mf)
		{
			memory_size = size;
			manufact = mf;
		}
		
		void display()
		{
			System.out.println("\nSize of RAM : " + memory_size + " GB\nManufacturer of the RAM : " + manufact);
		} 
	}
	
	public static void main(String[] args)
	{
		System.out.println("\n**************************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 26/02/2024");
		System.out.println("Lab Cycle : 1");
		System.out.println("Program   : Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer) \nand static nested class RAM (memory, manufacturer).\n Create an object of CPU and print information of Processor and RAM.");
		System.out.println("****************************************************************************************************************************");
		
		CPU cpu = new CPU(45999);
		
		CPU.Processor processor = new CPU.Processor(8, "Intel");
		processor.display();
		
		cpu.RAM ram = new CPU.RAM(16, "Corsair");
		ram.display();
	}	
}
