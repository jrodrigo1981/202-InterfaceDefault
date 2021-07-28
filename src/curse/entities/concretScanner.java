package curse.entities;

public class concretScanner extends Device implements Scanner{

	public concretScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
		
	}
	
	@Override
	public String scan() {
		return "Scanned content";
	}
	
	
	

}
