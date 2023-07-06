package com.WebMath.Page;

import org.testng.Assert;

public class ReusableComponents extends OpenBrowser {

	public void logInfo(String message) {
		System.out.println("INFO: " + message);
	}

	public void clickOnMathForEveryone() {
		logInfo("clickOnMathForEveryone" + " execuation started");
		try {
			driver.findElement(ObjectRepository.mathForEveryone).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifymathForEveryonePageIsDisplayed() {
		logInfo("verifymathForEveryonePageIsDisplayed" + "execuation started");
		try {
			String textOfMathForEveryonedriver = driver.findElement(ObjectRepository.textOfMathForEveryone).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfMathForEveryonedriver, "Math for Everyone");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickOnChooseMathHelpItemDropdown() {
		logInfo("clickOnChooseMathHelpItemDropdown" + " execuation started");
		try {
			driver.findElement(ObjectRepository.chooseMathHelpItemDropdown).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickOnGoButton() {
		logInfo("clickOnGoButton" + " execuation started");
		try {
			driver.findElement(ObjectRepository.goButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyHomePageIsDisplayed() {
		logInfo("verifymathForEveryonePageIsDisplayed" + "execuation started");
		try {
			String textOfHomepagedriver = driver.findElement(ObjectRepository.textFromHomePage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfHomepagedriver, "Welcome to Webmath!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickOnFiguringATip() {
		logInfo("clickOnFiguringATip" + " execuation started");
		try {
			driver.findElement(ObjectRepository.figuringATip).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyTipCalCulatorIsDisplayed() {
		logInfo("verifyTipCalCulatorIsDisplayed" + "execuation started");
		try {
			String textOfFiguringATipdriver = driver.findElement(ObjectRepository.textFromTipCalculator).getText();
			// Thread.sleep(3000);
			Assert.assertEquals(textOfFiguringATipdriver, "Tip Calculator");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickOnSalePrice() {
		logInfo("clickOnSalePrice" + " execuation started");
		try {
			driver.findElement(ObjectRepository.salePrice).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifysalePriceCalculatorIsDisplayed() {
		logInfo("verifysalePriceCalculatorIsDisplayed" + "execuation started");
		try {
			String textOfSalePricedriver = driver.findElement(ObjectRepository.textFromSalePriceCalculator).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfSalePricedriver, "Calculate the Sale Price of an Item on Sale");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnWindChill() {
		logInfo("clickOnWindChill" + " execuation started");
		try {
			driver.findElement(ObjectRepository.windChill).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyWinDChillIsDisplayed() {
		logInfo("verifyWinDChillIsDisplayed" + "execuation started");
		try {
			String textOfWindChilldriver = driver.findElement(ObjectRepository.textFromWindChillTemperature).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfWindChilldriver, "Calculate Windchill Temperature");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnCountCoins() {
		logInfo("clickOnCountCoins" + " execuation started");
		try {
			driver.findElement(ObjectRepository.countCoins).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyCountCoinsIsDisplayed() {
		logInfo("verifyCountCoinsIsDisplayed" + "execuation started");
		try {
			String textOfCountCoinsdriver = driver.findElement(ObjectRepository.textFromCountCoinsPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfCountCoinsdriver, "Help with Counting U.S. Coins");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnLotteryOdds() {
		logInfo("clickOnLotteryOdds" + " execuation started");
		try {
			driver.findElement(ObjectRepository.lotteryOdds).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyLotteryOddsIsDisplayed() {
		logInfo("verifyLotteryOddsIsDisplayed" + "execuation started");
		try {
			String textOfLotteryOddsdriver = driver.findElement(ObjectRepository.textFromLotteryOddsPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfLotteryOddsdriver, "Calculate Your Chance of Winning the Lottery");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnSimpleInterest() {
		logInfo("clickOnSimpleInterest" + " execuation started");
		try {
			driver.findElement(ObjectRepository.simpleInterest).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifySimpleInterestIsDisplayed() {
		logInfo("verifySimpleInterestIsDisplayed" + "execuation started");
		try {
			String textOfSimpleInterestdriver = driver.findElement(ObjectRepository.textFromSimpleInterestCalculator)
					.getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfSimpleInterestdriver, "Simple Interest Calculator");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickOnCompoundInterest() {
		logInfo("clickOnCompoundInterest" + " execuation started");
		try {
			driver.findElement(ObjectRepository.compoundInterest).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyCompoundInterestIsDisplayed() {
		logInfo("verifyCompoundInterestIsDisplayed" + "execuation started");
		try {
			String textOfCompoundInterestdriver = driver
					.findElement(ObjectRepository.textFromCompoundInterestCalculator).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfCompoundInterestdriver, "Compound Interest Calculator");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickOnRetirement() {
		logInfo("clickOnRetirement" + " execuation started");
		try {
			driver.findElement(ObjectRepository.retirement).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyRetirementIsDisplayed() {
		logInfo("verifyRetirementIsDisplayed" + "execuation started");
		try {
			String textOfRetirementdriver = driver.findElement(ObjectRepository.textFromRetirementPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfRetirementdriver, "Retirement Investment Calculator");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickOnALoan() {
		logInfo("clickOnALoan" + " execuation started");
		try {
			driver.findElement(ObjectRepository.aLoan).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyALoanIsDisplayed() {
		logInfo("verifyALoanIsDisplayed" + "execuation started");
		try {
			String textOfALoandriver = driver.findElement(ObjectRepository.textFromALoanPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfALoandriver, "Amortization Schedule for a Loan");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnLength() {
		logInfo("clickOnLength" + " execuation started");
		try {
			driver.findElement(ObjectRepository.length).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyLengthIsDisplayed() {
		logInfo("verifyLengthDisplayed" + "execuation started");
		try {
			String textOfLengthdriver = driver.findElement(ObjectRepository.textFromLengthPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfLengthdriver, "Units Conversions on Lengths");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnMass() {
		logInfo("clickOnMass" + " execuation started");
		try {
			driver.findElement(ObjectRepository.mass).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyMassIsDisplayed() {
		logInfo("verifyMassDisplayed" + "execuation started");
		try {
			String textOfMassdriver = driver.findElement(ObjectRepository.textFromMassPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfMassdriver, "Units Conversions on Masses");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnArea() {
		logInfo("clickOnArea" + " execuation started");
		try {
			driver.findElement(ObjectRepository.area).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyAreaIsDisplayed() {
		logInfo("verifyAreaDisplayed" + "execuation started");
		try {
			String textOfAreadriver = driver.findElement(ObjectRepository.textFromAreaPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfAreadriver, "Units Conversions on Areas");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnVolume() {
		logInfo("clickOnVolume" + " execuation started");
		try {
			driver.findElement(ObjectRepository.volume).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyVolumeIsDisplayed() {
		logInfo("verifyVolumeIsDisplayed" + "execuation started");
		try {
			String textOfVolumedriver = driver.findElement(ObjectRepository.textFromVolumePage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfVolumedriver, "Units Conversions on Volumes");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnSpeed() {
		logInfo("clickOnSpeed" + " execuation started");
		try {
			driver.findElement(ObjectRepository.speed).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifySpeedIsDisplayed() {
		logInfo("verifySpeedIsDisplayed" + " execuation started");
		try {
			String textOfSpeeddriver = driver.findElement(ObjectRepository.textFromSpeedPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfSpeeddriver, "Units Conversions on Speed");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnPower() {
		logInfo("clickOnpower" + " execuation started");
		try {
			driver.findElement(ObjectRepository.power).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyPowerIsDisplayed() {
		logInfo("verifyPowerIsDisplayed" + "execuation started");
		try {
			String textOfPowerdriver = driver.findElement(ObjectRepository.textFromPowerPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfPowerdriver, "Units Conversions on Power");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnTemps() {
		logInfo("clickOnTemps" + " execuation started");
		try {
			driver.findElement(ObjectRepository.temps).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyTempsIsDisplayed() {
		logInfo("verifyTempsIsDisplayed" + "execuation started");
		try {
			String textOfTempsdriver = driver.findElement(ObjectRepository.textFromTempsPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfTempsdriver, "Convert temperature Scales");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnCostOfElectricity() {
		logInfo("clickOnCostOfElectricity" + " execuation started");
		try {
			driver.findElement(ObjectRepository.costOfElectricity).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyCostOfElectricityIsDisplayed() {
		logInfo("verifyCostOfElectricityIsDisplayed" + "execuation started");
		try {
			String textOfCostOfElectricitydriver = driver.findElement(ObjectRepository.textFromCostOfElectricityPage)
					.getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfCostOfElectricitydriver, "Calculate the Costs to Use Electricity");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnWeightOnAnotherPlanet() {
		logInfo("clickOnWeightOnAnotherPlanet?" + " execuation started");
		try {
			driver.findElement(ObjectRepository.weightOnAnotherPlanet).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyWeightOnANotherPlanetIsDisplayed() {
		logInfo("verifyWeightOnAnotherPlanetIsDisplayed" + "execuation started");
		try {
			String textOfWeightOnAnotherPlanetdriver = driver
					.findElement(ObjectRepository.textFromWeightOnAnotherPLanetCalculator).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfWeightOnAnotherPlanetdriver, "Calculate Weight on Another Planet");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnHomeInFooter() {
		logInfo("clickOnHomeInFooter" + " execuation started");
		try {
			driver.findElement(ObjectRepository.homeInFooter).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyHomeInFooterIsDisplayed() {
		logInfo("verifyHomeInFooterIsDisplayed" + "execuation started");
		try {
			String textOfHomeInFooterdriver = driver.findElement(ObjectRepository.textFromHomePage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfHomeInFooterdriver, "Welcome to Webmath!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnContactUs() {
		logInfo("clickOnContactUs" + " execuation started");
		try {
			driver.findElement(ObjectRepository.contactUs).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyContactUsIsDisplayed() {
		logInfo("verifyContactUsIsDisplayed" + "execuation started");
		try {
			String textOfContactUsdriver = driver.findElement(ObjectRepository.textFromContactPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfContactUsdriver, "Contact Information");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnAboutWebmath() {
		logInfo("clickOnAboutWebmath" + " execuation started");
		try {
			driver.findElement(ObjectRepository.aboutWebMath).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyAboutWebmathIsDisplayed() {
		logInfo("verifyAboutWebmathIsDisplayed" + "execuation started");
		try {
			String textOfAboutWebmathdriver = driver.findElement(ObjectRepository.textFromAboutWebMathPage).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfAboutWebmathdriver, "What is WebMath?");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnWhyWebmath() {
		logInfo("clickOnWhyWebmath" + " execuation started");
		try {
			driver.findElement(ObjectRepository.whyWebMath).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyWhyWebmathIsDisplayed() {
		logInfo("verifyWhyWebmathIsDisplayed" + "execuation started");
		try {
			String textOfWhyWebmathdriver = driver.findElement(ObjectRepository.textFromWhyWebMath).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfWhyWebmathdriver, "Why Webmath?");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnWebsiteMap() {
		logInfo("clickOnWebsiteMap" + " execuation started");
		try {
			driver.findElement(ObjectRepository.websiteMap).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyWebsiteMapIsDisplayed() {
		logInfo("verifyWebsiteMapIsDisplayed" + "execuation started");
		try {
			String textOfWebsiteMapdriver = driver.findElement(ObjectRepository.textFromWebsiteMap).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfWebsiteMapdriver, "Website Map");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnPrivacyPolicy() {
		logInfo("clickOnPrivacyPolicy" + " execuation started");
		try {
			driver.findElement(ObjectRepository.privacyPolicy).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyPrivacyPolicyIsDisplayed() {
		logInfo("verifyPrivacyPolicyIsDisplayed" + "execuation started");
		try {
			String textOfPrivacyPolicydriver = driver.findElement(ObjectRepository.textFromPrivacyPolicy).getText();
			Thread.sleep(3000);
			Assert.assertEquals(textOfPrivacyPolicydriver, "Privacy Policy");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
