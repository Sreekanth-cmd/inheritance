package hierarchialInheritance;

import org.junit.Test;

import simpleInheritance.ReusableComponents;
          //    Child               Parent
public class TestCases_M2 extends ReusableComponents {
	
	public void composeAndSend ()//default works with same package
	{
		//Step 1.1 : launch, Step 1.2 : login, Step 1.3 : compose, Step 1.4 : Send, Step 1.5 : logout step, Step 1.6 : Close
		//Launch process Selenium code
		//Open browser
		//Call url
		//Maximize
		//Title validation
		//Check url
		System.out.println("Test case : ComposeAndSendAnEmail");
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void replytoAnEmail()
	{
		//launch, login, open, reply, logout, close
		System.out.println("Test case : ReplytoAnEmail");
		System.out.println("Test case : ComposeAndSendAnEmail");
		launchApplication();
		loginToApplication();
		open();
		reply();
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
