package Ciklum;

import Ciklum.pages.LoginPage;
import Ciklum.pages.MainPage;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ciklum.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;
  private MainPage mainPage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @BeforeClass
  public void login() {
    driver.get(baseUrl);
    LoginPage loginPage = page.createPage(LoginPage.class);
    loginPage.typeLogin("auto");
    loginPage.typePassword("test");
    mainPage = loginPage.clickLoginButton();
  }

  @Test
  public void testHomePageHasAHeader() {
    mainPage.clickNewButton();
    mainPage.typeFirstName("FNXXX1000");
    mainPage.typeLastName("LNXXX1000");
    mainPage.typeMiddleName("MN");
    mainPage.typeDateOfBirth("01-01-2000");
    mainPage.selectRegionLeft("Sumska");
    mainPage.selectRegionRight("Sumska");
    mainPage.selectFstLeft("Dinamo");
    mainPage.selectFstRight("Kolos");
    //mainPage.typeTrainerLeft("Tr1");
    //mainPage.typeTrainerRight("Tr2");
    mainPage.selectStyle("FW");
    mainPage.selectAge("Cadet");
    mainPage.selectYear("2017");
    mainPage.selectNoCard("No card");
    mainPage.clickSave();
    mainPage.uploadPhoto("C:\\temp\\logo.jpg");
    System.out.println();

  }
}
