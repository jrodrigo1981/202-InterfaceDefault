package curse.application;



import curse.entities.ComboDevice;
import curse.entities.concretPrinter;
import curse.entities.concretScanner;

public class Program {

	public static void main(String[] args) {

		concretPrinter p = new concretPrinter("1080");
		p.processDoc("My letter");
		p.print("My letter");
		
		concretScanner s = new concretScanner("2003");
		s.processDoc("my email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());

	}

}
