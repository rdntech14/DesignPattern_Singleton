package pattern;

public class SeleniumDriver {

	public static SeleniumDriver driver;
	public String name;

	//private constructor
	private SeleniumDriver() {

	}

	// return one instance
	public static SeleniumDriver getInstance() {
		if (driver == null) {
			driver = new SeleniumDriver();
		}
		return driver;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
