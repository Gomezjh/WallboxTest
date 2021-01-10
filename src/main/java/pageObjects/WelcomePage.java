package pageObjects;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomePage extends BaseTest {

    @AndroidFindBy (id = "com.wallbox:id/btnNext")
    private  MobileElement nextBtn;

    @AndroidFindBy (id = "com.wallbox:id/btnClose")
    private  MobileElement closeBtn;

    @AndroidFindBy (id = "com.wallbox:id/lblOnboardingTitle")
    private  MobileElement welcomeTxt;

    

    public String  getWelcomeTxt (){
        return getAttribute(welcomeTxt,"text");
    }

}


