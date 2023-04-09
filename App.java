package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Welcome");
		
		logger.error("Shoot");
		
		Logger second = new SpacedLogger();
		
		second.log("Welcome");
		
		second.error("Shoot");
		

	}

}
