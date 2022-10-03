package task;

import model.StarSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import userinterface.BusinessUnitPage;
import userinterface.MeetingsPage;

public class Meetings implements Task {
    private MeetingsPage meetingsPage;
    private StarSharpData starSharpData;
    private BusinessUnitPage businessUnitPage;

    public static Meetings create() {

        return Tasks.instrumented(Meetings.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(meetingsPage.A_MEETING),
                Click.on(meetingsPage.A_MEETINGS_SUB),
                Click.on(meetingsPage.BTN_NEW_MEETING),
                Enter.theValue(starSharpData.getNameReu()).into(meetingsPage.INP_NAME),
                Click.on(meetingsPage.MEET_TYPE),
                Enter.theValue(starSharpData.getType()).into(meetingsPage.INP_MEETING_TYPE).thenHit(Keys.ENTER),
                Enter.theValue(starSharpData.getNumber()).into(meetingsPage.INP_MEETING_NUMBER),
                Enter.theValue(starSharpData.getStarDate()).into(meetingsPage.INP_STAR_DATE).thenHit(Keys.ENTER),
                SelectFromOptions.byValue(starSharpData.getStarHour()).from(meetingsPage.INP_STAR_HOUR),
                Enter.theValue(starSharpData.getEndDate()).into(meetingsPage.INP_END_DATE).thenHit(Keys.ENTER),
                SelectFromOptions.byValue(starSharpData.getEndHour()).from(meetingsPage.INP_END_HOUR),
                Click.on(meetingsPage.SEL_LOCATION),
                Enter.theValue(starSharpData.getLocation()).into(meetingsPage.INP_LOCATION).thenHit(Keys.ENTER),
                Click.on(meetingsPage.SEL_UNIT),
                Enter.theValue(starSharpData.getUnit()).into(meetingsPage.INP_UNIT).thenHit(Keys.ENTER),
                Click.on(meetingsPage.SEL_ORGANIZED),
                Enter.theValue(starSharpData.getOrganized()).into(meetingsPage.INP_ORGANIZED).thenHit(Keys.ENTER),
                Click.on(meetingsPage.SEL_REPORTER),
                Enter.theValue(starSharpData.getReporter()).into(meetingsPage.INP_REPORTER).thenHit(Keys.ENTER),
                Click.on(meetingsPage.SEL_ATTENDEE),
                Enter.theValue(starSharpData.getContact()).into(meetingsPage.INP_ATTENDEE).thenHit(Keys.ENTER),
                Click.on(meetingsPage.BTN_SAVE)
        );
    }

}