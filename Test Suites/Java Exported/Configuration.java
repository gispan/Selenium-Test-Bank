package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Configuration {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://mirror-appcoin-production.herokuapp.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testConfiguration() throws Exception {
    String test_url = "http://test.appcoin.me/";
    String login = "#marketLogin";
    String mirror_url = "https://mirror-appcoin-production.herokuapp.com/";
    String levmarket = "market/instances/levmarket/app.html?";
    String market_url = test_url + levmarket + login;
    String gcp_url = test_url + "governor";
    String 1st_user_email = "first_iudijuy_first@tfbnw.net";
    String 1st_user_pass = "205390286";
    String 2nd_user_email = "second_sbkvbqx_second@tfbnw.net";
    String 2nd_user_pass = "141544251";
    String search_query = "second";
    String amount = "2";
    String message = "OMG";
    String itemTitle = "a rare t-shirt of wwf";
    String itemDescription = "Test Description item";
    String itemAmount = "3";
    String imageURL = "http://static.gamesradar.com/images/totalfilm/n/new-the-great-gatsby-trailer-showcases-stunning-soundtrack-131694-a-1365083346-470-75.jpg";

// Mati's Shit
String fb_url = "https://facebook.com";
String market_userA_name = "shalom lerner";
String market_userA_id = "5459189f3b1226020054e32b";
String fb_userA_email = "shalomlerner@hotmail.com";
String fb_userA_password = "shalom1234";
String fb_userA_id = "100006686707675";
String market_userB_name = "ravit shulman";
String market_userB_id = "5459189f3b1226020054e32b";
String fb_userB_email = "ravitshulman@gmail.com";
String fb_userB_password = "ravit1234";
String fb_userB_id = "100007006664471";
String gcp_user = "market_admin@appcoin.me";
String gcp_pass = "123456";
String levmarket_minter_name = "צוות לב מרקט";
String item1_name = "חולצה";
String wish1_name = "ספר";
String btn_login_guest = "id=anonymous_browsing_button";
String btn_login_fb = "id=facebook_login_button";
String btn_login_email = "id=email_login_button";
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
