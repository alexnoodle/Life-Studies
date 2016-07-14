import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		Simulator a = new Simulator();
		a.run();
		a.saveMap();
		

		
		
		
		
		System.out.println("Done");
	}
}
