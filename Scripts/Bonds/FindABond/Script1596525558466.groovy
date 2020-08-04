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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Open Browser'
WebUI.openBrowser('')

'Passing URL globally'
WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'Passing username globally'
WebUI.setText(findTestObject('Login Page/Username'), GlobalVariable.UN)

'Passing password globally'
WebUI.setText(findTestObject('Login Page/Password'), GlobalVariable.PW)

'Click on agree button'
WebUI.click(findTestObject('Login Page/Agree Btn'))

'Verifying text on home'
WebUI.verifyElementText(findTestObject('HomePage/Welcome_Text'), 'Welcome Great American Staff!')

WebUI.click(findTestObject('LeftMenu/Commercial bonds left menu'))

WebUI.click(findTestObject('LeftMenu/Bonds'))

WebUI.click(findTestObject('LeftMenu/FindABond'))

WebUI.selectOptionByLabel(findTestObject('Find A bond/Bond No DD'), 'Bond Number', false)

WebUI.setText(findTestObject('Find A bond/Bond Number Input'), '1697178')

WebUI.click(findTestObject('Find A bond/Submit Btn'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('View Bond/ViewBondText'), 'View Bond')

WebUI.click(findTestObject('View Bond/ExitBondBtn'))

WebUI.verifyElementText(findTestObject('HomePage/Welcome_Text'), 'Welcome Great American Staff!')

WebUI.click(findTestObject('LeftMenu/Logout'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

