package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VisaConfirmationTestSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickOnStartButton();
    }

    @And("I Select a Nationality {string}")
    public void iSelectANationalityAustralia(String country) {
        new SelectNationalityPage().selectNationality(country);
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I Select reason Tourism")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().selectReasonForAustralia();

    }

    @Then("verify result {string}")
    public void verifyResultYouWillNotNeedAVisaToComeToTheUK(String expectedMessage) {
        Assert.assertEquals(expectedMessage, new ResultPage().getResultMessageTourism());
    }

    @And("Select a Nationality {string}")
    public void selectANationalityChile(String country) {
        new SelectNationalityPage().selectNationality(country);
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        new ReasonForTravelPage().clickContinueButton();
    }

    @And("Select reason Work, academic visit or business")
    public void selectReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().selectReasonForChile();
    }
    @And("Select intendent to stay for longer than 6 months")
    public void selectIntendentToStayForLongerThanMonths() {
        new DurationOfStayPage().selectMoreThen6months();
    }


    @And("Select have planning to work for Health and care professional")
    public void selectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectJobType();
    }

  //  @Then("To verify result {string}")
   // public void toVerifyResultYouNeedAVisaToWorkInHealthAndCare(String expectedMessage) {
  //      Assert.assertEquals(expectedMessage, new ResultPage().getResultMessageHealthcare());
//    }


    @And("Select reason Join partner or family for a long stay")
    public void selectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().selectReasonForColombia();
    }
    @Then("To get verify result {string}")
    public void toGetVerifyResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK(String expectedMessage) {
        Assert.assertEquals(expectedMessage, new ResultPage().getResultMessageFamilyStay());
    }


    @Then("verify result of{string}")
    public void verifyResultOfYouNeedAVisaToWorkInHealthAndCare(String expectedMessage) {
        Assert.assertEquals(new ResultPage().getResultMessageHealthcare(),expectedMessage);
    }
}