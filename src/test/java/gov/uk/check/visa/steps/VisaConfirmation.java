package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmation {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on Start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select Nationality Australia")
    public void iSelectNationalityAustralia() {
        new SelectNationalityPage().selectNationality("Colombia");

    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select reason Tourism")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().selectReasonForVisit("Tourism or visiting family and friends");
    }



    @Then("I verify the result You will not need a visa to come to the UK")
    public void iVerifyTheResultYouWillNotNeedAVisaToComeToTheUK() {
        new ResultPage().confirmResultMessage("You will not need a visa to come to the UK");
    }




    @And("I select Nationality Chile")
    public void iSelectNationalityChile() {
        new SelectNationalityPage().selectNationality("Chile");
    }



    @And("I Select Reason work Academic visit or Business")
    public void iSelectReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().selectReasonForVisit("Work, academic visit or business");
    }

    @And("I select intended to stay for longer than {int} months")
    public void iSelectIntendedToStayForLongerThanMonths(int String) {
        new DurationOfStayPage().selectLengthOfStay("6 months or less");
    }

    @And("I select to work for Health and care Professional")
    public void iSelectToWorkForHealthAndCareProfessional() {
       new ReasonForTravelPage().selectReasonForVisit("Health and care professional");
    }

    @Then("I verify the result you need a visa to work in health and care")
    public void iVerifyTheResultYouNeedAVisaToWorkInHealthAndCare() {
        new ResultPage().confirmResultMessage("You need a visa to work in health and care");
    }



    @And("I select Nationality Colombia")
    public void iSelectNationalityColombia() {
        new SelectNationalityPage().selectNationality("Colombia");
    }


    @And("I select reason Join a partner or Family for long time")
    public void iSelectReasonJoinAPartnerOrFamilyForLongTime() {
    }

    @And("I Select state My partner of family member have uk immigration status yes")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {
    }

    @Then("I verify result you will need a visa to join your family or partner in the uk")
    public void iVerifyResultYouWillNeedAVisaToJoinYourFamilyOrPartnerInTheUk() {
    }



}
