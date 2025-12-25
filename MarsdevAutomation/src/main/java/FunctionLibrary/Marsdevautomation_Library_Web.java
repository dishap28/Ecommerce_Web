package FunctionLibrary;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import Base.drivermanager;


public class Marsdevautomation_Library_Web {

    WebDriver driver_Web;
    Properties prop;

    public Marsdevautomation_Library_Web(Properties prop) {
        this.driver_Web = drivermanager.getDriver();
        this.prop = prop;
    }
    public void cfnApp_Launch(String mstrURL) throws Exception {
		driver_Web.manage().window().maximize();
		driver_Web.get(mstrURL);
		driver_Web.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

  

    public boolean CfnToValidate_SignInLoginField() {
        try {
        	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver_Web, 30);
            wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("SignIn_in_Header"))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void CfnToClicked_SignInLoginField() {
    	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver_Web, 5);
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("SignIn_in_Header"))));
        ele.click();
    }
    public boolean CfnToValidate_EmailidField() {
        try {
        	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver_Web, 30);
            wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("email_id"))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void Enter_Emailid(String EmailId) {
    	WebDriverWait wait = new WebDriverWait(driver_Web, 5);
		WebElement obj1 = wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("email_id"))));
			obj1.sendKeys(EmailId);
		}
    public boolean CfnToValidate_PasswordField() {
        try {
        	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver_Web, 30);
            wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("Password"))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void Enter_Password(String Passs) {
    	WebDriverWait wait = new WebDriverWait(driver_Web, 5);
		WebElement obj1 = wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("Password"))));
			obj1.sendKeys(Passs);
		}
    public boolean CfnToValidate_LoginCTA() {
        try {
        	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver_Web, 30);
            wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("LoginCTA"))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void CfnToClicked_LoginField() {
    	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver_Web, 5);
    	Actions a = new Actions(driver_Web);
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("LoginCTA"))));
        a.moveToElement(ele).click().build().perform();
    }
    public boolean CfnToValidate_cartField_Onhomepage() {
        try {
        	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver_Web, 30);
            wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("CartCTA"))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void CfnToClicked_cartField_Onhomepage() {
    	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver_Web, 5);
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("CartCTA"))));
        ele.click();
    }
    public boolean CfnToValidate_ClickherecartField_Onhomepage() {
        try {
        	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver_Web, 30);
            wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("ClickhereCTA"))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void CfnToClicked_clickherecartField_Onhomepage() {
    	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver_Web, 5);
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("ClickhereCTA"))));
        ele.click();
    }
    public void Scroll_onCartPage() throws Exception {
		driver_Web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver_Web;
		WebDriverWait wait = new WebDriverWait(driver_Web, 5);
		WebElement obj1 = wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("Scroll"))));
		js.executeScript("arguments[0].scrollIntoView();", obj1);
	}
    public boolean CfnToValidate_productSelect_OnCartpage(String ProductFrom_Excel,String Price) {
        try {
            WebDriverWait wait = new WebDriverWait(driver_Web, 30);
            wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("product_Selection") + ProductFrom_Excel +prop.getProperty("product_Selection_Rema") + Price +prop.getProperty("product_Selection_Rema_Price"))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

	
    public void ClickOn_productSelect_OnCartpage(String ProductFrom_Excel, String Price) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver_Web, 10);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(cfnInvokeObject_Web(prop.getProperty("AddToCart") + ProductFrom_Excel +prop.getProperty("AddToCart_Rem") + Price +prop.getProperty("AddToCart_CTA"))));
        JavascriptExecutor js = (JavascriptExecutor) driver_Web;
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", ele);
        js.executeScript("arguments[0].click();", ele);
    }
    public boolean CfnToValidate_AddtoCartSuccess_PopUp() {
        try {
        	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver_Web, 30);
			WebElement successMsg =wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("Popup_Validation"))));
            return successMsg.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean CfnToValidatet_ViewCartcta() {
        try {
        	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver_Web, 30);
            wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("View_Cart"))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void CfnToClicked_ViewCart(){
    	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver_Web, 5);
    	Actions a = new Actions(driver_Web);
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("View_Cart"))));
        a.moveToElement(ele).click().build().perform();
    }
    public boolean CfnToValidate_productVerification_OnCartpage(String ProductFrom_Excel) {
        try {
            WebDriverWait wait = new WebDriverWait(driver_Web, 30);
            wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("Product_Verification") + ProductFrom_Excel +prop.getProperty("Product_Verification_Rem"))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean CfnToValidatet_ProceedtocheckoutCTA() {
        try {
        	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver_Web, 30);
            wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("ProceddTo_Checkout"))));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void CfnToClickon_ProceedtocheckoutCTA(){
    	driver_Web.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver_Web, 5);
    	Actions a = new Actions(driver_Web);
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("ProceddTo_Checkout"))));
        a.moveToElement(ele).click().build().perform();
    }
    
    public String Validateuserdetails_OnCheckoutPage() {
		WebDriverWait wait = new WebDriverWait(driver_Web, 5);
        WebElement obj1  = wait.until(ExpectedConditions.elementToBeClickable(cfnInvokeObject_Web(prop.getProperty("ProceddTo_Checkout"))));
        String userdetails = obj1.getText();
		return userdetails;
	}
 // Locator details
 	public WebElement cfnInvokeObject_Web(String mstrObjectDescription) {
 		WebElement element = null;
 		String[] objProperty = mstrObjectDescription.split("\\|\\|");
 		if (objProperty[0].equalsIgnoreCase("name")) {
 			element = driver_Web.findElement(By.name(objProperty[1]));
 		}
 		if (objProperty[0].equalsIgnoreCase("linktext")) {
 			element = driver_Web.findElement(By.linkText(objProperty[1]));
 		}
 		if (objProperty[0].equalsIgnoreCase("id")) {
 			element = driver_Web.findElement(By.id(objProperty[1]));
 		}
 		if (objProperty[0].equalsIgnoreCase("tagname")) {
 			element = driver_Web.findElement(By.tagName(objProperty[1]));
 		}
 		if (objProperty[0].equalsIgnoreCase("partiallinktext")) {
 			element = driver_Web.findElement(By.partialLinkText(objProperty[1]));
 		}
 		if (objProperty[0].equalsIgnoreCase("classname")) {
 			element = driver_Web.findElement(By.className(objProperty[1]));
 		}
 		if (objProperty[0].equalsIgnoreCase("xpath")) {
 			element = driver_Web.findElement(By.xpath(objProperty[1]));
 		}
 		if (objProperty[0].equalsIgnoreCase("cssselector")) {
 			element = driver_Web.findElement(By.cssSelector(objProperty[1]));
 		}
 		return element;
 	}
}