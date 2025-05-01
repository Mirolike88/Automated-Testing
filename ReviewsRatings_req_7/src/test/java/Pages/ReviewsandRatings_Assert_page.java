package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ReviewsandRatings_Assert_page {
    ChromeDriver driver;

private By ratebutton = By.cssSelector("button[class=\"btn btn-link\"]");
private By exitloc = By.cssSelector("button[class=\"btn btn-outline-light\"]");
private By X_loc = By.cssSelector("button[class=\"btn-alm-close\"]");
public  By Starrate = By.cssSelector("svg[class=\"bi bi-star-fill ng-star-inserted\"]");
private By reviewloc = By.cssSelector("textarea[class=\"feedback-textarea ng-untouched ng-pristine ng-valid\"]");
private By toinstructorratingloc = By.cssSelector("button[class=\"rating__course-page-btn btn btn-danger\"]");
private By star = By.cssSelector("path[d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\"]");



//public  By Starrate5 = By.cssSelector("svg[class=\"bi bi-star-fill ng-star-inserted\"]");



public ReviewsandRatings_Assert_page (ChromeDriver d)
    {
        this.driver = d;
    }

public void checkratebutton() {
    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Wait.until(ExpectedConditions.presenceOfElementLocated(exitloc));
    boolean  R = driver.findElement(ratebutton).isDisplayed();
    Assert.assertTrue(R);

}
public void checkrateclick() {
    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Wait.until(ExpectedConditions.presenceOfElementLocated(X_loc));
    boolean X = driver.findElement(X_loc).isDisplayed();
    Assert.assertTrue(X);
}
public void checkrateclicknegative()
{
        //WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Wait.until(ExpectedConditions.presenceOfElementLocated(X_loc));
        boolean X = driver.findElements(X_loc).isEmpty();
        Assert.assertTrue(X);
}
public void checkratingscale()
{
    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    Wait.until(ExpectedConditions.presenceOfElementLocated(Starrate));
    List<WebElement> elements = driver.findElements(Starrate);
    int count = elements.size();
    int expectedCount = 5;
    boolean isCountCorrect = (count == expectedCount);
    Assert.assertTrue(isCountCorrect);

}
public void checkrating()
{
    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    Wait.until(ExpectedConditions.presenceOfElementLocated(star));
    boolean rate = driver.findElement(star).isEnabled();
    Assert.assertTrue(rate);
}

public void checkreview()
{
    boolean review = driver.findElement(reviewloc).isDisplayed();
    Assert.assertTrue(review);
}
public void checkclicknext()
{
    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(6));
    Wait.until(ExpectedConditions.presenceOfElementLocated(toinstructorratingloc));
    boolean next = driver.findElement(toinstructorratingloc).isDisplayed();
    Assert.assertTrue(next);
}
}
