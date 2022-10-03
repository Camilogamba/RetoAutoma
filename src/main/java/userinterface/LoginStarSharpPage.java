package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo/")
public class LoginStarSharpPage extends PageObject {
    public static final Target INP_USER = Target.the("Input user login").located(By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Username']"));
    public static final Target INP_PASS = Target.the("Input user password").located(By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Password']"));
    public static final Target BTN_LOGIN = Target.the("button for login").located(By.xpath("//button[@id='StartSharp_Membership_LoginPanel0_LoginButton']"));
}
