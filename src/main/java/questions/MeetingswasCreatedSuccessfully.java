package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import userinterface.MeetingsPage;


public class MeetingswasCreatedSuccessfully implements Question {

    private MeetingsPage meetingsPage;
    private String question;

    public MeetingswasCreatedSuccessfully(String nameReu) {
        this.question = nameReu;
    }

    public static MeetingswasCreatedSuccessfully inThe(String nameReu) {
        return new MeetingswasCreatedSuccessfully(nameReu);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameReu = BrowseTheWeb.as(actor).find(meetingsPage.txtMeetingName(question)).getText();
        return question.equals(nameReu);
    }
}
