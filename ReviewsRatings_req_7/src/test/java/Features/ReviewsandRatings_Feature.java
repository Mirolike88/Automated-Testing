package Features;
import Pages.ReviewsandRatings_Assert_page;
import Pages.ReviewsandRatings_page;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ReviewsandRatings_Feature {
    ChromeDriver Driver = new ChromeDriver();
    ReviewsandRatings_page RRP;
    ReviewsandRatings_Assert_page RPA;
    @BeforeMethod
    void Setup()
    {
        RRP = new ReviewsandRatings_page(Driver);
        RPA = new ReviewsandRatings_Assert_page(Driver);
        Driver.get("https://app.almentor.net/viewer/Cleopatra-The-Truth-Revealed?orderId=20250430201247294616");
    }

    @Test (priority = 0)
    void login() throws InterruptedException
    {
        RRP.Clicklog();
        RRP.entemail("mmm13579114@gmail.com");
        RRP.clicklogin2();
        Thread.sleep(3000);
        RRP.entpassword("Testforal12345");
        RRP.clicklogin2();
        RRP.clickstart();

    }
    @Test (priority = 1)
    void TC_01()
    {
        RPA.checkratebutton();
    }

    @Test (priority = 2)
    void TC_02()
    {
        RRP.clickrate();
        RPA.checkrateclick();
    }
    @Test (priority = 3)
    void TC_03_Negative()
    {
        Driver.get("https://app.almentor.net/courses/Content-Marketing-&-Digital-Copy-Writing");
        RPA.checkrateclicknegative();
    }
    @Test (priority = 4)
    void TC_04()
    {
        RRP.clickrate();
        RRP.clicktorating();
        RPA.checkratingscale();
    }
    @Test (priority = 5)
    void TC_05()
    {
        RRP.clickrate();
        RRP.clicktorating();
        RRP.clickstar1();
        RRP.clicknextrating();
        RRP.clickstar1();
        RRP.clicknextreviews();
        RPA.checkreview();
    }
    @Test (priority = 6)
    void TC_06()
    {
        RRP.clickrate();
        RRP.clicktorating();
        RPA.checkrating();
    }
    @Test (priority = 7)
    void TC_07()
    {
        RPA.checkreview();
    }

    @Test (priority = 8)
    void Buildfor_TC_8_9()
    {
        RRP.clickrate();
        RRP.clicktorating();
        RRP.clickstar1();
        RRP.clicknextrating();
        RRP.clickstar1();
        RRP.clicknextreviews();
        RRP.editreview("Great Teacher");
        RRP.clicksendrev();

    }

    @Test (priority = 9)
    void TC_08()
    {
        RRP.clickrate();
        RPA.checkrating();
    }


    @Test (priority = 10)
    void TC_09()
    {
        RRP.clickrate();
        RRP.clicknextrating();
        RRP.clicknextreviews();
        RRP.editreview("Great Teacher");
        RRP.clicksendrev();
        RPA.checkratebutton();
    }
    @Test (priority = 11)
    void TC_10()
    {
        RPA.checkclicknext();
    }

    @AfterMethod
    void end() throws InterruptedException
    {
        Thread.sleep(2000);
    }
    @AfterTest
    void Finished()
    {
    Driver.close();
    }
















}
