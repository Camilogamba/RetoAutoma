package task;

import model.StarSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.LoginStarSharpPage;

public class Login implements Task {

    private LoginStarSharpPage loginStarSharpPage;
    private StarSharpData starSharpData;

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginStarSharpPage),
                Enter.theValue(starSharpData.getUsername()).into(LoginStarSharpPage.INP_USER),
                Enter.theValue(starSharpData.getPassword()).into(LoginStarSharpPage.INP_PASS),
                Click.on(LoginStarSharpPage.BTN_LOGIN));
    }

}
