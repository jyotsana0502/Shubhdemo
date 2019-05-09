package beans;

import java.util.Properties;
import java.util.Set;

public class Car {
	private Properties driver;

	public void getDriver() {
		Set s= driver.keySet();
		for(Object k:s)
		{
			System.out.println(driver.getProperty(k.toString()));
		}
		System.out.println(); 
	}

	public void setDriver(Properties driver) {
		this.driver = driver;
	}
}
