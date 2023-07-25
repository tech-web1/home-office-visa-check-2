package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage  extends Utility {

    private static final Logger log= LogManager.getLogger(DurationOfStayPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;

    //(Note: use switch statement for select moreOrLess stay)

    public void selectLengthOfStay(String moreOrLess)
    {
        switch (moreOrLess)
        {
            case "6 months or less":
                clickOnElement(lessThanSixMonths);
                clickOnElement(nextStepButton);
                break;
            case "longer than 6 months":
                clickOnElement(moreThanSixMonths);
                clickOnElement(nextStepButton);
                break;
        }
    }
    public void clickNextStepButton(){
        clearTextOnElement(nextStepButton);
    }

    private void clearTextOnElement(WebElement nextStepButton) {
    }
}
