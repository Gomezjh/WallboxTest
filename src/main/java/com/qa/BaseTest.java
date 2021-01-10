package com.qa;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {


    public static AndroidDriver<AndroidElement> driver;

    public BaseTest(){

        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void  waitForVisibility(MobileElement e ){
        WebDriverWait wait = new WebDriverWait(driver,TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public  void  click(MobileElement e){
        waitForVisibility(e);
        e.click();
    }

    public void sendKeys(MobileElement e, String txt){
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public String  getAttribute(MobileElement e, String attribute){
        waitForVisibility(e);
         return e.getAttribute(attribute);
    }

}
