package TestScripts_Web;
//author : disha pise
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.DataFormatter;

import org.testng.annotations.Test;

import Base.drivermanager;
import FunctionLibrary.Marsdevautomation_Library_Web;

public class TC_Happy_Flow_Till_Marsdevautomation {
//	private Marsdevautomation_Library_Web objFUNLIB_Web;
	@Test
	public void automationExercise() throws Exception {

		drivermanager.launchBrowser();
        System.out.println("browser launch");
		Properties configProp = new Properties();
		FileInputStream configFis = new FileInputStream("src/main/java/config/config.properties");
		configProp.load(configFis);

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/java/ObjectRepository/Web_OR.properties");
		prop.load(fis);
		String appUrl = configProp.getProperty("url");
		drivermanager.getDriver().get(appUrl);

		Marsdevautomation_Library_Web objFUNLIB_Web = new Marsdevautomation_Library_Web(prop);
		FileInputStream TestDataFile = new FileInputStream("src/main/resources/TestData/TestData.xlsx");
		DataFormatter format = new DataFormatter();
		Workbook TestWorkBook = new XSSFWorkbook(TestDataFile);
		Sheet inputSheet = TestWorkBook.getSheet("TestData");
		// Row InputDataRow = inputSheet.getRow(1);

		// int rowCount = inputSheet.getLastRowNum() - inputSheet.getFirstRowNum();
		// for (int i = 1; i <= rowCount; i++) {
		Row Test_Data = inputSheet.getRow(1);
		String email = format.formatCellValue(Test_Data.getCell(0));
		String pass = format.formatCellValue(Test_Data.getCell(1));
		String ProductName_FromExcel = format.formatCellValue(Test_Data.getCell(2));
		String Price_FromExcel = format.formatCellValue(Test_Data.getCell(3));

		boolean CfnToValidate_SignInLoginField = objFUNLIB_Web.CfnToValidate_SignInLoginField();
		if (CfnToValidate_SignInLoginField) {
			System.out.println("Able to View Signin/Login Button on Home Page");

			objFUNLIB_Web.CfnToClicked_SignInLoginField();
			System.out.println("Clicked on Signin/Login Button on Home Page");

			boolean CfnToValidate_EmailidField = objFUNLIB_Web.CfnToValidate_EmailidField();
			if (CfnToValidate_EmailidField) {
				System.out.println("Able to validate email id field");

				objFUNLIB_Web.Enter_Emailid(email);
				System.out.println("Enter email id : " + email);

				boolean CfnToValidate_PasswordField = objFUNLIB_Web.CfnToValidate_PasswordField();
				if (CfnToValidate_PasswordField) {
					System.out.println("Able to validate Password field");

					objFUNLIB_Web.Enter_Password(pass);
					System.out.println("Enter Password in password field");

					boolean CfnToValidate_LoginCTA = objFUNLIB_Web.CfnToValidate_LoginCTA();
					if (CfnToValidate_LoginCTA) {
						System.out.println("Able to validate Login CTA");

						objFUNLIB_Web.CfnToClicked_LoginField();
						System.out.println("Able to Click on Login CTA and Login Successfull");

						boolean CfnToValidate_cartField_Onhomepage = objFUNLIB_Web.CfnToValidate_cartField_Onhomepage();
						if (CfnToValidate_cartField_Onhomepage) {
							System.out.println("Able to validate Cart CTA on home page");

							objFUNLIB_Web.CfnToClicked_cartField_Onhomepage();
							System.out.println("Able to Click on Cart CTA on home page");

							boolean CfnToValidate_ClickherecartField_Onhomepage = objFUNLIB_Web
									.CfnToValidate_ClickherecartField_Onhomepage();
							if (CfnToValidate_ClickherecartField_Onhomepage) {
								System.out.println("Able to Validate 'Click here' CTA on Cart page");

								objFUNLIB_Web.CfnToClicked_clickherecartField_Onhomepage();
								System.out.println("Able to click on 'Click here' CTA on Cart page");

//									Thread.sleep(6000);
//									objFUNLIB_Web.Scroll_onCartPage();
//									System.out.println("Able to Scroll Page to Click on Cart CTA on home page");

								boolean CfnToValidate_productSelect_OnCartpage = objFUNLIB_Web.CfnToValidate_productSelect_OnCartpage(ProductName_FromExcel, Price_FromExcel);
								if (CfnToValidate_productSelect_OnCartpage) {
									System.out.println("Able to validate Product " + ProductName_FromExcel+ " and price is : " + Price_FromExcel + "");

									objFUNLIB_Web.ClickOn_productSelect_OnCartpage(ProductName_FromExcel,Price_FromExcel);
									System.out.println("Able to Add to Cart item name : " + ProductName_FromExcel+ " and price is : " + Price_FromExcel + "");

									boolean CfnToValidate_AddtoCartSuccess_PopUp = objFUNLIB_Web.CfnToValidate_AddtoCartSuccess_PopUp();
									if (CfnToValidate_AddtoCartSuccess_PopUp) {
										System.out.println("Able to validate 'Successfully added product into the Cart' PopUp is displayed");

										boolean CfnToValidatet_ViewCartcta = objFUNLIB_Web.CfnToValidatet_ViewCartcta();
										if (CfnToValidatet_ViewCartcta) {
											System.out.println("Able to Validate 'View Cart' CTA");

											objFUNLIB_Web.CfnToClicked_ViewCart();
											System.out.println("Able to Click on 'View Cart' CTA");

											boolean CfnToValidate_productVerification_OnCartpage = objFUNLIB_Web.CfnToValidate_productVerification_OnCartpage(ProductName_FromExcel);
											if (CfnToValidate_productVerification_OnCartpage) {
												System.out.println("Able to validate Selected product : " + ProductName_FromExcel);

												boolean CfnToValidatet_ProceedtocheckoutCTA = objFUNLIB_Web.CfnToValidatet_ProceedtocheckoutCTA();
												if (CfnToValidatet_ProceedtocheckoutCTA) {
													System.out.println("Able to Validate 'Proceed to checkout' CTA");

													objFUNLIB_Web.CfnToClickon_ProceedtocheckoutCTA();
													System.out.println("Able to Click on 'Proceed to checkout' CTA");

													objFUNLIB_Web.Validateuserdetails_OnCheckoutPage();
													System.out.println("Able to Validate All details of user on details page");

												} else {
													System.out.println("Unable to Validate 'Proceed to checkout' CTA");
												}
											} else {
												System.out.println("Unable to validate Selected product : " +ProductName_FromExcel);
											}
										} else {
											System.out.println("Unable to validate email id field");
										}
									} else {
										System.out.println("Unable to validate 'Successfully added product into the Cart' PopUp is displayed");
									}
								} else {
									System.out.println("Unable to validate Product : "+ ProductName_FromExcel+ " and price is : " + Price_FromExcel + "");
								}
							} else {
								System.out.println("Unable to Validate 'Click here' CTA on Cart page");
							}
						} else {
							System.out.println("Unable to validate Cart CTA on home page");
						}
					} else {
						System.out.println("Unable to validate Login CTA");
					}

				} else {
					System.out.println("Unable to validate Password field");
				}
			} else {
				System.out.println("Unable to validate email id field");
			}
		} else {
			System.out.println("Unable to View Signin/Login Button on Home Page");
		}

		// drivermanager.quitBrowser();
	}
}