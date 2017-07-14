package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BasePage;

public class LeaseEntryHomePage extends BasePage
{
	@FindBy(id="ctl00_NB_PH_UCLeaseEntyLink_cboBookingStatus")
	private WebElement leaseBookingStatus;
	
	@FindBy(id="ctl00_NB_PH_UCLeaseEntyLink_cmdInvestment")
	private WebElement investmentScreen;
	
	@FindBy(id="ctl00_NB_PH_UCLeaseEntyLink_cmdStructure")
	private WebElement structureScreen;

	@FindBy(id="ctl00_NB_PH_UCLeaseEntyLink_cmdSave_cmdButtonControl")
	private WebElement saveButton;

	public LeaseEntryHomePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnStructureScreen()
	{
		WebDriverWait wt= new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.titleContains("Lease Entry Home"));
		structureScreen.click();
	}
	
	public void clickOnInvestmentScreen()
	{
		WebDriverWait wt= new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.titleContains("Lease Entry Home"));
		System.out.println(driver.getTitle());
		investmentScreen.click();
	}
	
	public void selectLeaseBookingStatus()
	{
		WebDriverWait wt= new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.titleContains("Lease Entry Home"));
		Select se=new Select(leaseBookingStatus);
		se.selectByIndex(1);
	}
	
	public void clickOnSaveButton() throws InterruptedException
	{
		WebDriverWait wt=new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.titleIs("Lease Entry Home"));
		saveButton.click();
	}
	
	
	public void handlePopup1()
	{
		for (int i=1;i<=3;i++)
		{
			try
			{
				WebDriverWait wt=new WebDriverWait(driver, 10);
				wt.until(ExpectedConditions.alertIsPresent());
				Alert alert = driver.switchTo().alert();
				alert.accept();
			}
			catch (Exception e)
			{
				
			}
		}
		
	}
//	
//	public void handlePopup2()
//	{
//		try
//		{
//			WebDriverWait wt=new WebDriverWait(driver, 10);
//			wt.until(ExpectedConditions.alertIsPresent());
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
//		}
//		catch (Exception e)
//		{
//			
//		}
//	}
	
	
	

}