package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import userinterface.BusinessUnitPage;

public class RecordwasCreatedSuccessfully implements Question {

    BusinessUnitPage businessUnitPage;

    private String question;

    public RecordwasCreatedSuccessfully(String registration) {
        this.question = registration;
    }

    public static RecordwasCreatedSuccessfully inThe(String registration) {
        return new RecordwasCreatedSuccessfully(registration);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameReu = BrowseTheWeb.as(actor).find(businessUnitPage.txtMeetingName(question)).getText();
        return question.equals(nameReu);

    }
}
