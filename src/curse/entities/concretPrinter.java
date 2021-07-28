package curse.entities;

public class concretPrinter extends Device implements Printer{
	
	public concretPrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
		
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}

	
	
	
	
	

}
