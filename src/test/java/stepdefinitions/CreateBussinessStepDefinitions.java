package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.StarSharpData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.RecordwasCreatedSuccessfully;
import task.BusinessUnit;

import java.util.List;
import java.util.Map;

public class CreateBussinessStepDefinitions {
    StarSharpData starSharpData;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^he create a business unit$")
    public void heCreateABusinessUnit(List<Map<String, String>> tableStar) throws Exception {
        starSharpData.setTableStar(tableStar.get(0));
        OnStage.theActorInTheSpotlight().attemptsTo(BusinessUnit.create());
    }

    @Then("^a business unit \"([^\"]*)\" is successfully created$")
    public void aBusinessUnitIsSuccessfullyCreated(String registration) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RecordwasCreatedSuccessfully.inThe(registration)));
    }

}
