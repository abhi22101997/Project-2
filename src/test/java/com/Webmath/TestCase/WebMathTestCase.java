package com.Webmath.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.WebMath.Page.OpenBrowser;
import com.WebMath.Page.ReusableComponents;

public class WebMathTestCase extends ReusableComponents {
	OpenBrowser lp;

	@BeforeMethod
	public void browsersetup() {
		lp = new OpenBrowser();
		lp.intialization("chrome");
	}

	@Test
	public void logintest() {
		clickOnMathForEveryone();
		verifymathForEveryonePageIsDisplayed();
		clickOnChooseMathHelpItemDropdown();
		clickOnGoButton();
		verifyHomePageIsDisplayed();
		clickOnMathForEveryone();
		clickOnFiguringATip();
		verifyTipCalCulatorIsDisplayed();
		clickOnMathForEveryone();
		clickOnSalePrice();
		verifysalePriceCalculatorIsDisplayed();
		clickOnMathForEveryone();
		clickOnWindChill();
		verifyWinDChillIsDisplayed();
		clickOnMathForEveryone();
		clickOnCountCoins();
		verifyCountCoinsIsDisplayed();
		clickOnMathForEveryone();
		clickOnLotteryOdds();
		verifyLotteryOddsIsDisplayed();
		clickOnMathForEveryone();
		clickOnSimpleInterest();
		verifySimpleInterestIsDisplayed();
		clickOnMathForEveryone();
		clickOnCompoundInterest();
		verifyCompoundInterestIsDisplayed();
		clickOnMathForEveryone();
		clickOnRetirement();
		verifyRetirementIsDisplayed();
		clickOnMathForEveryone();
		clickOnALoan();
		verifyALoanIsDisplayed();
		clickOnMathForEveryone();
		clickOnLength();
		verifyLengthIsDisplayed();
		clickOnMathForEveryone();
		clickOnMass();
		verifyMassIsDisplayed();
		clickOnMathForEveryone();
		clickOnArea();
		verifyAreaIsDisplayed();
		clickOnMathForEveryone();
		clickOnVolume();
		verifyVolumeIsDisplayed();
		clickOnMathForEveryone();
		clickOnSpeed();
		verifySpeedIsDisplayed();
		clickOnMathForEveryone();
		clickOnPower();
		verifyPowerIsDisplayed();
		clickOnMathForEveryone();
		clickOnTemps();
		verifyTempsIsDisplayed();
		clickOnMathForEveryone();
		clickOnCostOfElectricity();
		verifyCostOfElectricityIsDisplayed();
		clickOnMathForEveryone();
		clickOnWeightOnAnotherPlanet();
		verifyWeightOnANotherPlanetIsDisplayed();
		clickOnMathForEveryone();
		clickOnHomeInFooter();
		verifyHomeInFooterIsDisplayed();
		clickOnMathForEveryone();
		clickOnContactUs();
		verifyContactUsIsDisplayed();
		clickOnMathForEveryone();
		clickOnAboutWebmath();
		verifyAboutWebmathIsDisplayed();
		clickOnMathForEveryone();
		clickOnWhyWebmath();
		verifyWhyWebmathIsDisplayed();
		clickOnMathForEveryone();
		clickOnWebsiteMap();
		verifyWebsiteMapIsDisplayed();
		clickOnMathForEveryone();
		clickOnPrivacyPolicy();
		verifyPrivacyPolicyIsDisplayed();

	}

	@AfterMethod
	public void closebrowser() {
		lp.teardown();
	}

}
