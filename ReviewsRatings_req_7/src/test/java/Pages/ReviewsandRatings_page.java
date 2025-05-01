package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ReviewsandRatings_page {
    ChromeDriver driver;

private     By useremail = By.cssSelector("input[id=\"mat-input-0\"]");
private     By clicklogin = By.cssSelector("a[href=\"https://account.almentor.net/join?ref=header_login_button\"]");
private     By clicklog2 = By.cssSelector("button[class=\"btn btn-danger\"]");
private     By userpass = By.cssSelector("input[class=\"mat-mdc-input-element form-control ng-tns-c1205077789-2 mat-mdc-form-field-input-control mdc-text-field__input ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored\"]");
private     By clickstartloc = By.cssSelector("button[class=\"btn btn-danger btn-alm-filled w-100 ng-star-inserted\"]");
private     By ratebuttonloc = By.cssSelector("button[class=\"btn btn-link\"]");
private     By toratingloc   = By.cssSelector("button[class=\"rating__info-page-btn btn btn-danger\"]");
private     By toinstructorratingloc   = By.cssSelector("button[class=\"rating__course-page-btn btn btn-danger\"]");
private     By clickrevloc = By.cssSelector("button[class=\"rating__review-page-btn btn btn-danger ng-star-inserted\"]");
private     By toreviewsclick  = By.cssSelector("button[class=\"rating__mentor-page-btn btn btn-danger\"]");
private     By starPath = By.cssSelector("path[d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\"]");;
private     By review = By.cssSelector("textarea[class=\"feedback-textarea ng-untouched ng-pristine ng-valid\"]");



public ReviewsandRatings_page (ChromeDriver d)
{
    this.driver = d;
}

public void entemail(String EM)
{
    driver.findElement(useremail).sendKeys(EM);
}

public void Clicklog()
{
    driver.findElement(clicklogin).click();
}

public void clicklogin2()
{
    driver.findElement(clicklog2).click();
}
public void entpassword(String PW){
        driver.findElement(userpass).sendKeys(PW);
}
public void clickstart(){

    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    Wait.until(ExpectedConditions.presenceOfElementLocated(clickstartloc));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",driver.findElement(clickstartloc));

}
public void clickrate()
{
    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    Wait.until(ExpectedConditions.presenceOfElementLocated(ratebuttonloc));
    driver.findElement(ratebuttonloc).click();
}
public void clicktorating()
{
    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    Wait.until(ExpectedConditions.presenceOfElementLocated(toratingloc));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",driver.findElement(toratingloc));
}
public void clickstar1()
{
    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Wait.until(ExpectedConditions.presenceOfElementLocated(starPath));
    driver.findElement(starPath).click();
}
public void clicknextrating()
{
    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Wait.until(ExpectedConditions.presenceOfElementLocated(toinstructorratingloc));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",driver.findElement(toinstructorratingloc));
}
public void clicknextreviews() {
    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Wait.until(ExpectedConditions.presenceOfElementLocated(toreviewsclick));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", driver.findElement(toreviewsclick));
}
public void editreview(String R)
{
    driver.findElement(review).sendKeys(R);
}
public void clicksendrev()
{
    WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Wait.until(ExpectedConditions.presenceOfElementLocated(clickrevloc));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", driver.findElement(clickrevloc));
}
}

