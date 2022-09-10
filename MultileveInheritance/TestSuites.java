package MultileveInheritance;

import org.junit.Test;

import simpleInheritance.TestCases;
//             Child             Parent          GrandParent : Child inherits grand parent automatically
public class TestSuites extends TestCases   //Extend ReusableComponents 
{ 
    @Test
	public void smokeSuite()
	{
		System.out.println("TestSuite : SMOKE");
		composeAndSend();
		replytoAnEmail();
		
		
	}
    @Test
	public void regressionSuite()
	{
		System.out.println("TestSuite : REGRESSION");
		composeAndSend();
		replytoAnEmail();
		ForwardAnEmail();
		DeleteAnEmail();
		
	}

}
//did changes from git directly

