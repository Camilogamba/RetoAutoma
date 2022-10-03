package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.StarSharpData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.MeetingswasCreatedSuccessfully;
import task.Meetings;

import java.util.List;
import java.util.Map;

public class CreateMeetingStepDefinitions {

    StarSharpData starSharpData;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("^he goes to meetings and schedules a meeting$")
    public void heGoesToMeetingsAndSchedulesAMeeting(List<Map<String, String>> tableStar) throws Exception {
        starSharpData.setTableStar(tableStar.get(0));
        OnStage.theActorInTheSpotlight().attemptsTo(Meetings.create());
    }

    @Then("^the meeting number \"([^\"]*)\" is created successfully$")
    public void theMeetingNumberIsCreatedSuccessfully(String nameReu) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MeetingswasCreatedSuccessfully.inThe(nameReu)));
    }
}
