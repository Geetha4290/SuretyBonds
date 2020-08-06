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

'Click on commercial bonds on left menu'
WebUI.click(findTestObject('LeftMenu/Commercial bonds left menu'))

'Click on bonds on left menu'
WebUI.click(findTestObject('LeftMenu/Bonds'))

'click on find a bond on left menu'
WebUI.click(findTestObject('LeftMenu/FindABond'))

'Verifying drop down is having default value'
WebUI.selectOptionByLabel(findTestObject('Find A bond/Bond No DD'), 'Bond Number', false)

'Giving bond number'
WebUI.setText(findTestObject('Find A bond/Bond Number Input'), '1697178')

'Click on submit button'
WebUI.click(findTestObject('Find A bond/Submit Btn'))

'Accepting alert to view the bond'
WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('e-SURETY ... Surety Bonds Online')

'Validating Bond Number text'
WebUI.verifyElementText(findTestObject('View Bond/BondNumberTxtVal'), 'Bond Number:')

'Validating Bond Number'
WebUI.verifyElementText(findTestObject('Object Repository/View Bond/BondNumber'), '1697178')

