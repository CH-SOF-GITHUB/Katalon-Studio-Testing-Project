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

WebUI.openBrowser('https://demotenant.playpro.fr/connexion')

WebUI.maximizeWindow()

WebUI.jsClick(findTestObject('Cookies/button_Accepter'))

WebUI.verifyTextPresent('Connexion', false)

WebUI.setText(findTestObject('FO_Login/input__email'), 'demotenant2@yopmail.com')

WebUI.setText(findTestObject('FO_Login/input__password'), 'Admin1234!')

WebUI.click(findTestObject('FO_Login/button_Me connecter'))

WebUI.verifyElementPresent(findTestObject('PageObjects/Profil-Icon-Navbar'), 15)

WebUI.delay(5)

def ActualURL = WebUI.getUrl()

WebUI.verifyEqual(ActualURL, 'https://demotenant.playpro.fr/')

WebUI.closeBrowser()

