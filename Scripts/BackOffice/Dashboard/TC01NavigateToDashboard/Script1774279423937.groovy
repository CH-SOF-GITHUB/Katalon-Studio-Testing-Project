import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://chakerqa-bo.playpro.fr/back-office/login')

WebUI.setViewPortSize(1280, 600)

WebUI.verifyElementText(findTestObject('BackOffice/h2_Connectez-vous'), 'Connectez-vous')

WebUI.setText(findTestObject('BackOffice/input_Connectez-vous_email'), 'bchaker28@yahoo.com')

WebUI.setText(findTestObject('BackOffice/input_Connectez-vous_password'), 'Admin1234!')

WebUI.jsClick(findTestObject('BackOffice/input_Rester connect_remember'))

WebUI.click(findTestObject('BackOffice/button_Connexion'))

// Zoom OUT
WebUI.delay(10)
//WebUI.executeJavaScript("document.body.style.zoom='80%'", null)

WebUI.verifyElementPresent(findTestObject('BackOffice/Page_Play Pro - Calendrier/span_Tableau de bord'), 5)

WebUI.click(findTestObject('BackOffice/Page_Play Pro - Calendrier/span_Tableau de bord'))

WebUI.delay(5)

def ActualURL = WebUI.getUrl()

WebUI.verifyEqual(ActualURL, 'https://chakerqa-bo.playpro.fr/back-office')

WebUI.closeBrowser()