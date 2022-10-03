package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import model.StarSharpData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.Login;

import java.util.List;
import java.util.Map;

public class LoginStepDefinition {

    StarSharpData starSharpData;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than john has an account in starsharp$")
    public void thanJohnHasAnAccountInStarsharp(List<Map<String, String>> tableStar) throws Exception {
        starSharpData.setTableStar(tableStar.get(0));
        OnStage.theActorCalled("john").wasAbleTo(Login.onThePage());
    }
}
