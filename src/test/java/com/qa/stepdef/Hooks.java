package com.qa.stepdef;

import com.qa.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks extends BaseTest {

    private  BaseTest base;
    public Hooks(BaseTest base){
        this.base = base;
    }

    @Before
    public  void  InitializeTest() throws MalformedURLException {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName","emulator-5554");
            caps.setCapability("platforName","android");
            caps.setCapability("appPackage","com.wallbox");
            caps.setCapability("appActivity",".splash.presentation.SplashActivity");

            caps.setCapability("app","D:\\WallboxTest\\src\\test\\resources\\app\\wallbox_2020.12.17.apk");

            URL url = new URL("http://0.0.0.0:4723/wd/hub");
            base.driver = new AndroidDriver(url,caps);
            base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @After
    public void  TearDownTest(){
        base.driver.quit();

    }
}
