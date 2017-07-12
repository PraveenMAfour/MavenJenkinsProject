package DemoTest.DemoMavenForJenkinsProject.com.demoaut.newtours.pages;

import DemoTest.DemoMavenForJenkinsProject.com.demoaut.newtours.objectRepo.Locators;
import DemoTest.DemoMavenForJenkinsProject.com.demoaut.newtours.utilities.SeleniumWrapper;

/*
 * FlightFinderPage class contains methods which perform action on flight finder page UI. 
 */
public class FlightFinderPage 
{
	private static SeleniumWrapper objSele;
	
	public FlightFinderPage()
	{
		objSele = new SeleniumWrapper();
	}
	
	public boolean verifyFlightDetailsDisplayedOrNot()
	{
		return objSele.isDisplayed(Locators.FLIGHTFINDERPAGE_FLIGHT_DETAILS);
	}
}
