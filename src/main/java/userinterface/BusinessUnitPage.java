package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusinessUnitPage extends PageObject {
    public static final Target A_ORGANITATION = Target.the("menu organization").located(By.xpath("//span[contains(text(),'Organization')]//parent::a"));
    public static final Target A_BUSSINES_UNITS = Target.the("menu Business Units ").located(By.xpath("//span[contains(text(),'Business Units')]//parent::a"));
    public static final Target BTN_NEW_BUSSINESS = Target.the("add new Business").located(By.xpath("//span[contains(text(),'New Business Unit')]//parent::span[@class='button-inner']"));
    public static final Target INP_NAME = Target.the("send name").located(By.xpath("//input[@name='Name']"));
    public static final Target SELEC_PARENT_UNIT = Target.the("Select type parent unit").located(By.xpath("//div[@id='s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId']"));
    public static final Target INP_SEND_PARENT = Target.the("send type parent unit").located(By.xpath("//input[@id='s2id_autogen1_search']"));
    public static final Target BTN_SAVE = Target.the("Save bussiness units").located(By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']"));
    public static final Target BTN_REFRESH = Target.the("Refresh page").located(By.xpath("//div[contains(@class,'refresh-button')]"));

    public static By txtMeetingName(String strText) {
        return By.xpath("//a[contains(text(),'" + strText + "')]");
    }

}
