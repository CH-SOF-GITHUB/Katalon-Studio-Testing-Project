import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// define some variables
String LoginUrl = 'https://chaker-qa-playpro-bo.playpro.fr/back-office/login'
// open the browser
WebUI.openBrowser('')
// maximize the browser
WebUI.maximizeWindow()
// navigate to specific Login Page
WebUI.navigateToUrl(LoginUrl)
// set email
WebUI.setText(findTestObject('BackOffice/input_Connectez-vous_email'), 'adminqabo@yopmail.com')
// set password
WebUI.setEncryptedText(findTestObject('BackOffice/input_Connectez-vous_password'), 'RAIVpflpDOg=')
// click in connect remember radio btn
WebUI.jsClick(findTestObject('BackOffice/input_Rester connect_remember'))
// click on Login btn
WebUI.click(findTestObject('BackOffice/button_Connexion'))
// Get Current URL
String CurrentURL = WebUI.getUrl()
WebUI.verifyEqual(CurrentURL, 'https://chaker-qa-playpro-bo.playpro.fr/back-office/planning')
// close the browser
WebUI.closeBrowser()