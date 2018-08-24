import pattern.SeleniumDriver;

public class Main {

	public static void main(String[] args) {
		SeleniumDriver driver1 = SeleniumDriver.getInstance();
		driver1.setName("chrome");
		
		SeleniumDriver driver2 = SeleniumDriver.getInstance();
		driver2.setName("firefox");
		
		System.out.println(driver1.getName()); // output --> firefox
		System.out.println(driver2.getName()); // output --> firefox
		
	}

}
