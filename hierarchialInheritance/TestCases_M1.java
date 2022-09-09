package hierarchialInheritance;

import org.junit.Test;

import simpleInheritance.ReusableComponents;
          //    Child               Parent
public class TestCases_M1 extends ReusableComponents {
	
	@Test
	public void ForwardAnEmail()
	{
		//launch, login, open, reply, logout, close
		System.out.println("Test case : ForwardAnEmail");
		System.out.println("Test case : ComposeAndSendAnEmail");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
		//Launch process Selenium code
				//Open browser
				//Call url
				//Maximize
				//Title validation
				//Check url
			
	}
	@Test
	public void DeleteAnEmail()
	{
		//launch, login, open, delete, logout, close
		System.out.println("Test case : DeleteAnEmail");
		System.out.println("Test case : ComposeAndSendAnEmail");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
		//Launch process Selenium code
				//Open browser
				//Call url
				//Maximize
				//Title validation
				//Check url
		
			
	}
	

}
