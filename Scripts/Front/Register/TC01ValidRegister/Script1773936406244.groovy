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

WebUI.navigateToUrl('https://chakerqa.playpro.fr/connexion')

WebUI.jsClick(findTestObject('Cookies/button_Accepter'))

WebUI.verifyTextPresent('Créer un compte', true)

WebUI.jsClick(findTestObject('FO_Register/Page_/div_Genre_w-4 h-4 rounded-full border-2 bor_3a932d'))

WebUI.setText(findTestObject('FO_Register/Page_/input__lastName'), 'Ben Said')

WebUI.setText(findTestObject('FO_Register/Page_/input__firstName'), 'Chaker')

WebUI.setText(findTestObject('FO_Register/Page_/input__email'), 'chemail01@gmail.com')

WebUI.setText(findTestObject('FO_Register/Page_/input_Phone_form-control'), '23400813')

WebUI.jsClick(findTestObject('FO_Register/Page_/button_Date de naissance_MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'))

WebUI.click(findTestObject('FO_Register/Page_/button_dcembre 2008_MuiButtonBase-root MuiI_97aa22'))

WebUI.jsClick(findTestObject('FO_Register/Page_/button_1992'))

WebUI.jsClick(findTestObject('FO_Register/Page_/button_Date de naissance_MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'))

WebUI.jsClick(findTestObject('FO_Register/Page_/button_dcembre 1992_MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium MuiPickersArrowSwitcher-button css-11wxb'))

WebUI.jsClick(findTestObject('FO_Register/Page_/button_dcembre 1992_MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium MuiPickersArrowSwitcher-button css-11wxb'))

WebUI.jsClick(findTestObject('FO_Register/Page_/button_dcembre 1992_MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium MuiPickersArrowSwitcher-button css-11wxb'))

WebUI.jsClick(findTestObject('FO_Register/Page_/button_dcembre 1992_MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium MuiPickersArrowSwitcher-button css-11wxb'))

WebUI.jsClick(findTestObject('FO_Register/Page_/button_dcembre 1992_MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium MuiPickersArrowSwitcher-button css-11wxb'))

WebUI.jsClick(findTestObject('FO_Register/Page_/button_dcembre 1992_MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium MuiPickersArrowSwitcher-button css-11wxb'))

WebUI.jsClick(findTestObject('FO_Register/Page_/button_dcembre 1992_MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium MuiPickersArrowSwitcher-button css-11wxb'))

WebUI.jsClick(findTestObject('FO_Register/Page_/button_7'))

WebUI.setEncryptedText(findTestObject('FO_Register/Page_/input__password'), 'RDAtjhC4TWOTC3gnwOH4dQ==')

WebUI.jsClick(findTestObject('FO_Register/Page_/span__relative flex items-center justify-center        rounded-full cursor-pointer        transition-all duration-200        bg-white border border-black        w-5 h-5 p-2'))

WebUI.jsClick(findTestObject('FO_Register/Page_/span_Politique de confidentialit_relative f_e217b0'))

WebUI.click(findTestObject('FO_Register/Page_/button_Crer mon compte'))

WebUI.verifyTextPresent('Bienvenue ! Votre compte est activé.', true)

String ActualURL = WebUI.getUrl()

WebUI.verifyEqual(ActualURL, 'https://chakerqa.playpro.fr')

