package pageObjects;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BaseTest {

    @AndroidFindBy (id = "com.wallbox:id/edtEmail")
    private  MobileElement userNameTxtFld;

    @AndroidFindBy (id = "com.wallbox:id/edtPassword")
    private  MobileElement passwordTxtFld;

    @AndroidFindBy (id = "com.wallbox:id/btnEnter")
    private  MobileElement loginBtn;

    @AndroidFindBy (id = "com.wallbox:id/txtError")
    private  MobileElement messageError;



    public  LoginPage enterUserName(String userName){
        sendKeys(userNameTxtFld,userName);
        return this;
    }

    public  LoginPage enterPassword(String pass){
        sendKeys(passwordTxtFld,pass);
        return this;
    }

    public  String getErrorText(){
        return  getAttribute(messageError,"text");
    }

    public  WelcomePage pressLoginButton (){
        click(loginBtn);
        return new WelcomePage();
    }



}


