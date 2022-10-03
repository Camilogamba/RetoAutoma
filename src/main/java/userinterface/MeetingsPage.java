package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MeetingsPage extends PageObject {
    public static final Target A_MEETING = Target.the("menu meeting").located(By.xpath("(//span[contains(text(),'Meeting')]//parent::a)[1]"));
    public static final Target A_MEETINGS_SUB = Target.the("menu meetings").located(By.xpath("(//span[contains(text(),'Meetings')]//parent::a)[1]"));
    public static final Target BTN_NEW_MEETING = Target.the("Create new neeting").located(By.xpath("//span[contains(text(),' New Meeting')]//parent::span[@class='button-inner']"));
    public static final Target INP_NAME = Target.the("Send name meeting").located(By.xpath("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']"));
    public static final Target MEET_TYPE = Target.the("Type meeting").located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId']//a"));
    public static final Target INP_MEETING_TYPE = Target.the("Send type meeting").located(By.xpath("//div[@class='select2-search']//input[@id='s2id_autogen6_search']"));
    public static final Target INP_MEETING_NUMBER = Target.the("Number meeting").located(By.xpath("//input[@name='MeetingNumber']"));
    public static final Target INP_STAR_DATE = Target.the("start date").located(By.xpath("//input[@name='StartDate']"));
    public static final Target INP_STAR_HOUR = Target.the("start hour").located(By.xpath("//div[contains(@class,'StartDate')]//select"));
    public static final Target INP_END_DATE = Target.the("end date").located(By.xpath("//input[@name='EndDate']"));
    public static final Target INP_END_HOUR = Target.the("end hour").located(By.xpath("//div[contains(@class,'EndDate')]//select"));
    public static final Target SEL_LOCATION = Target.the("location").located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId']//a"));
    public static final Target INP_LOCATION = Target.the("send location").located(By.xpath("//input[@id='s2id_autogen7_search']"));
    public static final Target SEL_UNIT = Target.the("unit").located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId']//a"));
    public static final Target INP_UNIT = Target.the("send unit").located(By.xpath("//input[@id='s2id_autogen8_search']"));
    public static final Target SEL_ORGANIZED = Target.the("Organized by").located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId']//a"));
    public static final Target INP_ORGANIZED = Target.the("Send organize by").located(By.xpath("//input[@id='s2id_autogen9_search']"));
    public static final Target SEL_REPORTER = Target.the("Reporter").located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId']//a"));
    public static final Target INP_REPORTER = Target.the("Send reporter").located(By.xpath("//input[@id='s2id_autogen10_search']"));
    public static final Target SEL_ATTENDEE = Target.the("Attendee").located(By.xpath("//div[@id='s2id_autogen11']//a"));
    public static final Target INP_ATTENDEE = Target.the("Send attendee").located(By.xpath("//input[@id='s2id_autogen12_search']"));
    public static final Target BTN_SAVE = Target.the("Save meetong").located(By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']"));

    public static By txtMeetingName(String strText) {
        return By.xpath("//a[@class='s-EditLink s-Pro-Meeting-MeetingLink' and contains(text(),'" + strText + "')]");
    }
}
