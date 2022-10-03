package task;

import model.StarSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterface.BusinessUnitPage;

public class BusinessUnit implements Task {

    private BusinessUnitPage businessUnitPage;
    private StarSharpData starSharpData;

    public static BusinessUnit create() {
        return Tasks.instrumented(BusinessUnit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(businessUnitPage.A_ORGANITATION),
                Click.on(businessUnitPage.A_BUSSINES_UNITS),
                Click.on(businessUnitPage.BTN_NEW_BUSSINESS),
                Enter.theValue(starSharpData.getName()).into(businessUnitPage.INP_NAME),
                Click.on(businessUnitPage.SELEC_PARENT_UNIT),
                Enter.theValue(starSharpData.getParentUnit()).into(businessUnitPage.INP_SEND_PARENT).thenHit(Keys.ENTER),
                Click.on(businessUnitPage.BTN_SAVE),
                Click.on(businessUnitPage.BTN_REFRESH)
        );
    }

}