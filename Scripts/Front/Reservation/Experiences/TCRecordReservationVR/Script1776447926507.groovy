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

WebUI.navigateToUrl('https://demotenant.playpro.fr/connexion')

WebUI.click(findTestObject('Reservation/Page_/button_Accepter'))

WebUI.setText(findTestObject('Reservation/Page_/input_Adresse email'), 'demotenant1@yopmail.com')

WebUI.click(findTestObject('Reservation/Page_/input_Mot de passe'))

WebUI.setEncryptedText(findTestObject('Reservation/Page_/input_Mot de passe'), '/5S6MFFLcE6Z1YMqKBaTSw==')

WebUI.click(findTestObject('Reservation/Page_/button_Me connecter'))

WebUI.click(findTestObject('Reservation/Page_DEMO TENANT/a_Rserver'))

WebUI.click(findTestObject('Reservation/Page_BOOKING PLAYPRO/div_Rserver'))

WebUI.click(findTestObject('Reservation/Page_Vr Party Test/div_Veuillez slectionner'))

WebUI.click(findTestObject('Reservation/Page_Vr Party Test/button_4 personnes'))

WebUI.click(findTestObject('Reservation/Page_Vr Party Test/span_Slectionner une formule'))

WebUI.click(findTestObject('Reservation/Page_Vr Party Test/button_4 personnes'))

WebUI.click(findTestObject('Reservation/Page_Vr Party Test/button_Continuer'))

WebUI.click(findTestObject('Reservation/Page_Vr Party Test/button_20_00438'))

WebUI.click(findTestObject('Reservation/Page_Vr Party Test/span_Soit 109.5_pers'))

WebUI.click(findTestObject('Reservation/Page_Vr Party Test/button_Continuer'))

WebUI.click(findTestObject('Reservation/Page_Paiement scuris/span_md_w-5 w-4 md_h-5 h-4 border-2 border-black'))

WebUI.click(findTestObject('Reservation/Page_Paiement scuris/button_Payer maintenant'))

WebUI.click(findTestObject('Reservation/Page_Paiement scuris/p_Merci pour votre rservation'))

