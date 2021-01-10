# WallboxTest

Appium  BDD Framework for Android Mobile Testing

Page Object Model and Page Factory

Steps to execute the tests

1. Add the APK in the following Directory  "/src/test/resources/app/**wallbox_2020.12.17.apk**"
2. Modify the following Capabilities as needed in the **Hooks.java** class  "src/test/java/com/qa/stepdef/**Hooks.java**"

    "devicename" -> "Name of the emulator or physical device"  
    "app"        -> "Absolute Path od the APK"
3. Start Appium Server
4. Start Emulator or connect physical device
5. Execute in the terminal: 

      -mvn compile
      
      -mvn test
      
6.After each execution an html report will be generated in "Target" Folder as "cucumber-pretty.html"
